package manager.LawRuleManager;

public abstract class LawRule {
    private String number;
    private String description;

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

    public LawRule recognize (String line){
        return this;
    }

    public String cutDescription(String description) {
        if (description.endsWith(";")) {
            return description.substring(0, description.length() - 1);
        } else if (description.endsWith(", -")) {
            return description.substring(0, description.length() - 3);
        } else if (description.endsWith(" -")) {
            return description.substring(0, description.length() - 2);
        } else {
            return description;
        }

    }
}
