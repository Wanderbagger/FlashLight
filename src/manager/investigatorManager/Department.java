package manager.investigatorManager;

public enum Department {

    BASMANNIY_PI ("Басманный", Prosecutor.BASMANNAYA, Court.BASMANNIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.CENTRAL),
    KRASNOSELSKIY_PI ("Красносельский", Prosecutor.MESHANSKAYA, Court.MESHANSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.CENTRAL),
    MESHANSKIY_PI ("Мещанский", Prosecutor.MESHANSKAYA, Court.MESHANSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.CENTRAL),
    PRESNENSKIY_PI ("Пресненский", Prosecutor.PRESNENSKAYA, Court.PRESNENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.CENTRAL),
    ARBAT_PI ("Арбат", Prosecutor.PRESNENSKAYA, Court.PRESNENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.CENTRAL),
    ZAMOSKVORECHYE_PI ("Замоскворечье", Prosecutor.ZAMOSKVORECKAYA, Court.ZAMOSKVORECKIY__COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.CENTRAL),
    HAMOVNIKI_PI ("Хамовники", Prosecutor.HAMOVNICHESKAYA_PROSECUTORS_OFFICE, Court.HAMOVNICHESKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.CENTRAL),
    YAKIMANKA_PI ("Якиманка",	Prosecutor.ZAMOSKVORECKAYA, Court.ZAMOSKVORECKIY__COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.CENTRAL),
    TAGANSKIY_PI ("Таганский", Prosecutor.TAGANSKAYA_PROSECUTORS_OFFICE, Court.TAGANSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.CENTRAL),
    TVERSKOY_PI ("Тверской", Prosecutor.TVERSKAYA_PROSECUTORS_OFFICE, Court.TVERSKOY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.CENTRAL),

