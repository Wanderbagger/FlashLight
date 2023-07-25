package article;

public enum Part {
    PART_1("1"),
    PART_2("2"),
    PART_3("3"),
    PART_4("4"),
    PART_5("5"),
    PART_6("6"),
    PART_7("7");

    private String title;

    Part(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "InvestigatorRank{" +
                "title='" + title + '\'' +
                '}';
    }
}
