package manager.LawRuleManager;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Part extends LawRule{

    protected Set<Paragraph> paragraphs = new HashSet<>();

    @Override
    public String toString() {
        return "Часть " + getNumber() + " (" + getDescription() + ")";
    }
/*
Печать для проверки при инициализации УК
    public void printParagraph(){
        System.out.println("Part " + "number='" + getNumber() + '\'' + ", description='" + getDescription() + '\'' );
        for (Paragraph paragraph : paragraphs) {
            System.out.println(paragraph);
        }
    }
*/
    public Set<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(Set<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    @Override
    public Part recognize(String line) {
        Part part = new Part();
        if (Character.isDigit(line.charAt(0)) && line.charAt(1) == '.' && line.charAt(2) == ' ') {
            part.setNumber(line.substring(0, 1));
            part.setDescription(cutDescription(line.substring(3)));
        } else if (Character.isDigit(line.charAt(0)) && line.charAt(1) == '.' && Character.isDigit(line.charAt(2)) && line.charAt(3) == '.') {
            part.setNumber(line.substring(0, 3));
            part.setDescription(cutDescription(line.substring(5)));
        }
        return part;

    }

}
