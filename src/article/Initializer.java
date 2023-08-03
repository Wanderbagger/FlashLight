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

    public ArrayList<Article> initializeCriminalCode() {
        ArrayList<Article> tempCriminalCode = null;
        BufferedReader reader;
        try {
            File f = new File("src/CriminalCode.txt");
            reader = new BufferedReader(new FileReader(f));
            String line = reader.readLine();
            while (line != null) {

                line = reader.readLine();
                recognize(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempCriminalCode;
    }


    private Article recognize(String line) { // распознавание
        StringBuilder word = new StringBuilder();
        String keyword = "";
        StringBuilder object = new StringBuilder();
        for (int i = 0; i < line.length(); i++) { //перебираем строчку по символу
            char c = line.charAt(i);
            while (c != ' ') { //считываем пока не встретим пробел
                c = line.charAt(i);

                    word.append(c); // добавление символов к слову

            }
            System.out.println(word);

        }
    return null;
    }
}
