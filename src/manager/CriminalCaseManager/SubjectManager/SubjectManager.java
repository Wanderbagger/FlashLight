package manager.CriminalCaseManager.SubjectManager;

import java.util.Scanner;

public class SubjectManager {

    public Victim addVictim() {
        Victim victim = new Victim();
        String firstName = "";
        String patronymic = "";
        System.out.println("ДОБАВЛЕНИЕ ПОТЕРПЕВШЕГО");
        System.out.println("Введите фамилию");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            victim.setSurname(sc.nextLine());
        }
        System.out.println("Введите имя");
        sc = new Scanner(System.in);
        if (sc.hasNext()) {
            victim.setFirstName(sc.nextLine());
        }
        System.out.println("Введите отчество");
        sc = new Scanner(System.in);
        if (sc.hasNext()) {
            victim.setPatronymic(sc.nextLine());
        }
        return victim;
    }

    public Suspect addSuspect() {
        Suspect suspect = new Suspect();
        System.out.println("ДОБАВЛЕНИЕ ФИГУРАНТА");
        System.out.println("Введите фамилию");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            suspect.setSurname(sc.nextLine());
        }
        System.out.println("Введите имя");
        sc = new Scanner(System.in);
        if (sc.hasNext()) {
            suspect.setFirstName(sc.nextLine());
        }
        System.out.println("Введите отчество");
        sc = new Scanner(System.in);
        if (sc.hasNext()) {
            suspect.setPatronymic(sc.nextLine());
        }
        return suspect;
    }
}

