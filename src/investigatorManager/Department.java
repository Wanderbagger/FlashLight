package investigatorManager;

public enum Department {
    AKADEMICHESKIY_PI ("Академический",	Prosecutor.GAGARINSKAYA_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    ALEKSEEVSKIY_PI ("Алексеевский", Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    ALTUFYEVSKIY_PI ("Алтуфьевский", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    ARBAT_PI ("Арбат", Prosecutor.PRESNENSKAYA_PROSECUTORS_OFFICE, Court.PRESNENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    AIRPORT_PI ("Аэропорт", Prosecutor.SAVELOVSKAYA_PROSECUTORS_OFFICE, Court.SAVELOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    BABUSHKINSKIY_PI ("Бабушкинский", Prosecutor.BABUSHKINSKAYA_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    BASMANNIY_PI ("Басманный", Prosecutor.BASMANNAYA_PROSECUTORS_OFFICE, Court.BASMANNIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    BEGOVOY_PI ("Беговой", Prosecutor.SAVELOVSKAYA_PROSECUTORS_OFFICE, Court.SAVELOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    BESKUDNIKOVSKIY_PI ("Бескудниковский", Prosecutor.TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE, Court.TIMIRYAZEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    BIBIREVO_PI ("Бибирево", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    BIRYULEVO_EAST_PI ("Бирюлево Восточное", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    BIRYULEVO_WEST_PI ("Бирюлево Западное", Prosecutor.CHEREMUSHKINSKAYA_PROSECUTORS_OFFICE, Court.CHERTANOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    BOGORODSKIY_PI ("Богородское", Prosecutor.PREOBRAZHENSKAYA_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    BRATEEVO_PI ("Братеево", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    BUTYIRSKIY_PI ("Бутырский", Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    VESHNYAKI_PI ("Вешняки", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    VNUKOVO_PI ("Внуково", Prosecutor.SOLNCEVSKAYA_PROSECUTORS_OFFICE, Court.SOLNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    VOYKOVSKIY_PI ("Войковский", Prosecutor.GOLOVINSKAYA_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    DEGUNINO_EAST_PI ("Восточное Дегунино", Prosecutor.TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE, Court.TIMIRYAZEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    IZMAYLOVO_EAST_PI ("Восточное Измайлово", Prosecutor.IZMAYLOVSKAYA_PROSECUTORS_OFFICE, Court.IZMAYLOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    VOSTOCHNIY_PI ("Восточный", Prosecutor.IZMAYLOVSKAYA_PROSECUTORS_OFFICE, Court.IZMAYLOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    VYIHINO_ZHULEBINO_PI ("Выхино-Жулебино", Prosecutor.KUZMINSKAYA_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    GAGARINSKIY_PI ("Гагаринский", Prosecutor.GAGARINSKAYA_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    GOLOVINSKIY_PI ("Головинский", Prosecutor.GOLOVINSKAYA_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    GOLYANOVO_PI ("Гольяново", Prosecutor.PREOBRAZHENSKAYA_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    DANILOVSKIY_PI ("Даниловский", Prosecutor.SIMONOVSKAYA_PROSECUTORS_OFFICE, Court.SIMONOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    DMITROVSKIY_PI ("Дмитровский", Prosecutor.TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE, Court.TIMIRYAZEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    DONSKOY_PI ("Донской", Prosecutor.SIMONOVSKAYA_PROSECUTORS_OFFICE, Court.SIMONOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    DOROGOMILOVO_PI ("Дорогомилово", Prosecutor.DOROGOMILOVSKAYA_PROSECUTORS_OFFICE, Court.DOROGOMILOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    ZAMOSKVORECHYE_PI ("Замоскворечье", Prosecutor.ZAMOSKVORECKAYA_PROSECUTORS_OFFICE, Court.ZAMOSKVORECKIY__COURT, DepartmentType.POLICE_INVESTIGATION),
    DEGUNINO_WEST_PI ("Западное Дегунино", Prosecutor.TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE, Court.TIMIRYAZEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    ZYUZINO_PI ("Зюзино", Prosecutor.ZUZINSKAYA_PROSECUTORS_OFFICE, Court.ZUZINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    ZYABLIKOVO_PI ("Зябликово", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    IVANOVSKOE_PI ("Ивановское", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    IZMAYLOVO_PI ("Измайлово", Prosecutor.IZMAYLOVSKAYA_PROSECUTORS_OFFICE, Court.IZMAYLOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    KAPOTNYA_PI ("Капотня", Prosecutor.LUBLINSKAYA_PROSECUTORS_OFFICE, Court.LUBLINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    KONKOVO_PI ("Коньково", Prosecutor.CHEREMUSHKINSKAYA_PROSECUTORS_OFFICE, Court.CHEREMUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    KOPTEVO_PI ("Коптево", Prosecutor.KOPTEVSKAYA_PROSECUTORS_OFFICE, Court.KOPTEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    KOSINO_UHTOMSKIY_PI ("Косино-Ухтомский", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    KOTLOVKA_PI ("Котловка",	Prosecutor.ZUZINSKAYA_PROSECUTORS_OFFICE, Court.ZUZINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    KRASNOSELSKIY_PI ("Красносельский", Prosecutor.MESHANSKAYA_PROSECUTORS_OFFICE, Court.MESHANSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    KRYILATSKOE_PI ("Крылатское", Prosecutor.KUNCEVSKAYA_PROSECUTORS_OFFICE, Court.KUNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    KUZMINKI_PI ("Кузьминки", Prosecutor.KUZMINSKAYA_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    KUNCEVO_PI ("Кунцево", Prosecutor.KUNCEVSKAYA_PROSECUTORS_OFFICE, Court.KUNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    KURKINO_PI ("Куркино",	Prosecutor.TUSHINSKAYA_PROSECUTORS_OFFICE, Court.TUSHINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    LEVOBEREZHNIY_PI ("Левобережный", Prosecutor.GOLOVINSKAYA_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    LEFORTOVO_PI ("Лефортово", Prosecutor.LEFORTOVSKAYA_PROSECUTORS_OFFICE, Court.LEFORTOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
    LIANOZOVO ("Лианозово", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT, DepartmentType.POLICE_INVESTIGATION),
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
    private DepartmentType departmentType;

    Department(String title, Prosecutor prosecutor, Court court, DepartmentType departmentType) {
        this.title = title;
        this.prosecutor = prosecutor;
        this.court = court;
        this.departmentType = departmentType;
    }

    public String getTitle() {
        if (departmentType.equals(DepartmentType.POLICE_INVESTIGATION)) {
            return "СО Отдела МВД России по району " + title + " г. Москвы";
        } else if (departmentType.equals(DepartmentType.INVESIGATE_COMITEE)) {
            return "СО Отдела МВД России по району " + title + " г. Москвы";
        } else if (departmentType.equals(DepartmentType.POLICE_INQUIRI)) {
            return "ОД Отдела МВД России по району " + title + " г. Москвы";
        }
         return null;
    }
}
