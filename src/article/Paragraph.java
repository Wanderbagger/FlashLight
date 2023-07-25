package article;

public enum Paragraph {
    A ("а"),
    B ("б"),
    C ("в"),
    D ("г"),
    E ("д"),
    F ("е"),
    G ("ж"),
    H ("з"),
    I ("и"),
    J ("к");

    private String title;

    Paragraph(String title) {
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

