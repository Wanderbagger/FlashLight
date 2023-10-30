package manager.LawRuleManager;

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

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

}
