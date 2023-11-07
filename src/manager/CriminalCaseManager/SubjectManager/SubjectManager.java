package manager.CriminalCaseManager.SubjectManager;

import java.util.Scanner;

public class SubjectManager {

    public Victim addVictim(){
        String surname = "";
        String firstName = "";
        String patronymic = "";
        System.out.println("ДОБАВЛЕНИЕ ПОТЕРПЕВШЕГО");
        System.out.println("Введите фамилию");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            surname = sc.nextLine();
        }
        System.out.println("Введите имя");
        sc = new Scanner(System.in);
        if (sc.hasNext()) {
            firstName = sc.nextLine();
        }
        System.out.println("Введите отчество");
        sc = new Scanner(System.in);
        if (sc.hasNext()) {
            patronymic = sc.nextLine();
        }
        Victim victim = new Victim(surname, firstName, patronymic);
        return victim;
    }
    }

