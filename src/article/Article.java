package article;

import java.util.ArrayList;

public class Article {

    private String number;
    private String description;
    private ArrayList <Part> parts;

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
        return "Article{" +
                "number='" + number + '\'' +
                ", description='" + description + '\'' +
                ", parts=" + parts +
                '}';
    }
}
