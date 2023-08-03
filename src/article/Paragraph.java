package article;

public class Paragraph {
    private String number;
    private String description;


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
        return "Paragraph{" +
                "number='" + number + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

