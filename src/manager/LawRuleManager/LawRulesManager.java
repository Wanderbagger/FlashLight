package manager.LawRuleManager;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class LawRulesManager {
    private final List<Article> articleArrayList = new ArrayList<>();
    private final List <Article> criminalCode = initializeCriminalCode();
    private Article currentArticle;
    private Part currentPart;
    private Paragraph currentParagraph;
    private LineType previousLineType = LineType.ARTICLE;

    public List<Article> initializeCriminalCode() {
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

        //Блок печати УК после инициализации для проверки
        /*
        for (Article art : articleArrayList) {
            System.out.println(art);
        }
        */
        return articleArrayList;
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

    public List<Article> getCriminalCode() {
        return criminalCode;
    }

    public Article chooseArticle() {
        currentArticle = null;
        String number;
        System.out.println("Введите номер статьи");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            number = scanner.nextLine();
                for (Article article : getCriminalCode()) {
                    System.out.println(getCriminalCode());
                    if (article.getNumber().equals(number)) {
                        System.out.println("Выбрана статья № " + article);
                        currentArticle = article;
                        if (!currentArticle.getParts().isEmpty()) {
                            choosePart();
                            currentArticle.setPart(currentPart);
                        }
                        break;
                    }
                }
        }
        if (currentArticle != null){
            System.out.println("Выбрана " + currentArticle);
            return currentArticle;
        }
        else {
            System.out.println("Ошибка ввода статьи");
            return null;
        }
    }

    public void choosePart() {
        String number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер части выбранной статьи");
        System.out.println("Доступные к выбору части: ");
        for (Part part : currentArticle.getParts()) {
            System.out.println(part.getNumber());
        }
        if (scanner.hasNext()) {
            number = scanner.nextLine();
            for (Part part : currentArticle.getParts()) {
                if (part.getNumber().equals(number)) {
                    currentPart = part;
                    System.out.println("Выбрана часть № " + currentPart);
                    if (!part.getParagraphs().isEmpty()){
                        chooseParagraph();
                    } else {
                        System.out.println("Ввод " + currentArticle);
                    }
                    break;
                }
            }
        }
    }

    public void chooseParagraph() {
        Scanner scanner = new Scanner(System.in);
        Set<Paragraph> paragraphs = new HashSet<>();
        String number = "";
        System.out.println("Введите пункт части выбранной статьи");
        System.out.println("Доступные к выбору пункты: ");
        for (Paragraph paragraph : currentPart.getParagraphs()) {
            System.out.println(paragraph.getNumber());
        }
        while (!number.equals("0")){
            if (scanner.hasNext()) {
                number = scanner.nextLine();
                for (Paragraph paragraph : currentPart.getParagraphs()) {
                    if (paragraph.getNumber().equals(number)) {
                        paragraphs.add(paragraph);
                        System.out.println("Выбраны пункты " + paragraphs);
                        System.out.println("Введите еще один пункт или введите 0 для выхода");
                        break;
                    }
                }
            }

        }
        currentPart.setParagraphs(paragraphs);
    }
}