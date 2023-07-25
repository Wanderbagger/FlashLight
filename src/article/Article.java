package article;

import java.util.ArrayList;

public class Article {
    private ArrayList <Paragraph> paragraphs;
    private Part part;

    public void addParagraph(Paragraph paragraph){
        if (paragraphs.contains(paragraph)){
            return;
        } else {
            paragraphs.add(paragraph);
        }
    }
}
