package article;

import java.util.ArrayList;

public enum Part {
    ;
    private String number;
    private String description;
    private ArrayList <Paragraph> paragraphs;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Part{" +
                "number='" + number + '\'' +
                ", description='" + description + '\'' +
                ", paragraphs=" + paragraphs +
                '}';
    }
}
