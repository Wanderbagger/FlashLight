package article;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Initializer {
    public final ArrayList<Article> criminalCode = new ArrayList<>();;
    private Article currentArticle;
    private Part currentPart = new Part();
    private Paragraph currentParagraph = new Paragraph();
    private String previousLineType;

    public void initializeCriminalCode() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/CriminalCode.txt"));
            for (int i = 1; i < lines.size(); i++) {
                if(lines.get(i).length() > 1) {
                        if(!chooseType(lines.get(i - 1)).equals("ошибка")) {
                            previousLineType = chooseType(lines.get(i - 1));
                        }
                    recognize(lines.get(i));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(criminalCode);
    }

    private Article recognize(String line) { // распознавание
        if (chooseType(line).equals("статья")){
            if(currentArticle != null){
                System.out.println(currentArticle);
            }
            currentArticle = recognizeArticle(line);
        } else if(chooseType(line).equals("часть")){
            if(previousLineType.equals("параграф")){
                currentPart.paragraphs.add(currentParagraph);
            }
            currentArticle.parts.add(currentPart);
            currentPart = recognizePart(line);
        } else if(chooseType(line).equals("параграф")){
            currentParagraph = recognizeParagraph(line);
        }
        return currentArticle;
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