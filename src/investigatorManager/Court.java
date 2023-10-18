package investigatorManager;

public enum Court {

    BASMANNIY_COURT ("Басманный"),
    ZAMOSKVORECKIY__COURT ("Замоскворецкий"),
    MESHANSKIY_COURT ("Мещанский"),
    PRESNENSKIY_COURT ("Пресненский"),
    TAGANSKIY_COURT ("Таганский"),
    TVERSKOY_COURT ("Тверской"),
    HAMOVNICHESKIY_COURT ("Хамовнический"),

    GOLOVINSKIY_COURT ("Головинский"),
    KOPTEVSKIY_COURT ("Коптевский"),
    SAVELOVSKIY_COURT ("Савеловский"),
    TIMIRYAZEVSKIY_COURT ("Тимирязевский"),

    BABUSHKINSKIY_COURT ("Бабушкинский"),
    BUTYRSKIY_COURT ("Бутырский"),
    OSTANKINSKIY_COURT ("Останкинский"),

    IZMAYLOVSKIY_COURT ("Измайловский"),
    PEROVSKIY_COURT ("Перовский"),
    PREOBRAZHENSKIY_COURT ("Преображенский"),

    KUZMINSKIY_COURT ("Кузьминский"),
    LEFORTOVSKIY_COURT ("Лефортовский"),
    LUBLINSKIY_COURT ("Люблинский"),

    NAGATINSKIY_COURT ("Нагатинский"),
    SIMONOVSKIY_COURT ("Симоновский"),
    CHERTANOVSKIY_COURT ("Чертановский"),

    GAGARINSKIY_COURT ("Гагаринский"),
    ZUZINSKIY_COURT ("Зюзинский"),
    CHEREMUSHKINSKIY_COURT ("Черемушкинский"),

    DOROGOMILOVSKIY_COURT ("Дорогомиловский"),
    KUNCEVSKIY_COURT ("Кунцевский"),
    NIKULINSKIY_COURT ("Никулинский"),
    SOLNCEVSKIY_COURT ("Солнцевский"),

    TUSHINSKIY_COURT ("Тушинский"),
    HOROSHEVCKIY_COURT ("Хорошевский"),

    ZELENOGRAD("Зеленоградский"),
    TROICKIY("Троицкий"),
    TSHERBINSKIY("Щербинский")
    ;


    private String title;

    Court(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title + "районный суд г. Москвы";
    }
}
