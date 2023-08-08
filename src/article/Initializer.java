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
            System.out.println("статья");
            recognizeArticle(line);
          } else if(Character.isDigit(line.charAt(0)) && line.charAt(1) == '.'){
            System.out.println("часть");
        } else if(Character.isLetter(line.charAt(0)) && line.charAt(1) == ')'){
            System.out.println("пункт");
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
            } else if (line.charAt(i) == ' ' && spacecounter > 0){
                word += line.charAt(i);
                article.setDescription(word);
            } else {
                word += line.charAt(i);
            }
        }
        System.out.println(article);
        return article;
    }
}

