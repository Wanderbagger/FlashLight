package investigator;

public enum Prosecutor {
    CENTRAL_ADMINISRATIVE_DISTRICT ("Центрального административного округа"),
    BASMANNAYA_PROSECUTORS_OFFICE ("Басманной межрайонной прокуратуры ЦАО"),
    ZAMOSKVORECKAYA_PROSECUTORS_OFFICE ("Замоскворецкой межрайонной прокуратуры ЦАО"),
    MESHANSKAYA_PROSECUTORS_OFFICE ("Мещанской межрайонной прокуратуры ЦАО"),
    PRESNENSKAYA_PROSECUTORS_OFFICE ("Пресненской межрайонной прокуратуры ЦАО"),
    TAGANSKAYA_PROSECUTORS_OFFICE ("Таганской межрайонной прокуратуры ЦАО"),
    TVERSKAYA_PROSECUTORS_OFFICE ("Тверской межрайонной прокуратуры ЦАО"),
    HAMOVNICHESKAYA_PROSECUTORS_OFFICE ("Хамовнической межрайонной прокуратуры ЦАО"),

    NORTH_ADMINISRATIVE_DISTRICT ("Северного административного округа"),
    GOLOVINSKAYA_PROSECUTORS_OFFICE ("Головинской межрайонной прокуратуры САО"),
    KOPTEVSKAYA_PROSECUTORS_OFFICE ("Коптевской межрайонной прокуратуры САО"),
    SAVELOVSKAYA_PROSECUTORS_OFFICE ("Савеловской межрайонной прокуратуры САО"),
    TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE ("Тимирязевской межрайонной прокуратуры САО"),

    NORTH_EASTERN_ADMINISRATIVE_DISTRICT ("Северо-Восточного административного округа"),
    BABUSHKINSKAYA_PROSECUTORS_OFFICE ("Бабушкинской межрайонной прокуратуры СВАО"),
    BUTYRSKAYA_PROSECUTORS_OFFICE ("Бутырской межрайонной прокуратуры СВАО"),
    OSTANKINSKAYA_PROSECUTORS_OFFICE ("Останкинской межрайонной прокуратуры СВАО"),

    EASTERN_ADMINISRATIVE_DISTRICT ("Восточного административного округа"),
    IZMAYLOVSKAYA_PROSECUTORS_OFFICE ("Измайловской межрайонной прокуратуры ВАО"),
    PEROVSKAYA_PROSECUTORS_OFFICE ("Перовской межрайонной прокуратуры ВАО"),
    PREOBRAZHENSKAYA_PROSECUTORS_OFFICE ("Преображенской межрайонной прокуратуры ВАО"),

    SOUTH_EASTERN_ADMINISRATIVE_DISTRICT ("Юго-Восточного административного округа"),
    KUZMINSKAYA_PROSECUTORS_OFFICE ("Кузьминской межрайонной прокуратуры ЮВАО"),
    LEFORTOVSKAYA_PROSECUTORS_OFFICE ("Лефортовской межрайонной прокуратуры ЮВАО"),
    LUBLINSKAYA_PROSECUTORS_OFFICE ("Люблинской межрайонной прокуратуры ЮВАО"),

    SOUTH_ADMINISRATIVE_DISTRICT ("Южного административного округа"),
    NAGATINSKAYA_PROSECUTORS_OFFICE ("Нагатинской межрайонной прокуратуры ЮАО"),
    SIMONOVSKAYA_PROSECUTORS_OFFICE ("Симоновской межрайонной прокуратуры ЮАО"),
    CHERTANOVSKAYA_PROSECUTORS_OFFICE ("Чертановской межрайонной прокуратуры ЮАО"),

    SOUTHWEST_DISTRICT ("Юго-Западного административного округа"),
    GAGARINSKAYA_PROSECUTORS_OFFICE ("Гагаринской межрайонной прокуратуры ЮЗАО"),
    ZUZINSKAYA_PROSECUTORS_OFFICE ("Зюзинской межрайонной прокуратуры ЮЗАО"),
    CHEREMUSHKINSKAYA_PROSECUTORS_OFFICE ("Черемушкинской межрайонной прокуратуры ЮЗАО"),

    WESTERN_DISTRICT ("Западного административного округа"),
    DOROGOMILOVSKAYA_PROSECUTORS_OFFICE ("Дорогомиловской межрайонной прокуратуры ЗАО"),
    KUNCEVSKAYA_PROSECUTORS_OFFICE ("Кунцевской межрайонной прокуратуры ЗАО"),
    NIKULINSKAYA_PROSECUTORS_OFFICE ("Никулинской межрайонной прокуратуры ЗАО"),
    SOLNCEVSKAYA_PROSECUTORS_OFFICE ("Солнцевской межрайонной прокуратуры ЗАО"),

    NORTHWEST_DISTRICT ("Северо-Западного административного округа"),
    TUSHINSKAYA_PROSECUTORS_OFFICE ("Тушинской межрайонной прокуратуры СЗАО"),
    HOROSHEVCKAYA_PROSECUTORS_OFFICE ("Хорошевской межрайонной прокуратуры СЗАО");


    private String title;

    Prosecutor(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title + " г. Москвы";
    }

    public String getProsecutorTitle() {
        return "Прокурору " + title + " г. Москвы";
    }

    @Override
    public String toString() {
        return "Prosecutor{" +
                "title='" + title + '\'' +
                '}';
    }

}
