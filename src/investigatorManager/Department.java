package investigatorManager;

public enum Department {
    AKADEMICHESKIY ("Академический",	Prosecutor.GAGARINSKAYA_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT),
    ALEKSEEVSKIY ("Алексеевский", Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT),
    ALTUFYEVSKIY ("Алтуфьевский", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT),
    ARBAT ("Арбат", Prosecutor.PRESNENSKAYA_PROSECUTORS_OFFICE, Court.PRESNENSKIY_COURT),
    AIRPORT ("Аэропорт", Prosecutor.SAVELOVSKAYA_PROSECUTORS_OFFICE, Court.SAVELOVSKIY_COURT),
    BABUSHKINSKIY ("Бабушкинский", Prosecutor.BABUSHKINSKAYA_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT),
    BASMANNIY("Басманный", Prosecutor.BASMANNAYA_PROSECUTORS_OFFICE, Court.BASMANNIY_COURT),
    BEGOVOY ("Беговой", Prosecutor.SAVELOVSKAYA_PROSECUTORS_OFFICE, Court.SAVELOVSKIY_COURT),
    BESKUDNIKOVSKIY ("Бескудниковский", Prosecutor.TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE, Court.TIMIRYAZEVSKIY_COURT),
    BIBIREVO ("Бибирево", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT),
    BIRYULEVO_EAST ("Бирюлево Восточное", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT),
    BIRYULEVO_WEST ("Бирюлево Западное", Prosecutor.CHEREMUSHKINSKAYA_PROSECUTORS_OFFICE, Court.CHERTANOVSKIY_COURT),
    BOGORODSKIY ("Богородское", Prosecutor.PREOBRAZHENSKAYA_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT),
    BRATEEVO ("Братеево", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT),
    Бутырский	Останкинс
    Вешняки	Перовс
    Внуково	Солнцевс
    Войковский	Головинс
    Восточное Дегунино	Тимирязевс
    Восточное Измайлово	Измайловс
    Восточный	Измайловс
    Выхино-Жулебино	Кузьминс
    Гагаринский	Гагаринс
    Головинский	Головинс
    Гольяново	Преображенс
    Даниловский	Симоновс
    Дмитровский	Тимирязевс
    Донской	Симоновс
    Дорогомилово	Дорогомиловс
    Замоскворечье	Замоскворец
    Западное Дегунино	Тимирязевс
    Зюзино	Зюзинс
    Зябликово	Нагатинс
    Ивановское	Перовс
    Измайлово	Измайловс
    Капотня	Люблинс
    Коньково	Черемушкинс
    Коптево	Коптевс
    Косино-Ухтомский	Перовс
    Котловка	Зюзинс
    Красносельский	Мещанс
    Крылатское	Кунцевс
    Кузьминки	Кузьминс
    Кунцево	Кунцевс
    Куркино	Тушинс
    Левобережный	Головинс
    Лефортово	Лефортовс
    Лианозово	Бутырс
    Ломоносовский	Гагаринс
    Лосиноостровский	Бабушкинс
    Люблино	Люблинс
    Марфино	Останкинс
    Марьина роща	Останкинс
    Марьино	Люблинс
    Метрогородок	Преображенс
    Мещанский	Мещанс
    Митино	Тушинс
    Можайский	Кунцевс
    Молжаниновский	Головинс
    Москворечье Сабурово	Нагатинс
    Нагатино Садовники	Симоновс
    Нагатинский затон	Симоновс
    Нагорный	Чертановс
    Некрасовка	Кузьминс
    Нижегородский	Лефортовс
    Новогиреево	Перовс
    Новокосино	Перовс
    Ново-Переделкино	Солнцевс
    Обручевский	Гагаринс
    Орехово-Борисово Севое	Нагатинс
    Орехово-Борисово Южное	Нагатинс
    Останкинский	Останкинс
    Отрадное	Бутырс
    Очаково-Матвеевское	Никулинс
    Перово	Перовс
    Печатники	Люблинс
    Покровское - Стрешнево	Тушинс
    Преображенское	Преображенс
    Пресненский	Пресненс
    Проспект Вернадского	Никулинс
    Раменки	Никулинс
    Ростокино	Останкинс
    Рязанский	Кузьминс
    Савеловский	Савеловс
    Свиблово	Бабушкинс
    Северное Бутово	Зюзинс
    Северное Измайлово	Измайловс
    Северное Медведково	Бабушкинс
    Северное Тушино	Тушинс
    Северный	Бутырс
    Сокол	Савеловс
    Соколиная гора	Измайловс
    Сокольники	Преображенс
    Солнцево	Солнцевс
    Строгино	Хорошевс
    Таганский	Таганс
    Тверской	Тверс
    Текстильщики	Кузьминс
    Теплый Стан	Черемушкинс
    Тимирязевский	Коптевс
    Тропарево-Никулино	Никулинс
    Филевский парк	Дорогомиловс
    Фили-Давыдково	Дорогомиловс
    Хамовники	Хамовничес
    Ховрино	Головинс
    Хорошево-Мневники	Хорошевс
    Хорошевский	Савеловс
    Царицыно	Нагатинс
    Черемушки	Черемушкинс
    Чертаново Северное	Чертановс
    Чертаново Центральное	Чертановс
    Чертаново Южное	Чертановс
    Щукино	Хорошевс
    Южное Бутово	Зюзинс
    Южное Медведково	Бабушкинс
    Южное Тушино	Тушинс
    Южнопортовый	Лефортовс
    Якиманка	Замоскворец
    Ярославский	Бабушкинс
    Ясенево	Черемушкинс
    private String title;
    private Prosecutor prosecutor;
    private Court court;

    Department(String title, Prosecutor prosecutor, Court court) {
        this.title = title;
        this.prosecutor = prosecutor;
        this.court = court;
    }

    public String getTitle() {
        return "СО Отдела МВД России по району " + title + " г. Москвы";
    }
}
