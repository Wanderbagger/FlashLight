package investigatorManager;

public enum InvestigatorRank {
    JUNIOR_LIEUTENANT ("младший лейтенант", 1),
    LIEUTENANT ("лейтенант", 2),
    SENIOR_LIEUTENANT ("старший лейтенант", 3),
    CAPTAIN ("капитан", 4),
    MAJOR ("майор", 5),
    LIEUTENANT_COLONEL("подполковник", 6),
    COLONEL("полковник", 7);

    private final String title;
    private final int number;

    InvestigatorRank(String title, int number) {
        this.title = title;
        this.number = number;
    }

    public String getTitle() {
        return title + " юстиции";
    }

    @Override
    public String toString() {
        return "InvestigatorRank{" +
                "title='" + title + '\'' +
                "number='" + number + '\'' +
                '}';
    }
}

