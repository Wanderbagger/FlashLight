package article;

import java.util.ArrayList;
import java.util.List;

public class Part extends LawRule{

    protected List<Paragraph> paragraphs = new ArrayList<>();

    @Override
    public String toString() {
        printParagraph();
        return "";
    }

    public void printParagraph(){
        System.out.println("Part " + "number='" + getNumber() + '\'' + ", description='" + getDescription() + '\'' );
        for (Paragraph paragraph : paragraphs) {
            System.out.println(paragraph);
        }
    }
}
