package article;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Initializer {
    private final List<Article> criminalCode = new ArrayList<>();
    private Article currentArticle;
    private Part currentPart;
    private Paragraph currentParagraph;
    private LineType previousLineType;

    public void initializeCriminalCode() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/CriminalCode.txt"));
            for (int i = 1; i < lines.size(); i++) {
                if(lines.get(i).length() > 1 && lines.size() > (i + 1)) {
                    recognize(lines.get(i));
                }
            }
            criminalCode.add(currentArticle);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Article article : criminalCode) {
             System.out.println(article);
        }
    }

    private void recognize(String line) { // распознавание
        if (chooseType(line).equals(LineType.ARTICLE)){
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
                    criminalCode.add(currentArticle);
                }
                currentArticle = null;
            }
            currentArticle = recognizeArticle(line);
            previousLineType = LineType.ARTICLE;
        } else if(chooseType(line).equals(LineType.PART)){
            if(previousLineType.equals(LineType.PARAGRAPH)){
                currentPart.paragraphs.add(currentParagraph);
                currentParagraph = null;
            }
            if(currentPart != null){
                currentArticle.parts.add(currentPart);
            }
            currentPart = recognizePart(line);
            previousLineType = LineType.PART;
        } else if(chooseType(line).equals(LineType.PARAGRAPH)){
            if (currentParagraph!=null){
                currentPart.paragraphs.add(currentParagraph);
            }
            currentParagraph = recognizeParagraph(line);
            previousLineType = LineType.PARAGRAPH;
        }
    }

    private LineType chooseType (String line) { // распознавание следующей строки
        if(line.length() < 1){
            return LineType.ERROR;
        }
        if (line.charAt(0) == 'С' && line.charAt(1) == 'т'){
            return LineType.ARTICLE;
        } else if(Character.isDigit(line.charAt(0)) && line.charAt(1) == '.'){
            return LineType.PART;
        } else if(Character.isLetter(line.charAt(0)) && line.charAt(1) == ')'){
            return LineType.PARAGRAPH;
        }
        return LineType.ERROR;
    }

    private Article recognizeArticle(String line){
        Article article = new Article();
        int spacecounter = 0;
        String word = "";
        for (int i = 7; i < line.length(); i++) {
            if(line.charAt(i) == ' ' && spacecounter == 0){
                if(word.charAt(word.length()-1) == '.'){
                    word = word.substring(0, word.length() - 1);
                }
                article.setNumber(word);
                word = "";
                spacecounter++;
            } else if ((line.charAt(i) == ' ' && spacecounter > 0) || (i + 1) == line.length()){
                word += line.charAt(i);
                article.setDescription(word);
            } else {
                word += line.charAt(i);
            }
        }
        return article;
    }

    private Part recognizePart(String line){
        int spacecounter = 0;
        Part part = new Part();
         String word = "";

        if(Character.isDigit(line.charAt(0)) && line.charAt(1) == '.' && Character.isDigit(line.charAt(2))){

            word = line.substring(0,3);

            part.setNumber(word);
            part.setDescription(line.substring(5, line.length()-1));
            System.out.println(part);
            return part;
        }


        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == '.'){
                part.setNumber(word);
            } else if (line.charAt(i) == ' ' && spacecounter == 0) {
                word = "";
                spacecounter++;
            } else if ((line.charAt(i) == ' ' && spacecounter > 0) || (i + 1) == line.length()){
                word += line.charAt(i);
                part.setDescription(word);
            } else {
                word += line.charAt(i);
            }
        }
        return part;
    }

    private Paragraph recognizeParagraph(String line){
        Paragraph paragraph = new Paragraph();
        String word = "";
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == ')'){
                paragraph.setNumber(word);
                word = "";
            } else if ((i + 1) == line.length()){
                word += line.charAt(i);
                paragraph.setDescription(word);
            } else {
                word += line.charAt(i);
            }
        }
        return paragraph;
    }

}