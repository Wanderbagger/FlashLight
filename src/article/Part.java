package article;

import java.util.ArrayList;
import java.util.List;

public class Part {

    private String number;
    private String description;
    protected List<Paragraph> paragraphs = new ArrayList<>();


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
        printParagraph();
        return "";

    }

    public void printParagraph(){
        System.out.println("Part " + "number='" + number + '\'' + ", description='" + description + '\'' );
        for (Paragraph paragraph : paragraphs) {
            System.out.println(paragraph);
        }
    }
}
