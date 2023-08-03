package article;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.ArrayList;

public class Initializer {
    public final ArrayList<Article> criminalCode = initializeCriminalCode();
    private ArrayList<Article> tempCriminalCode = new ArrayList<>();
    private Article currentArticle = new Article();

    public ArrayList<Article> initializeCriminalCode() {

        BufferedReader reader;
        try {
            File f = new File("src/CriminalCode.txt");
            reader = new BufferedReader(new FileReader(f));
            String line = reader.readLine();
            while (true) {
                line = reader.readLine();
                if(line == null){
                    break;
                }
                recognize(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempCriminalCode;
    }


    private Article recognize(String line) { // распознавание
        String word = "";
        for (int i = 0; i < line.length(); i++) { //перебираем строчку по символу
            char c = line.charAt(i);
            if (c != ' ') {
                word += c;
            } else {
                if (word.equals("Статья")) {
                    setArticleDescription(i, line);
                } else {
                    break;
                }
            }
        }
        return currentArticle;
    }

    private void setArticleDescription(int i, String line) {
        Article article = new Article();
        String word = "";
        int spacecounter = 0;
        for (int j = i; j < line.length(); j++) { //перебираем строчку по символу
            char c = line.charAt(j);
            if (c != ' ') {
                word += c;
                System.out.println(word);
            } else {
                System.out.println("!!!");
                if (spacecounter == 0) {
                    System.out.println(word);
                    article.setNumber(word);
                } else {
                    article.setDescription(word);
                }
                spacecounter++;
            }

        }

    }
}

