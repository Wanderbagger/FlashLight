package investigatorManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InvestigatorManager {
    List <Investigator> investigators = new ArrayList<>();

    public Investigator chooseInvestigator(){
        Investigator currentInvestigator = null;
        System.out.println("ВЫБОР СЛЕДОВАТЕЛЯ");
        System.out.println("Введите фамилию следователя");
        Scanner sc = new Scanner(System.in);
        String surname = sc.toString();
        if (sc.hasNext()) {
            for (Investigator investigator : investigators) {
                if(investigator.getName().startsWith(surname)){
                    currentInvestigator = investigator;
                }
            }
        }
        if(currentInvestigator == null){
            currentInvestigator = registration();
        }
        return currentInvestigator;
    }

    public Investigator registration(){
        Investigator investigator = new Investigator();
        System.out.println("РЕГИСТРАЦИЯ СЛЕДОВАТЕЛЯ");
        System.out.println("Введите фамилию, имя, отчество следователя");
        Scanner sc = new Scanner(System.in);
        /*
        if (sc.hasNext()) {
            investigator.setName(sc.toString());
        } else {
        System.out.println("Неверная команда, повторите ввод");
    }

        System.out.println("Выберите звание");
        System.out.println(Arrays.toString(InvestigatorRank.values()));
        sc = new Scanner(System.in);

         */
        if (sc.hasNext()) {
            System.out.println(sc.toString());
            System.out.println(InvestigatorRank.valueOf(sc.toString()));
            investigator.setRank(InvestigatorRank.valueOf(sc.toString()));
        } else {
            System.out.println("Неверная команда, повторите ввод");
        }

        System.out.println("Выберите отдел");
        sc = new Scanner(System.in);
        if (sc.hasNext()) {
            investigator.setDepartment(Department.valueOf(sc.toString()));
        } else {
            System.out.println("Неверная команда, повторите ввод");
        }
        return investigator;
    }
}
