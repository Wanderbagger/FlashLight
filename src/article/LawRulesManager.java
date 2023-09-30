package article;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


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
                if(lines.get(i).length() > 1 && lines.size() > (i + 1)) {
                    if(!chooseType(lines.get(i)).equals(LineType.ERROR)){
                        recognize(lines.get(i));
                    }
                }
            }
            articleArrayList.add(currentArticle); // добавляем статью в кодекс в конце процедуры
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Article article : articleArrayList) {
             System.out.println(article);
        }
    }

    private void recognize(String line) { // распознавание
        LineType currentLineType = chooseType(line);
        if (currentLineType.equals(LineType.ARTICLE)){
            if(previousLineType!=null) {
                addArticle(); // статья добавляется только в начале распознавания следующей статьи в кодекс или по завершении всей процедуры
            }
            recognizeArticle(line);
        } else if(currentLineType.equals(LineType.PART)){ // добавление части
            addPart(); // добавление предыдущей части перед распознаванием следующей
            if(previousLineType.equals(LineType.NOTE)){ // исключение ошибочного распознавания примечания как части
                    return;
                }
            recognizePart(line);
        } else if(currentLineType.equals(LineType.PARAGRAPH)){
            addParagraph(); // добавление параграфа перед распознаванием предыдущего
            recognizeParagraph(line);
        } else if(currentLineType.equals(LineType.NOTE)){
            addPart(); // при обнаружении примечания - добавить часть
        }
        previousLineType = currentLineType;
    }

    private void addParagraph(){
        if(currentParagraph!=null){
            currentPart.paragraphs.add(currentParagraph);
        }
        currentParagraph = null; // обнуление значения после добавления распознанного параграфа
    }

    private void addPart(){
        addParagraph();
        if(currentPart != null) {
            currentArticle.parts.add(currentPart);
        }
        currentPart = null; // обнуление значения после добавления распознанной части
    }

    private void addArticle(){
        addPart();
        if(currentArticle!=null){
            articleArrayList.add(currentArticle);
        }
        currentArticle = null; // обнуление значения после добавления
    }

    private LineType chooseType (String line) { // распознавание следующей строки
        if(line.length() < 1){
            return LineType.ERROR;
        }
        if (line.charAt(0) == 'С' && line.charAt(1) == 'т'){
            return LineType.ARTICLE;
        } else if(Character.isDigit(line.charAt(0)) && line.charAt(1) == '.'){
            return LineType.PART;
        } else if(Character.isLetter(line.charAt(0)) && line.charAt(1) == ')' || Character.isLetter(line.charAt(0)) && line.charAt(1) == '.'){
            return LineType.PARAGRAPH;
        } else if (line.charAt(0) == 'П' && line.charAt(1) == 'р') {
            return LineType.NOTE;
        }
        return LineType.ERROR;
    }

    private void recognizeArticle(String line){
        Article article = new Article();
        if(line.charAt(11) == ' ' ){
            article.setNumber(line.substring(7, 10));
            article.setDescription(line.substring(11));
        } else if (Character.isDigit(line.charAt(11))){
            article.setNumber(line.substring(7, 12));
            article.setDescription(line.substring(13));
        }
        currentArticle = article;
    }

    private void recognizePart(String line){
        Part part = new Part();
        if(Character.isDigit(line.charAt(0)) && line.charAt(1) == '.' && line.charAt(2) == ' '){
            part.setNumber(line.substring(0,1));
            part.setDescription(line.substring(3));
        } else if (Character.isDigit(line.charAt(0)) && line.charAt(1) == '.' && Character.isDigit(line.charAt(2)) && line.charAt(3) == '.'){
            part.setNumber(line.substring(0,3));
            part.setDescription(line.substring(5));
        }
            currentPart = part;
    }

    private void recognizeParagraph(String line){ // распознавание параграфа
        Paragraph paragraph = new Paragraph();
        if(Character.isLetter(line.charAt(0)) && line.charAt(1) == ')'){
            paragraph.setNumber(line.substring(0,1));
            paragraph.setDescription(line.substring(3));
        } else if (Character.isLetter(line.charAt(0)) && line.charAt(1) == '.'){
            paragraph.setNumber(line.substring(0,3));
            paragraph.setDescription(line.substring(5));
        }
        currentParagraph = paragraph;
    }

}