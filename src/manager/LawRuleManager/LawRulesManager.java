package manager.LawRuleManager;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LawRulesManager {
    private final List<Article> articleArrayList = new ArrayList<>();
    private Article currentArticle;
    private Part currentPart;
    private Paragraph currentParagraph;
    private LineType previousLineType = LineType.ARTICLE;

    public void initializeCriminalCode() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/CriminalCode.txt")); // считываем все строки из файла по очереди
            for (int i = 1; i < lines.size(); i++) {
                if (lines.get(i).length() > 1 && lines.size() > (i + 1)) {
                    if (!chooseType(lines.get(i)).equals(LineType.ERROR)) {
                        recognize(lines.get(i));
                    }
                }
            }
            articleArrayList.add(currentArticle); // добавляем статью в кодекс в конце процедуры
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void recognize(String line) { // распознавание
        LineType currentLineType = chooseType(line);
        if (currentLineType.equals(LineType.ARTICLE)) {
            if (previousLineType != null) {
                addArticle(); // статья добавляется только в начале распознавания следующей статьи в кодекс или по завершении всей процедуры
            }
            recognizeArticle(line);
        } else if (currentLineType.equals(LineType.PART)) { // добавление части
            addPart(); // добавление предыдущей части перед распознаванием следующей
            if (previousLineType.equals(LineType.NOTE)) { // исключение ошибочного распознавания примечания как части
                return;
            }
            recognizePart(line);
        } else if (currentLineType.equals(LineType.PARAGRAPH)) {
            addParagraph(); // добавление параграфа перед распознаванием предыдущего
            recognizeParagraph(line);
        } else if (currentLineType.equals(LineType.NOTE)) {
            addPart(); // при обнаружении примечания - добавить часть
        }
        previousLineType = currentLineType;
    }

    private void addParagraph() {
        if (currentParagraph != null) {
            currentPart.paragraphs.add(currentParagraph);
        }
        currentParagraph = null; // обнуление значения после добавления распознанного параграфа
    }

    private void addPart() {
        addParagraph();
        if (currentPart != null) {
            currentArticle.parts.add(currentPart);
        }
        currentPart = null; // обнуление значения после добавления распознанной части
    }

    private void addArticle() {
        addPart();
        if (currentArticle != null) {
            articleArrayList.add(currentArticle);
        }
        currentArticle = null; // обнуление значения после добавления
    }

    private LineType chooseType(String line) { // распознавание следующей строки
        if (line.length() < 1) {
            return LineType.ERROR;
        }
        if (line.startsWith("Статья")) {
            return LineType.ARTICLE;
        } else if (Character.isDigit(line.charAt(0)) && line.charAt(1) == '.') {
            return LineType.PART;
        } else if (Character.isLetter(line.charAt(0)) && line.charAt(1) == ')' || Character.isLetter(line.charAt(0)) && line.charAt(1) == '.') {
            return LineType.PARAGRAPH;
        } else if (line.startsWith("Примечани")) {
            return LineType.NOTE;
        }
        return LineType.ERROR;
    }

    private void recognizeArticle(String line) {
        Article article = new Article();
        if (line.charAt(11) == ' ') {
            article.setNumber(line.substring(7, 10));
            article.setDescription(cutDescription(line.substring(11)));
        } else if (Character.isDigit(line.charAt(11))) {
            article.setNumber(line.substring(7, 12));
            article.setDescription(cutDescription(line.substring(13)));
        }
        currentArticle = article;
    }

    private void recognizePart(String line) {
        Part part = new Part();
        if (Character.isDigit(line.charAt(0)) && line.charAt(1) == '.' && line.charAt(2) == ' ') {
            part.setNumber(line.substring(0, 1));
            part.setDescription(cutDescription(line.substring(3)));
        } else if (Character.isDigit(line.charAt(0)) && line.charAt(1) == '.' && Character.isDigit(line.charAt(2)) && line.charAt(3) == '.') {
            part.setNumber(line.substring(0, 3));
            part.setDescription(cutDescription(line.substring(5)));
        }
        currentPart = part;
    }

    private void recognizeParagraph(String line) { // распознавание параграфа
        Paragraph paragraph = new Paragraph();
        if (Character.isLetter(line.charAt(0)) && line.charAt(1) == ')') {
            paragraph.setNumber(line.substring(0, 1));
            paragraph.setDescription(cutDescription(line.substring(3)));
        } else if (Character.isLetter(line.charAt(0)) && line.charAt(1) == '.') {
            paragraph.setNumber(line.substring(0, 3));
            paragraph.setDescription(cutDescription(line.substring(5)));
        }
        currentParagraph = paragraph;
    }


    private String cutDescription(String description) {
        if (description.endsWith(";")) {
            return description.substring(0, description.length() - 1);
        } else if (description.endsWith(", -")) {
            return description.substring(0, description.length() - 3);
        } else if (description.endsWith(" -")) {
            return description.substring(0, description.length() - 2);
        } else {
            return description;
        }

    }

    public List<Article> getArticleArrayList() {
        return articleArrayList;
    }

    public Article getCurrentArticle() {
        currentArticle = null;
        currentPart = null;
        List<Paragraph> paragraphs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String number = "";
        System.out.println("Введите номер статьи");
        while (true) {
            if (scanner.hasNext()) {
                number = scanner.nextLine();
                for (Article article : getArticleArrayList()) {
                    if (article.getNumber().equals(number)) {
                        currentArticle = article;
                        System.out.println("Выбрана статья № " + currentArticle.getNumber());
                        break;
                    }
                    if (number.equals("0")) {
                        System.out.println("Выход");
                        break;
                    }
                }
                if (!currentArticle.equals(null) || number.equals("0")) {
                    break;
                } else {
                    System.out.println("Статья не найдена, повторите ввод, для выхода введите 0");
                }
                }
            }


            if (!currentArticle.equals(null) && !currentArticle.getParts().isEmpty()) {
                System.out.println("Введите номер части выбранной статьи");
                scanner = new Scanner(System.in);
                if (scanner.hasNext()) {
                    number = scanner.nextLine();
                    for (Part part : currentArticle.getParts()) {
                        if (part.getNumber().equals(number)) {
                            currentPart = part;

                            break;
                        }
                    }
                }
            }

            if (!currentPart.getParagraphs().equals(null) && !currentPart.getParagraphs().isEmpty()) {
                System.out.println("Введите пункт выбранной части");
                scanner = new Scanner(System.in);

                if (scanner.hasNext()) {

                    while (number != "0") {
                        number = scanner.nextLine();
                        for (Paragraph paragraph : currentPart.getParagraphs()) {
                            if (paragraph.getNumber().equals(number)) {
                                paragraphs.add(paragraph);
                                System.out.println("Введите следующий пункт, если выбор параграфов закончен - введите 0");
                            }
                        }
                    }
                }

            }
            scanner.close();
            currentPart.setParagraphs(paragraphs);
            currentArticle.setParts(currentPart);
            return currentArticle;
        }

    }


