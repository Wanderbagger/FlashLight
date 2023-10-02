package manager.LawRuleManager;

public class Paragraph extends LawRule{

    @Override
    public String toString() {
        return "Paragraph{" +
                "number='" + getNumber() + '\'' +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}

