package manager.investigatorManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvestigatorManager {
    List <Investigator> investigators = new ArrayList<>();

    public Investigator chooseInvestigator(){
        investigators.add(new Investigator("Шляхов Юрий Олегович", InvestigatorPosition.INVESTIGATOR, InvestigatorRank.LIEUTENANT, Department.ARBAT_PI));
        Investigator currentInvestigator = null;
        System.out.println("ВЫБОР СЛЕДОВАТЕЛЯ");
        System.out.println("Введите фамилию следователя");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String name = sc.nextLine();
            for (Investigator investigator : investigators) {
                if(investigator.getName().startsWith(name)){ // проверка наличия следователя в базе
                    System.out.println("Следователь " + investigator.getName() + " найден в базе");
                    currentInvestigator = investigator;
                }
            }
        }
        if(currentInvestigator == null){
            System.out.println("Следователь не найден, необходимо зарегистрироваться");
            currentInvestigator = registration();
            investigators.add(currentInvestigator);
        }
        System.out.println(currentInvestigator);
        return currentInvestigator;
    }

    public Investigator registration(){
        Investigator investigator = new Investigator(null, null, null, null);
        System.out.println("РЕГИСТРАЦИЯ СЛЕДОВАТЕЛЯ");
        System.out.println("Введите фамилию, имя, отчество следователя");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String name = sc.nextLine();
            investigator.setName(name);
        } else {
        System.out.println("Неверная команда, повторите ввод");
    }
        System.out.println("Выберите звание");
        printRanks();
        sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if(num < InvestigatorRank.values().length) {
                investigator.setRank(chooseRank(num));
            }
        } else {
            System.out.println("Неверная команда, повторите ввод");
        }
        System.out.println("Выберите отдел");
        printDepartments();
        sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if(num < Department.values().length) {
                 investigator.setDepartment(chooseDepartment(num));
            }
        } else {
            System.out.println("Неверная команда, повторите ввод");
        }
        System.out.println("Выберите должность");
        printPositions(investigator.getDepartment());
        sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if(num < InvestigatorPosition.values().length) {
                investigator.setPosition(choosePosition(num));
            }
        } else {
            System.out.println("Неверная команда, повторите ввод");
        }
        if(investigator.getName() != null && investigator.getRank() != null && investigator.getDepartment() != null && investigator.getPosition()!=null) {
            System.out.println(investigators);
            return investigator;
        }
        System.out.println("Ошибка, повторите регистрацию");
        return null;
    }

    public InvestigatorRank chooseRank(int num){
        List<InvestigatorRank> ranks = new ArrayList<>(List.of(InvestigatorRank.values()));
        for (int i = 0; i < ranks.size(); i++) {
            if(i == num){
                return ranks.get(i);
            }
        }
        return null;
    }

    public Department chooseDepartment(int num){
        List<Department> departments = new ArrayList<>(List.of(Department.values()));
        for (int i = 0; i < departments.size(); i++) {
            if(i == num){
                return departments.get(i);
            }
        }
        return null;
    }

    public InvestigatorPosition choosePosition (int num){
        List<InvestigatorPosition> positions = new ArrayList<>(List.of(InvestigatorPosition.values()));
        for (int i = 0; i < positions.size(); i++) {
            if(i == num){
                return positions.get(i);
            }
        }
        return null;
    }

    public void printRanks(){
        List<InvestigatorRank> ranks = new ArrayList<>(List.of(InvestigatorRank.values()));
        for (int i = 0; i < ranks.size(); i++) {
            System.out.println(i + " --------- " + ranks.get(i).getTitle());
        }
    }

    public void printDepartments(){
        List<Department> departments = new ArrayList<>(List.of(Department.values()));
        for (int i = 0; i < departments.size(); i++) {
            System.out.println(i + " --------- " + departments.get(i).getTitle());
        }
    }

    public void printPositions(Department department){
        List<InvestigatorPosition> positions = new ArrayList<>(List.of(InvestigatorPosition.values()));
        for (int i = 0; i < positions.size(); i++) {
            System.out.println(i + " --------- " + positions.get(i).getTitle());
            if(i == 1 && department.getDepartmentType() == DepartmentType.POLICE_INVESTIGATION_TERRITORIAL){
                i += 2;
            }
        }
    }
}
