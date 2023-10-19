package manager.investigatorManager;

public enum InvestigatorPosition {
    INVESTIGATOR ("следователь"),
    SENIOR_INVESTIGATOR ("старший следователь"),
    IMPORTANT_CASES_INVESTIGATOR ("следователь по особо важным делам"),
    SENIOR_IMPORTANT_CASES_INVESTIGATOR ("старший следователь по особо важным делам"),
    DEPUTY_CHIEF ("заместитель начальника СО"),
    CHIEF ("начальник СО");

    private final String title;


    InvestigatorPosition(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title + " юстиции";
    }



    @Override
    public String toString() {
        return "InvestigatorPosition{" +
                "title='" + title + '\'' +
                '}';
    }
}

