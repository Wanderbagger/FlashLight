package investigatorManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InvestigatorManager {
    List <Investigator> investigators = new ArrayList<>(List.of());

    public Investigator chooseInvestigator(){
        Investigator currentInvestigator = null;
        System.out.println("ВЫБОР СЛЕДОВАТЕЛЯ");
        System.out.println("Введите фамилию следователя");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String surname = sc.nextLine();
            for (Investigator investigator : investigators) {
                if(investigator.getName().startsWith(surname)){
                    currentInvestigator = investigator;
                }
            }
        }
        if(currentInvestigator == null){
            currentInvestigator = registration();
        }
        System.out.println(currentInvestigator);
        return currentInvestigator;
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


    public Investigator registration(){
        Investigator investigator = new Investigator();
        System.out.println("РЕГИСТРАЦИЯ СЛЕДОВАТЕЛЯ");
        System.out.println("Введите фамилию, имя, отчество следователя");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String name = sc.nextLine();
            System.out.println(name);
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
        return investigator;
    }
}
