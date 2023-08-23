package article;

import java.util.ArrayList;

public class Article {

    private String number;
    private String description;
    protected ArrayList <Part> parts = new ArrayList<>();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        printArticle();
        return "";
    }

    public void printArticle(){
        System.out.println("Article{" + '\'' + "number='" + number + "'" + '\n' + "description='" + description + "'" + '\n');
        for (Part part : parts) {
            System.out.println(part);
        }
    }
}
