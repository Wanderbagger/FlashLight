package manager.investigatorManager;

public enum District {
    CENTRAL ("ЦАО"),
    SOUTHERN("ЮАО"),
    SOUTH_WESTERN("ЮЗАО"),
    WESTERN("ЗАО"),
    NORTH_WESTERN("СЗАО"),
    NORTHERN("САО"),
    NORTH_EASTERN("СВАО"),
    EASTERN("ВАО"),
    SOUTH_EASTERN("ЮВАО"),
    MAIN_CITY(""),
    ZELENOGRAD("ЗелАО"),
    TINAO("ТиНАО");

    private final String  title;

    District(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
