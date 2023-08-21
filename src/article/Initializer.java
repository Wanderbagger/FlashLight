package article;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Initializer {
    public final ArrayList<Article> criminalCode = new ArrayList<>();
    private Article currentArticle = new Article();
    private Part currentPart = new Part();
    private Paragraph currentParagraph = new Paragraph();
    private String previousLineType;

    public void initializeCriminalCode() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/CriminalCode.txt"));
            for (int i = 1; i < lines.size(); i++) {
                if(lines.get(i).length() > 1 && lines.size() > (i + 1)) {
                    recognize(lines.get(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Article article : criminalCode) {
            System.out.println(article);
        }
    }

    private void recognize(String line) { // распознавание
        if (chooseType(line).equals("статья")){
            if(previousLineType!=null) {
                if (previousLineType.equals("часть") && currentPart != null) {
                    currentArticle.parts.add(currentPart);
                    currentPart = null;
                } else if (previousLineType.equals("параграф") && currentPart != null && currentParagraph != null) {
                    currentPart.paragraphs.add(currentParagraph);
                    currentArticle.parts.add(currentPart);
                    currentParagraph = null;
                    currentPart = null;
                }
                if(currentArticle!=null){
                    criminalCode.add(currentArticle);
                }
                currentArticle = null;
                currentArticle = recognizeArticle(line);
                previousLineType = "статья";
            } else {
                currentArticle = recognizeArticle(line);
                previousLineType = "статья";
            }


        } else if(chooseType(line).equals("часть")){
            if(previousLineType.equals("параграф")){
                currentPart.paragraphs.add(currentParagraph);
                currentParagraph = null;
            }

            if(currentPart != null){
                currentArticle.parts.add(currentPart);
            }
            currentPart = recognizePart(line);
            previousLineType = "часть";
        } else if(chooseType(line).equals("параграф")){

            if (currentParagraph!=null){
                currentPart.paragraphs.add(currentParagraph);

            }
            currentParagraph = recognizeParagraph(line);
            previousLineType = "параграф";
        }
    }

    private String chooseType (String line) { // распознавание следующей строки
        if(line.length() < 1){
            return "ошибка";
        }
        if (line.charAt(0) == 'С' && line.charAt(1) == 'т'){
            return "статья";
        } else if(Character.isDigit(line.charAt(0)) && line.charAt(1) == '.'){
            return "часть";
        } else if(Character.isLetter(line.charAt(0)) && line.charAt(1) == ')'){
            return "параграф";
        }
        return "ошибка";
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