package manager.CriminalCaseManager.SubjectManager;

import manager.investigatorManager.Investigator;

import java.util.Scanner;

public class subjectManager {

    public Victim addVictim(){
        System.out.println("ДОБАВЛЕНИЕ ПОТЕРПЕВШЕГО");
        System.out.println("Введите фамилию");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String surname = sc.nextLine();
        }
        System.out.println("Введите имя");
        sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String name = sc.nextLine();
        }
        System.out.println("Введите отчество");
        sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String patronymic = sc.nextLine();
        }
        Victim victim = new Victim();
    }
    }
}