    GOLOVINSKIY_PI ("Головинский", Prosecutor.GOLOVINSKAYA_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    AIRPORT_PI ("Аэропорт", Prosecutor.SAVELOVSKAYA_PROSECUTORS_OFFICE, Court.SAVELOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    BEGOVOY_PI ("Беговой", Prosecutor.SAVELOVSKAYA_PROSECUTORS_OFFICE, Court.SAVELOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    BESKUDNIKOVSKIY_PI ("Бескудниковский", Prosecutor.TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE, Court.TIMIRYAZEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    VOYKOVSKIY_PI ("Войковский", Prosecutor.GOLOVINSKAYA_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    DEGUNINO_EAST_PI ("Восточное Дегунино", Prosecutor.TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE, Court.TIMIRYAZEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    DEGUNINO_WEST_PI ("Западное Дегунино", Prosecutor.TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE, Court.TIMIRYAZEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    DMITROVSKIY_PI ("Дмитровский", Prosecutor.TIMIRYAZEVSKAYA_PROSECUTORS_OFFICE, Court.TIMIRYAZEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    KOPTEVO_PI ("Коптево", Prosecutor.KOPTEVSKAYA_PROSECUTORS_OFFICE, Court.KOPTEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    LEVOBEREZHNIY_PI ("Левобережный", Prosecutor.GOLOVINSKAYA_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    MOLZHANINOVSKIY_PI ("Молжаниновский", Prosecutor.GOLOVINSKAYA_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    SAVELOVSKIY_PI ("Савеловский", Prosecutor.SAVELOVSKAYA_PROSECUTORS_OFFICE, Court.SAVELOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    SOKOL_PI ("Сокол", Prosecutor.SAVELOVSKAYA_PROSECUTORS_OFFICE, Court.SAVELOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    TIMIRYAZEXKIY_PI ("Тимирязевский", Prosecutor.KOPTEVSKAYA_PROSECUTORS_OFFICE, Court.KOPTEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    HOROSHEVSKIY_PI ("Хорошевский", Prosecutor.SAVELOVSKAYA_PROSECUTORS_OFFICE, Court.SAVELOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),
    HOVRINO_PI ("Ховрино", Prosecutor.GOLOVINSKAYA_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTHERN),

    ALEKSEEVSKIY_PI ("Алексеевский", Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    ALTUFYEVSKIY_PI ("Алтуфьевский", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    BABUSHKINSKIY_PI ("Бабушкинский", Prosecutor.BABUSHKINSKAYA_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    BIBIREVO_PI ("Бибирево", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    BUTYIRSKIY_PI ("Бутырский", Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    LIANOZOVO_PI ("Лианозово", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    LOSINOOSTROVSKIY_PI ("Лосиноостровский", Prosecutor.BABUSHKINSKAYA_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    MARFINO_PI ("Марфино",	Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    MARYINA_ROSHA_PI ("Марьина роща",	Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    OSTANKINSKIY_PI ("Останкинский", Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    OTRADNOE_PI ("Отрадное", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    ROSTOKINO_PI ("Ростокино", Prosecutor.OSTANKINSKAYA_PROSECUTORS_OFFICE, Court.OSTANKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    SVIBLOVO_PI ("Свиблово", Prosecutor.BABUSHKINSKAYA_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    MEDVEDKOVO_NORTH_PI ("Северное Медведково",	Prosecutor.BABUSHKINSKAYA_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    SEVERNIY_PI("Северный", Prosecutor.BUTYRSKAYA_PROSECUTORS_OFFICE, Court.BUTYRSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    YUZHNOE_MEDVEDKOVO_PI ("Южное Медведково", Prosecutor.BABUSHKINSKAYA_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_EASTERN),
    YAROSLAVSKIY_PI ("Ярославский", Prosecutor.BABUSHKINSKAYA_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL,  District.NORTH_EASTERN),

    BOGORODSKIY_PI ("Богородское", Prosecutor.PREOBRAZHENSKAYA_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    VESHNYAKI_PI ("Вешняки", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    IZMAYLOVO_EAST_PI ("Восточное Измайлово", Prosecutor.IZMAYLOVSKAYA_PROSECUTORS_OFFICE, Court.IZMAYLOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    VOSTOCHNIY_PI ("Восточный", Prosecutor.IZMAYLOVSKAYA_PROSECUTORS_OFFICE, Court.IZMAYLOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    GOLYANOVO_PI ("Гольяново", Prosecutor.PREOBRAZHENSKAYA_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    IVANOVSKOE_PI ("Ивановское", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    IZMAYLOVO_PI ("Измайлово", Prosecutor.IZMAYLOVSKAYA_PROSECUTORS_OFFICE, Court.IZMAYLOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    KOSINO_UHTOMSKIY_PI ("Косино-Ухтомский", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    METROGORODOK_PI ("Метрогородок", Prosecutor.PREOBRAZHENSKAYA_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    NOVOGIREEVO_PI ("Новогиреево", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    NOVOKOSINO_PI ("Новокосино", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    PEROVO_PI ("Перово", Prosecutor.PEROVSKAYA_PROSECUTORS_OFFICE, Court.PEROVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    PREOBRAZHENSKOE_PI ("Преображенское", Prosecutor.PREOBRAZHENSKAYA_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    IZMAYLOVO_NORTH_PI ("Северное Измайлово", Prosecutor.IZMAYLOVSKAYA_PROSECUTORS_OFFICE, Court.IZMAYLOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    SOKOLINAYA_GORA_PI ("Соколиная гора", Prosecutor.IZMAYLOVSKAYA_PROSECUTORS_OFFICE, Court.IZMAYLOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),
    SOKOLNIKI_PI ("Сокольники", Prosecutor.PREOBRAZHENSKAYA_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.EASTERN),

    VYIHINO_ZHULEBINO_PI ("Выхино-Жулебино", Prosecutor.KUZMINSKAYA_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_EASTERN),
    KAPOTNYA_PI ("Капотня", Prosecutor.LUBLINSKAYA_PROSECUTORS_OFFICE, Court.LUBLINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_EASTERN),
    KUZMINKI_PI ("Кузьминки", Prosecutor.KUZMINSKAYA_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_EASTERN),
    LEFORTOVO_PI ("Лефортово", Prosecutor.LEFORTOVSKAYA_PROSECUTORS_OFFICE, Court.LEFORTOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_EASTERN),
    MARYINO_PI ("Марьино", Prosecutor.LUBLINSKAYA_PROSECUTORS_OFFICE, Court.LUBLINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_EASTERN),
    LYUBLINO_PI ("Люблино", Prosecutor.LUBLINSKAYA_PROSECUTORS_OFFICE, Court.LUBLINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_EASTERN),
    NEKRASOVKA_PI ("Некрасовка", Prosecutor.KUZMINSKAYA_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_EASTERN),
    NIZHEGORODSKIY_PI ("Нижегородский", Prosecutor.LEFORTOVSKAYA_PROSECUTORS_OFFICE, Court.LEFORTOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_EASTERN),
    PECHATNIKI_PI ("Печатники", Prosecutor.LUBLINSKAYA_PROSECUTORS_OFFICE, Court.LUBLINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_EASTERN),
    RYAZANSKIY_PI ("Рязанский", Prosecutor.KUZMINSKAYA_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_EASTERN),
    TEKSTILSHIKI_PI ("Текстильщики",	Prosecutor.KUZMINSKAYA_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_EASTERN),
    YUZHNOPORTOVIY_PI ("Южнопортовый", Prosecutor.LEFORTOVSKAYA_PROSECUTORS_OFFICE, Court.LEFORTOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_EASTERN),

    BIRYULEVO_EAST_PI ("Бирюлево Восточное", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    BIRYULEVO_WEST_PI ("Бирюлево Западное", Prosecutor.CHEREMUSHKINSKAYA_PROSECUTORS_OFFICE, Court.CHERTANOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    BRATEEVO_PI ("Братеево", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    DANILOVSKIY_PI ("Даниловский", Prosecutor.SIMONOVSKAYA_PROSECUTORS_OFFICE, Court.SIMONOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    DONSKOY_PI ("Донской", Prosecutor.SIMONOVSKAYA_PROSECUTORS_OFFICE, Court.SIMONOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    ZYABLIKOVO_PI ("Зябликово", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    MOSKVORECHYE_SABUROVO_PI ("Москворечье Сабурово", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    NAGATINO_SADOVNIKI_PI("Нагатино Садовники", Prosecutor.SIMONOVSKAYA_PROSECUTORS_OFFICE, Court.SIMONOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    NAGATINSKIY_ZATON_PI ("Нагатинский затон", Prosecutor.SIMONOVSKAYA_PROSECUTORS_OFFICE, Court.SIMONOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    NAGORNIY_PI ("Нагорный", Prosecutor.CHEREMUSHKINSKAYA_PROSECUTORS_OFFICE, Court.CHERTANOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    OREHOVO_BORISOVO_NORTH_PI ("Орехово-Борисово Северное", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    OREHOVO_BORISOVO_SOUTH_PI ("Орехово-Борисово Южное", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    TSARITSINO_PI ("Царицыно", Prosecutor.NAGATINSKAYA_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    CHERTANOVO_NORTH_PI ("Чертаново Северное", Prosecutor.CHERTANOVSKAYA_PROSECUTORS_OFFICE, Court.CHERTANOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    CHERTANOVO_CENTRAL_PI ("Чертаново Центральное", Prosecutor.CHERTANOVSKAYA_PROSECUTORS_OFFICE, Court.CHERTANOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),
    CHERTANOVO_SOUTH_PI ("Чертаново Южное", Prosecutor.CHERTANOVSKAYA_PROSECUTORS_OFFICE, Court.CHERTANOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTHERN),

    AKADEMICHESKIY_PI ("Академический",	Prosecutor.GAGARINSKAYA_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_WESTERN),
    GAGARINSKIY_PI ("Гагаринский", Prosecutor.GAGARINSKAYA_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_WESTERN),
    ZYUZINO_PI ("Зюзино", Prosecutor.ZUZINSKAYA_PROSECUTORS_OFFICE, Court.ZUZINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_WESTERN),
    KONKOVO_PI ("Коньково", Prosecutor.CHEREMUSHKINSKAYA_PROSECUTORS_OFFICE, Court.CHEREMUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_WESTERN),
    KOTLOVKA_PI ("Котловка",	Prosecutor.ZUZINSKAYA_PROSECUTORS_OFFICE, Court.ZUZINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_WESTERN),
    LOMONOSOVCKIY_PI ("Ломоносовский", Prosecutor.GAGARINSKAYA_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_WESTERN),
    OBRUCHEVSKIY_PI ("Обручевский", Prosecutor.GAGARINSKAYA_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_WESTERN),
    BUTOVO_NORTH_PI ("Северное Бутово", Prosecutor.ZUZINSKAYA_PROSECUTORS_OFFICE, Court.ZUZINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_WESTERN),
    TEPLIY_STAN_PI ("Теплый Стан", Prosecutor.CHEREMUSHKINSKAYA_PROSECUTORS_OFFICE, Court.CHEREMUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_WESTERN),
    CHEREMUSHKIY_PI ("Черемушки", Prosecutor.CHEREMUSHKINSKAYA_PROSECUTORS_OFFICE, Court.CHEREMUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_WESTERN),
    BUTOVO_SOUTH_PI ("Южное Бутово", Prosecutor.ZUZINSKAYA_PROSECUTORS_OFFICE, Court.ZUZINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_WESTERN),
    YASENEVO_PI ("Ясенево", Prosecutor.CHEREMUSHKINSKAYA_PROSECUTORS_OFFICE, Court.CHEREMUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.SOUTH_WESTERN),


    VNUKOVO_PI ("Внуково", Prosecutor.SOLNCEVSKAYA_PROSECUTORS_OFFICE, Court.SOLNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.WESTERN),
    DOROGOMILOVO_PI ("Дорогомилово", Prosecutor.DOROGOMILOVSKAYA_PROSECUTORS_OFFICE, Court.DOROGOMILOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.WESTERN),
    KRYILATSKOE_PI ("Крылатское", Prosecutor.KUNCEVSKAYA_PROSECUTORS_OFFICE, Court.KUNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.WESTERN),
    KUNCEVO_PI ("Кунцево", Prosecutor.KUNCEVSKAYA_PROSECUTORS_OFFICE, Court.KUNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.WESTERN),
    MOZHAYSKIY_PI ("Можайский", Prosecutor.KUNCEVSKAYA_PROSECUTORS_OFFICE, Court.KUNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.WESTERN),
    NOVO_PERDELKINO_PI ("Ново-Переделкино", Prosecutor.SOLNCEVSKAYA_PROSECUTORS_OFFICE, Court.SOLNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.WESTERN),
    OCHAKOVO_MATVEEVSKOE_PI ("Очаково-Матвеевское", Prosecutor.NIKULINSKAYA_PROSECUTORS_OFFICE, Court.NIKULINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.WESTERN),
    PROCPEKT_VERNADSKOGO_PI ("Проспект Вернадского", Prosecutor.NIKULINSKAYA_PROSECUTORS_OFFICE, Court.NIKULINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.WESTERN),
    RAMENKI_PI ("Раменки", Prosecutor.NIKULINSKAYA_PROSECUTORS_OFFICE, Court.NIKULINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.WESTERN),
    SOLNCEVO_PI ("Солнцево",	Prosecutor.SOLNCEVSKAYA_PROSECUTORS_OFFICE, Court.SOLNCEVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.WESTERN),
    TROPAREVO_NIKULINO_PI ("Тропарево-Никулино", Prosecutor.NIKULINSKAYA_PROSECUTORS_OFFICE, Court.NIKULINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.WESTERN),
    FILEVSKIY_PARK_PI ("Филевский парк", Prosecutor.DOROGOMILOVSKAYA_PROSECUTORS_OFFICE, Court.DOROGOMILOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.WESTERN),
    FILI_DAVYIDKOVO_PI ("Фили-Давыдково", Prosecutor.DOROGOMILOVSKAYA_PROSECUTORS_OFFICE, Court.DOROGOMILOVSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.WESTERN),

    KURKINO_PI ("Куркино",	Prosecutor.TUSHINSKAYA_PROSECUTORS_OFFICE, Court.TUSHINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL,  District.NORTH_WESTERN),
    MITINO_PI ("Митино", Prosecutor.TUSHINSKAYA_PROSECUTORS_OFFICE, Court.TUSHINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_WESTERN),
    POKROVSKOE_STRESHNEVO_PI ("Покровское - Стрешнево",	Prosecutor.TUSHINSKAYA_PROSECUTORS_OFFICE, Court.TUSHINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_WESTERN),
    TUSHINO_NORTH_PI ("Северное Тушино", Prosecutor.TUSHINSKAYA_PROSECUTORS_OFFICE, Court.TUSHINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_WESTERN),
    STROGINO_PI ("Строгино", Prosecutor.HOROSHEVCKAYA_PROSECUTORS_OFFICE, Court.HOROSHEVCKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_WESTERN),
    HOROSHEVO_MNEVNIKI_PI ("Хорошево-Мневники", Prosecutor.HOROSHEVCKAYA_PROSECUTORS_OFFICE, Court.HOROSHEVCKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_WESTERN),
    TSHUKINO_PI ("Щукино", Prosecutor.HOROSHEVCKAYA_PROSECUTORS_OFFICE, Court.HOROSHEVCKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_WESTERN),
    TUSHINO_SOUTH_PI ("Южное Тушино", Prosecutor.TUSHINSKAYA_PROSECUTORS_OFFICE, Court.TUSHINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.NORTH_WESTERN),

    UNIT_7_MAIN_PI("7 отдел", Prosecutor.MAIN_CITY_PROSECUTORS_OFFICE, Court.TVERSKOY_COURT, DepartmentType.POLICE_INVESTIGATION_MAIN_DEPARTMENT, District.MAIN_CITY),
    UNIT_8_MAIN_PI("8 отдел", Prosecutor.MAIN_CITY_PROSECUTORS_OFFICE, Court.TVERSKOY_COURT, DepartmentType.POLICE_INVESTIGATION_MAIN_DEPARTMENT, District.MAIN_CITY),
    UNIT_9_MAIN_PI("9 отдел", Prosecutor.MAIN_CITY_PROSECUTORS_OFFICE, Court.TVERSKOY_COURT, DepartmentType.POLICE_INVESTIGATION_MAIN_DEPARTMENT, District.MAIN_CITY),
    UNIT_10_MAIN_PI("10 отдел", Prosecutor.MAIN_CITY_PROSECUTORS_OFFICE, Court.TVERSKOY_COURT, DepartmentType.POLICE_INVESTIGATION_MAIN_DEPARTMENT, District.MAIN_CITY),
    UNIT_11_MAIN_PI("11 отдел", Prosecutor.MAIN_CITY_PROSECUTORS_OFFICE, Court.TVERSKOY_COURT, DepartmentType.POLICE_INVESTIGATION_MAIN_DEPARTMENT, District.MAIN_CITY),
    UNIT_12_MAIN_PI("12 отдел", Prosecutor.MAIN_CITY_PROSECUTORS_OFFICE, Court.TVERSKOY_COURT, DepartmentType.POLICE_INVESTIGATION_MAIN_DEPARTMENT, District.MAIN_CITY),

    UNIT_1_CENTRAL_DISTRICT_PI("1 отдел", Prosecutor.CENTRAL_ADMINISRATIVE_DISTRICT, Court.TAGANSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.CENTRAL),
    UNIT_2_CENTRAL_DISTRICT_PI("2 отдел", Prosecutor.CENTRAL_ADMINISRATIVE_DISTRICT, Court.TAGANSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.CENTRAL),
    UNIT_3_CENTRAL_DISTRICT_PI("3 отдел", Prosecutor.CENTRAL_ADMINISRATIVE_DISTRICT, Court.TAGANSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.CENTRAL),
    UNIT_4_CENTRAL_DISTRICT_PI("4 отдел", Prosecutor.CENTRAL_ADMINISRATIVE_DISTRICT, Court.TAGANSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.CENTRAL),

    UNIT_1_EASTERN_DISTRICT_PI("1 отдел", Prosecutor.EASTERN_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.EASTERN),
    UNIT_2_EASTERN_DISTRICT_PI("2 отдел", Prosecutor.EASTERN_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.EASTERN),
    UNIT_3_EASTERN_DISTRICT_PI("3 отдел", Prosecutor.EASTERN_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.EASTERN),
    UNIT_4_EASTERN_DISTRICT_PI("4 отдел", Prosecutor.EASTERN_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.PREOBRAZHENSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.EASTERN),

    UNIT_1_NORTH_EASTERN_DISTRICT_PI("1 отдел", Prosecutor.NORTH_EASTERN_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.NORTH_EASTERN),
    UNIT_2_NORTH_EASTERN_DISTRICT_PI("2 отдел", Prosecutor.NORTH_EASTERN_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.NORTH_EASTERN),
    UNIT_3_NORTH_EASTERN_DISTRICT_PI("3 отдел", Prosecutor.NORTH_EASTERN_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.NORTH_EASTERN),
    UNIT_4_NORTH_EASTERN_DISTRICT_PI("4 отдел", Prosecutor.NORTH_EASTERN_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.BABUSHKINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.NORTH_EASTERN),

    UNIT_1_NORTHERN_DISTRICT_PI("1 отдел", Prosecutor.NORTH_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.NORTHERN),
    UNIT_2_NORTHERN_DISTRICT_PI("2 отдел", Prosecutor.NORTH_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.NORTHERN),
    UNIT_3_NORTHERN_DISTRICT_PI("3 отдел", Prosecutor.NORTH_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.NORTHERN),
    UNIT_4_NORTHERN_DISTRICT_PI("4 отдел", Prosecutor.NORTH_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.GOLOVINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.NORTHERN),

    UNIT_1_NORTH_WESTERN_DISTRICT_PI("1 отдел", Prosecutor.NORTHWEST_DISTRICT_PROSECUTORS_OFFICE, Court.HOROSHEVCKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.NORTH_WESTERN),
    UNIT_2_NORTH_WESTERN_DISTRICT_PI("2 отдел", Prosecutor.NORTHWEST_DISTRICT_PROSECUTORS_OFFICE, Court.HOROSHEVCKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.NORTH_WESTERN),
    UNIT_3_NORTH_WESTERN_DISTRICT_PI("3 отдел", Prosecutor.NORTHWEST_DISTRICT_PROSECUTORS_OFFICE, Court.HOROSHEVCKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.NORTH_WESTERN),
    UNIT_4_NORTH_WESTERN_DISTRICT_PI("4 отдел", Prosecutor.NORTHWEST_DISTRICT_PROSECUTORS_OFFICE, Court.HOROSHEVCKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.NORTH_WESTERN),

    UNIT_1_WESTERN_DISTRICT_PI("1 отдел", Prosecutor.WESTERN_DISTRICT_PROSECUTORS_OFFICE, Court.NIKULINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.WESTERN),
    UNIT_2_WESTERN_DISTRICT_PI("2 отдел", Prosecutor.WESTERN_DISTRICT_PROSECUTORS_OFFICE, Court.NIKULINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.WESTERN),
    UNIT_3_WESTERN_DISTRICT_PI("3 отдел", Prosecutor.WESTERN_DISTRICT_PROSECUTORS_OFFICE, Court.NIKULINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.WESTERN),
    UNIT_4_WESTERN_DISTRICT_PI("4 отдел", Prosecutor.WESTERN_DISTRICT_PROSECUTORS_OFFICE, Court.NIKULINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.WESTERN),

    UNIT_1_SOUTH_WESTERN_DISTRICT_PI ("1 отдел", Prosecutor.SOUTHWEST_DISTRICT_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.SOUTH_WESTERN),
    UNIT_2_SOUTH_WESTERN_DISTRICT_PI ("2 отдел", Prosecutor.SOUTHWEST_DISTRICT_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.SOUTH_WESTERN),
    UNIT_3_SOUTH_WESTERN_DISTRICT_PI ("3 отдел", Prosecutor.SOUTHWEST_DISTRICT_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.SOUTH_WESTERN),
    UNIT_4_SOUTH_WESTERN_DISTRICT_PI ("4 отдел", Prosecutor.SOUTHWEST_DISTRICT_PROSECUTORS_OFFICE, Court.GAGARINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.SOUTH_WESTERN),

    UNIT_1_SOUTHERN_DISTRICT_PI ("1 отдел", Prosecutor.SOUTH_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.SOUTHERN),
    UNIT_2_SOUTHERN_DISTRICT_PI ("2 отдел", Prosecutor.SOUTH_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.SOUTHERN),
    UNIT_3_SOUTHERN_DISTRICT_PI ("3 отдел", Prosecutor.SOUTH_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.SOUTHERN),
    UNIT_4_SOUTHERN_DISTRICT_PI ("4 отдел", Prosecutor.SOUTH_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.NAGATINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.SOUTHERN),

    UNIT_1_SOUTH_EASTERN_DISTRICT_PI ("1 отдел", Prosecutor.SOUTH_EASTERN_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.SOUTH_EASTERN),
    UNIT_2_SOUTH_EASTERN_DISTRICT_PI ("2 отдел", Prosecutor.SOUTH_EASTERN_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.SOUTH_EASTERN),
    UNIT_3_SOUTH_EASTERN_DISTRICT_PI ("3 отдел", Prosecutor.SOUTH_EASTERN_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.SOUTH_EASTERN),
    UNIT_4_SOUTH_EASTERN_DISTRICT_PI ("4 отдел", Prosecutor.SOUTH_EASTERN_ADMINISRATIVE_DISTRICT_PROSECUTORS_OFFICE, Court.KUZMINSKIY_COURT, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.SOUTH_EASTERN),

    ZELENOGRAD_DISTRICT_PI("", Prosecutor.ZELENOGRAD_DISTRICT, Court.ZELENOGRAD, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.ZELENOGRAD),
    MATUSHKINO_SAVELKI_PI("Матушкино-Савелки", Prosecutor.ZELENOGRAD_DISTRICT, Court.ZELENOGRAD, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.ZELENOGRAD),
    SILINO_STAROE_KRYUKOVO_PI("Силино и Старое Крюково", Prosecutor.ZELENOGRAD_DISTRICT, Court.ZELENOGRAD, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.ZELENOGRAD),
    KRYUKOVO_PI("Крюково", Prosecutor.ZELENOGRAD_DISTRICT, Court.ZELENOGRAD, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.ZELENOGRAD),

    TROITSKIY_PI("Троицкий", Prosecutor.TINAO_DISTRICT, Court.TROICKIY, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.TINAO),
    KURILOSKOE_PI("Куриловское", Prosecutor.TINAO_DISTRICT, Court.TROICKIY, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.TINAO),
    KRASNOSELSKOE_PI("Красносельское", Prosecutor.TINAO_DISTRICT, Court.TROICKIY, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.TINAO),

    TINAO_TROICKIY_DISTRICT_PI ("Следственный отдел", Prosecutor.TINAO_DISTRICT, Court.TROICKIY, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.TINAO),
    TINAO_TSHERBINSKIY_DISTRICT_PI ("Следственный отдел", Prosecutor.TINAO_DISTRICT, Court.TSHERBINSKIY, DepartmentType.POLICE_INVESTIGATION_DISTRICT, District.TINAO),

    KOMMUNARSKIY_PI("Коммунарский", Prosecutor.TINAO_DISTRICT, Court.TSHERBINSKIY, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.TINAO),
    MOSKOVSKIY_PI("Московский", Prosecutor.TINAO_DISTRICT, Court.TSHERBINSKIY, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.TINAO),
    TSHERBINSKIY_PI("Щербинский", Prosecutor.TINAO_DISTRICT, Court.TSHERBINSKIY, DepartmentType.POLICE_INVESTIGATION_TERRITORIAL, District.TINAO);

    private final String title;
    private final Prosecutor prosecutor;
    private final Court court;
    private final DepartmentType departmentType;
    private final District district;

    Department(String title, Prosecutor prosecutor, Court court, DepartmentType departmentType, District district) {
        this.title = title;
        this.prosecutor = prosecutor;
        this.court = court;
        this.departmentType = departmentType;
        this.district = district;
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public String getTitle() {
        if (departmentType.equals(DepartmentType.POLICE_INVESTIGATION_TERRITORIAL)) {
            return "СО Отдела МВД России по району " + title + " г. Москвы";
        } else if (departmentType.equals(DepartmentType.POLICE_INVESTIGATION_DISTRICT)){
            return title  + " СЧ СУ УВД по " + district.getTitle() + " ГУ МВД России по г. Москве";
        } else if (departmentType.equals(DepartmentType.POLICE_INVESTIGATION_MAIN_DEPARTMENT)){
            return title  + " СЧ ГСУ ГУ МВД России по г. Москве";
        } else if (departmentType.equals(DepartmentType.INVESIGATE_COMITEE)) {
            return "СО Отдела МВД России по району " + title + " г. Москвы";
        } else if (departmentType.equals(DepartmentType.POLICE_INQUIRI)) {
            return "ОД Отдела МВД России по району " + title + " г. Москвы";
        }
         return null;
    }
}