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
                        readLine(lines.get(i));
                    }
                }
            }
            articleArrayList.add(currentArticle); // добавляем статью в кодекс в конце процедуры
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Article art : articleArrayList) {
            System.out.println(art);
        }
    }

    private void readLine(String line) { // распознавание
        LineType currentLineType = chooseType(line);
        if (currentLineType.equals(LineType.ARTICLE)) {
            if (previousLineType != null) {
                addArticle(); // статья добавляется только в начале распознавания следующей статьи в кодекс или по завершении всей процедуры
            }
            currentArticle = new Article();
            currentArticle = currentArticle.recognize(line);
        } else if (currentLineType.equals(LineType.PART)) { // добавление части
            addPart(); // добавление предыдущей части перед распознаванием следующей
            if (previousLineType.equals(LineType.NOTE)) { // исключение ошибочного распознавания примечания как части
                return;
            }
            currentPart = new Part();
            currentPart = currentPart.recognize(line);
        } else if (currentLineType.equals(LineType.PARAGRAPH)) {
            addParagraph(); // добавление параграфа перед распознаванием предыдущего
            currentParagraph = new Paragraph();
            currentParagraph = currentParagraph.recognize(line);
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
            currentArticle.setParts(currentPart);
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

    public List<Article> getArticleArrayList() {
        return articleArrayList;
    }

    public void chooseArticle() {
        String number = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер статьи");
        if (scanner.hasNext()) {
            number = scanner.nextLine();
            for (Article article : getArticleArrayList()) {
                if (article.getNumber().equals(number)) {
                    System.out.println("Выбрана статья № " + article.getNumber());
                    currentArticle = article;
                    if(!currentArticle.getParts().isEmpty()){
                        choosePart();
                        System.out.println("Выбрана статья № " + currentArticle.getNumber() + " часть " + currentArticle.getPart().getNumber());
                    }
                    break;
                }
            }
            System.out.println("Произошла ошибка, повторите ввод");
        }

    }

    public void choosePart() {
        String number = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер части выбранной статьи");
        if (scanner.hasNext()) {
            number = scanner.nextLine();
            for (Part part : currentArticle.getParts()) {
                if (part.getNumber().equals(number)) {
                    System.out.println("Выбрана часть № " + part.getNumber());
                    currentArticle.setPart(part);
                    break;

                }
            }
            System.out.println("такой части нет в выбранной статье");
        }
    }


   /*
    public Article getCurrentArticle() {
        currentArticle = new Article();
        currentPart = new Part();
        List<Paragraph> paragraphs = new ArrayList<>();


        String number = "";
        System.out.println("Введите номер статьи");
        while (true) {
            Scanner scanner = new Scanner(System.in);
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
                    scanner = new Scanner(System.in);
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
*/
    }



