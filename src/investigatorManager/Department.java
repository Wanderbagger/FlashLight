package investigatorManager;

public enum Department {
    AKADEMICHESKIY_PI ("Академический",	Prosecutor.GAGARINSKAYA_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_WESTERN),
    ALEKSEEVSKIY_PI ("Алексеевский", Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTH_EASTERN),
    ALTUFYEVSKIY_PI ("Алтуфьевский", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTH_EASTERN),
    ARBAT_PI ("Арбат", Prosecutor.PRESNENSKAYA_PROSECUTORS_OFFICE, Court.PRESNENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.CENTRAL),
    AIRPORT_PI ("Аэропорт", Prosecutor.SAVELOVSKAYA_PROSECUTORS_OFFICE, Court.SAVELOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTHERN),
    BABUSHKINSKIY_PI ("Бабушкинский", Prosecutor.BABUSHKINSKAYA_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTH_EASTERN),
    BASMANNIY_PI ("Басманный", Prosecutor.BASMANNAYA_PROSECUTORS_OFFICE, Court.BASMANNIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.CENTRAL),
    BEGOVOY_PI ("Беговой", Prosecutor.SAVELOVSKAYA_PROSECUTORS_OFFICE, Court.SAVELOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTHERN),
    BESKUDNIKOVSKIY_PI ("Бескудниковский", Prosecutor.TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE, Court.TIMIRYAZEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTHERN),
    BIBIREVO_PI ("Бибирево", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTH_EASTERN),
    BIRYULEVO_EAST_PI ("Бирюлево Восточное", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTHERN),
    BIRYULEVO_WEST_PI ("Бирюлево Западное", Prosecutor.CHEREMUSHKINSKAYA_PROSECUTORS_OFFICE, Court.CHERTANOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTHERN),
    BOGORODSKIY_PI ("Богородское", Prosecutor.PREOBRAZHENSKAYA_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTHERN),
    BRATEEVO_PI ("Братеево", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTHERN),
    BUTYIRSKIY_PI ("Бутырский", Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTH_EASTERN),
    VESHNYAKI_PI ("Вешняки", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.EASTERN),
    VNUKOVO_PI ("Внуково", Prosecutor.SOLNCEVSKAYA_PROSECUTORS_OFFICE, Court.SOLNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.WESTERN),
    VOYKOVSKIY_PI ("Войковский", Prosecutor.GOLOVINSKAYA_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTHERN),
    DEGUNINO_EAST_PI ("Восточное Дегунино", Prosecutor.TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE, Court.TIMIRYAZEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTHERN),
    IZMAYLOVO_EAST_PI ("Восточное Измайлово", Prosecutor.IZMAYLOVSKAYA_PROSECUTORS_OFFICE, Court.IZMAYLOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.EASTERN),
    VOSTOCHNIY_PI ("Восточный", Prosecutor.IZMAYLOVSKAYA_PROSECUTORS_OFFICE, Court.IZMAYLOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.EASTERN),
    VYIHINO_ZHULEBINO_PI ("Выхино-Жулебино", Prosecutor.KUZMINSKAYA_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_EASTERN),
    GAGARINSKIY_PI ("Гагаринский", Prosecutor.GAGARINSKAYA_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_WESTERN),
    GOLOVINSKIY_PI ("Головинский", Prosecutor.GOLOVINSKAYA_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.EASTERN),
    GOLYANOVO_PI ("Гольяново", Prosecutor.PREOBRAZHENSKAYA_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.EASTERN),
    DANILOVSKIY_PI ("Даниловский", Prosecutor.SIMONOVSKAYA_PROSECUTORS_OFFICE, Court.SIMONOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTHERN),
    DMITROVSKIY_PI ("Дмитровский", Prosecutor.TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE, Court.TIMIRYAZEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTHERN),
    DONSKOY_PI ("Донской", Prosecutor.SIMONOVSKAYA_PROSECUTORS_OFFICE, Court.SIMONOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTHERN),
    DOROGOMILOVO_PI ("Дорогомилово", Prosecutor.DOROGOMILOVSKAYA_PROSECUTORS_OFFICE, Court.DOROGOMILOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.WESTERN),
    ZAMOSKVORECHYE_PI ("Замоскворечье", Prosecutor.ZAMOSKVORECKAYA_PROSECUTORS_OFFICE, Court.ZAMOSKVORECKIY__COURT, DepartmentType.POLICE_INVESTIGATION, District.CENTRAL),
    DEGUNINO_WEST_PI ("Западное Дегунино", Prosecutor.TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE, Court.TIMIRYAZEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTHERN),
    ZYUZINO_PI ("Зюзино", Prosecutor.ZUZINSKAYA_PROSECUTORS_OFFICE, Court.ZUZINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_WESTERN),
    ZYABLIKOVO_PI ("Зябликово", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTHERN),
    IVANOVSKOE_PI ("Ивановское", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.EASTERN),
    IZMAYLOVO_PI ("Измайлово", Prosecutor.IZMAYLOVSKAYA_PROSECUTORS_OFFICE, Court.IZMAYLOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.EASTERN),
    KAPOTNYA_PI ("Капотня", Prosecutor.LUBLINSKAYA_PROSECUTORS_OFFICE, Court.LUBLINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_EASTERN),
    KONKOVO_PI ("Коньково", Prosecutor.CHEREMUSHKINSKAYA_PROSECUTORS_OFFICE, Court.CHEREMUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_WESTERN),
    KOPTEVO_PI ("Коптево", Prosecutor.KOPTEVSKAYA_PROSECUTORS_OFFICE, Court.KOPTEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTHERN),
    KOSINO_UHTOMSKIY_PI ("Косино-Ухтомский", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.EASTERN),
    KOTLOVKA_PI ("Котловка",	Prosecutor.ZUZINSKAYA_PROSECUTORS_OFFICE, Court.ZUZINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_WESTERN),
    KRASNOSELSKIY_PI ("Красносельский", Prosecutor.MESHANSKAYA_PROSECUTORS_OFFICE, Court.MESHANSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.CENTRAL),
    KRYILATSKOE_PI ("Крылатское", Prosecutor.KUNCEVSKAYA_PROSECUTORS_OFFICE, Court.KUNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.WESTERN),
    KUZMINKI_PI ("Кузьминки", Prosecutor.KUZMINSKAYA_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_EASTERN),
    KUNCEVO_PI ("Кунцево", Prosecutor.KUNCEVSKAYA_PROSECUTORS_OFFICE, Court.KUNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.WESTERN),
    KURKINO_PI ("Куркино",	Prosecutor.TUSHINSKAYA_PROSECUTORS_OFFICE, Court.TUSHINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION,  District.NORTH_WESTERN),
    LEVOBEREZHNIY_PI ("Левобережный", Prosecutor.GOLOVINSKAYA_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTHERN),
    LEFORTOVO_PI ("Лефортово", Prosecutor.LEFORTOVSKAYA_PROSECUTORS_OFFICE, Court.LEFORTOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_EASTERN),
    LIANOZOVO_PI ("Лианозово", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_EASTERN),
    LOMONOSOVCKIY_PI ("Ломоносовский", Prosecutor.GAGARINSKAYA_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_WESTERN),
    LOSINOOSTROVSKIY_PI ("Лосиноостровский", Prosecutor.BABUSHKINSKAYA_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_EASTERN),
    LYUBLINO_PI ("Люблино", Prosecutor.LUBLINSKAYA_PROSECUTORS_OFFICE, Court.LUBLINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_EASTERN),
    MARFINO_PI ("Марфино",	Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTH_EASTERN),
    MARYINA_ROSHA_PI ("Марьина роща",	Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTH_EASTERN),
    MARYINO_PI ("Марьино", Prosecutor.LUBLINSKAYA_PROSECUTORS_OFFICE, Court.LUBLINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_EASTERN),
    METROGORODOK_PI ("Метрогородок", Prosecutor.PREOBRAZHENSKAYA_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.EASTERN),
    MESHANSKIY_PI ("Мещанский", Prosecutor.MESHANSKAYA_PROSECUTORS_OFFICE, Court.MESHANSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.CENTRAL),
    MITINO_PI ("Митино", Prosecutor.TUSHINSKAYA_PROSECUTORS_OFFICE, Court.TUSHINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_WESTERN),
    MOZHAYSKIY_PI ("Можайский", Prosecutor.KUNCEVSKAYA_PROSECUTORS_OFFICE, Court.KUNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.WESTERN),
    MOLZHANINOVSKIY_PI ("Молжаниновский", Prosecutor.GOLOVINSKAYA_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTHERN),
    MOSKVORECHYE_SABUROVO_PI ("Москворечье Сабурово", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTHERN),
    NAGATINO_SADOVNIKI_PI("Нагатино Садовники", Prosecutor.SIMONOVSKAYA_PROSECUTORS_OFFICE, Court.SIMONOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTHERN),
    NAGATINSKIY_ZATON_PI ("Нагатинский затон", Prosecutor.SIMONOVSKAYA_PROSECUTORS_OFFICE, Court.SIMONOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTHERN),
    NAGORNIY_PI ("Нагорный", Prosecutor.CHEREMUSHKINSKAYA_PROSECUTORS_OFFICE, Court.CHERTANOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTHERN),
    NEKRASOVKA_PI ("Некрасовка", Prosecutor.KUZMINSKAYA_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_EASTERN),
    NIZHEGORODSKIY_PI ("Нижегородский", Prosecutor.LEFORTOVSKAYA_PROSECUTORS_OFFICE, Court.LEFORTOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_EASTERN),
    NOVOGIREEVO_PI ("Новогиреево", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.EASTERN),
    NOVOKOSINO_PI ("Новокосино", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.EASTERN),
    NOVO_PERDELKINO_PI ("Ново-Переделкино", Prosecutor.SOLNCEVSKAYA_PROSECUTORS_OFFICE, Court.SOLNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.WESTERN),
    OBRUCHEVSKIY_PI ("Обручевский", Prosecutor.GAGARINSKAYA_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_WESTERN),
    OREHOVO_BORISOVO_NORTH_PI ("Орехово-Борисово Северное", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTHERN),
    OREHOVO_BORISOVO_SOUTH_PI ("Орехово-Борисово Южное", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTHERN),
    OSTANKINSKIY_PI ("Останкинский", Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTH_EASTERN),
    OTRADNOE_PI ("Отрадное", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.NORTHERN),
    OCHAKOVO_MATVEEVSKOE_PI ("Очаково-Матвеевское", Prosecutor.NIKULINSKAYA_PROSECUTORS_OFFICE, Court.NIKULINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.WESTERN),
    PEROVO_PI ("Перово", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.EASTERN),
    PECHATNIKI_PI ("Печатники", Prosecutor.LUBLINSKAYA_PROSECUTORS_OFFICE, Court.LUBLINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_EASTERN),
    POKROVSKOE_STRESHNEVO_PI ("Покровское - Стрешнево",	Prosecutor.TUSHINSKAYA_PROSECUTORS_OFFICE, Court.TUSHINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_EASTERN),
    PREOBRAZHENSKOE_PI ("Преображенское", Prosecutor.PREOBRAZHENSKAYA_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.EASTERN),
    PRESNENSKIY_PI ("Пресненский", Prosecutor.PRESNENSKAYA_PROSECUTORS_OFFICE, Court.PRESNENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.CENTRAL),
    PROCPEKT_VERNADSKOGO_PI ("Проспект Вернадского", Prosecutor.NIKULINSKAYA_PROSECUTORS_OFFICE, Court.NIKULINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.WESTERN),
    RAMENKI_PI ("Раменки", Prosecutor.NIKULINSKAYA_PROSECUTORS_OFFICE, Court.NIKULINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.WESTERN),
    ROSTOKINO_PI ("Ростокино", Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION, District.SOUTH_EASTERN),
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
    private District district;

    Department(String title, Prosecutor prosecutor, Court court, DepartmentType departmentType, District district) {
        this.title = title;
        this.prosecutor = prosecutor;
        this.court = court;
        this.departmentType = departmentType;
        this.district = district;
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
