package article;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Initializer {
    private final List<Article> articleArrayList = new ArrayList<>();
    private Article currentArticle;
    private Part currentPart;
    private Paragraph currentParagraph;
    private LineType previousLineType = LineType.ARTICLE;
    private LineType currentLineType;

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
            articleArrayList.add(currentArticle); // добавляем статьи в кодекс
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Article article : articleArrayList) {
             System.out.println(article);
        }
    }

    private void recognize(String line) { // распознавание
        currentLineType = chooseType(line);
        if (currentLineType.equals(LineType.ARTICLE)){
            if(previousLineType!=null) {
                if (previousLineType.equals(LineType.PART) && currentPart != null) {
                    currentArticle.parts.add(currentPart);
                    currentPart = null;
                } else if (previousLineType.equals(LineType.PARAGRAPH) && currentPart != null && currentParagraph != null) {
                    currentPart.paragraphs.add(currentParagraph);
                    currentArticle.parts.add(currentPart);
                    currentParagraph = null;
                    currentPart = null;
                }
                if(currentArticle!=null){
                    articleArrayList.add(currentArticle);
                }
                currentArticle = null;
            }
            currentArticle = recognizeArticle(line);
        } else if(currentLineType.equals(LineType.PART)){
            if(previousLineType.equals(LineType.NOTE)){
                if(currentPart != null) {
                    currentArticle.parts.add(currentPart);
                    currentPart = null;
                }
                    return;
                }
            if(previousLineType.equals(LineType.PARAGRAPH)){
                currentPart.paragraphs.add(currentParagraph);
                currentParagraph = null;
            }
            if(currentPart != null){
                currentArticle.parts.add(currentPart);
            }
            currentPart = recognizePart(line);
        } else if(currentLineType.equals(LineType.PARAGRAPH)){
            if (currentParagraph!=null){
                currentPart.paragraphs.add(currentParagraph);
            }
            currentParagraph = recognizeParagraph(line);
        } else if(currentLineType.equals(LineType.NOTE)){
            if(currentParagraph!=null){
                currentPart.paragraphs.add(currentParagraph);
                currentParagraph = null;
            }
            if(currentPart != null) {
                currentArticle.parts.add(currentPart);
                currentPart = null;
            }
        }
        previousLineType = currentLineType;
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

    private Article recognizeArticle(String line){
        Article article = new Article();
        if(line.charAt(11) == ' ' ){
            article.setNumber(line.substring(7, 10));
            article.setDescription(line.substring(11));
        } else if (Character.isDigit(line.charAt(11))){
            article.setNumber(line.substring(7, 12));
            article.setDescription(line.substring(13));
        }
        return article;
    }

    private Part recognizePart(String line){
        Part part = new Part();
        if(Character.isDigit(line.charAt(0)) && line.charAt(1) == '.' && line.charAt(2) == ' '){
            part.setNumber(line.substring(0,1));
            part.setDescription(line.substring(3));
        } else if (Character.isDigit(line.charAt(0)) && line.charAt(1) == '.' && Character.isDigit(line.charAt(2)) && line.charAt(3) == '.'){
            part.setNumber(line.substring(0,3));
            part.setDescription(line.substring(5));
        }
            return part;
    }

    private Paragraph recognizeParagraph(String line){ // распознавание параграфа
        Paragraph paragraph = new Paragraph();
        if(Character.isLetter(line.charAt(0)) && line.charAt(1) == ')'){
            paragraph.setNumber(line.substring(0,1));
            paragraph.setDescription(line.substring(3));
        } else if (Character.isLetter(line.charAt(0)) && line.charAt(1) == '.'){
            paragraph.setNumber(line.substring(0,3));
            paragraph.setDescription(line.substring(5));
        }
        return paragraph;
    }

}