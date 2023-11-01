package manager.LawRuleManager;

public class Paragraph extends LawRule{

    @Override
    public Paragraph recognize(String line) {
        Paragraph paragraph = new Paragraph();
        if (Character.isLetter(line.charAt(0)) && line.charAt(1) == ')') {
            paragraph.setNumber(line.substring(0, 1));
            paragraph.setDescription(cutDescription(line.substring(3)));
        } else if (Character.isLetter(line.charAt(0)) && line.charAt(1) == '.') {
            paragraph.setNumber(line.substring(0, 3));
            paragraph.setDescription(cutDescription(line.substring(5)));
        }
       return paragraph;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "number='" + getNumber() + '\'' +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}

