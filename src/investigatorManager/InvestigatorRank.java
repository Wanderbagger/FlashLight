package investigatorManager;

public enum InvestigatorRank {
    JUNIOR_LIEUTENANT ("младший лейтенант"),
    LIEUTENANT ("лейтенант"),
    SENIOR_LIEUTENANT ("старший лейтенант"),
    CAPTAIN ("капитан"),
    MAJOR ("майор"),
    LIEUTENANT_COLONEL("подполковник"),
    COLONEL("полковник");

    private final String title;


    InvestigatorRank(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title + " юстиции";
    }

    @Override
    public String toString() {
        return "InvestigatorRank{" +
                "title='" + title + '\'' +
                '}';
    }
}