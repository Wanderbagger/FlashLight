package article;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Initializer {
    public final ArrayList<Article> criminalCode = initializeCriminalCode();
    private ArrayList<Article> tempCriminalCode = new ArrayList<>();
    private Article currentArticle = new Article();
    private Part currentPart = new Part();
    private Paragraph currentParagraph = new Paragraph();

    public ArrayList<Article> initializeCriminalCode() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/CriminalCode.txt"));
            for (String line: lines) {
                recognize(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempCriminalCode;
    }

    private Article recognize(String line) { // распознавание
        if (line.charAt(0) == 'С' && line.charAt(1) == 'т'){
            currentArticle = recognizeArticle(line);
          } else if(Character.isDigit(line.charAt(0)) && line.charAt(1) == '.'){
            currentPart = recognizePart(line);
            System.out.println(currentPart);
        } else if(Character.isLetter(line.charAt(0)) && line.charAt(1) == ')'){
            currentParagraph = recognizeParagraph(line);

            System.out.println(currentParagraph);
        }
        return currentArticle;
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

