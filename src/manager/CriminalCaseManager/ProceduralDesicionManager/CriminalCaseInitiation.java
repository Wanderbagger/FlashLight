package manager.CriminalCaseManager.ProceduralDesicionManager;

import manager.CriminalCaseManager.SubjectManager.Suspect;
import manager.investigatorManager.Investigator;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class CriminalCaseInitiation extends ProceduralDecision {
    private LocalDate initiationDate; // дата возбуждения уголовного дела
    private LocalTime initiationTime;
    private LocalDate regirtrationDate;
    private String registraionNumber;

    public LocalDate getInitiationDate() {
        return initiationDate;
    }

    public LocalTime getInitiationTime() {
        return initiationTime;
    }

    public LocalDate getRegirtrationDate() {
        return regirtrationDate;
    }

    public String getRegistraionNumber() {
        return registraionNumber;
    }


    @Override
    public CriminalCaseInitiation initiation(Investigator investigator) {
        CriminalCaseInitiation caseInitiation = new CriminalCaseInitiation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Использовать при возбуждении дела текущие дату и время?");
        System.out.println("1 ----- да");
        System.out.println("2 ----- нет");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number == 1) {
                caseInitiation.setInitiationDate(LocalDate.now());
                caseInitiation.setInitiationTime(LocalTime.now());
            } else if (number == 2) {
                System.out.println("Введите дату возбуждения в формате 31-12-2022 через дефис");
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
                LocalDate date = LocalDate.parse(sc.next(), dtf);
                System.out.println(date);
            } else {
                System.out.println("Неверная команда, повторите ввод");
            }
        }
        return caseInitiation;
    }

    public void setInitiationDate(LocalDate initiationDate) {
        this.initiationDate = initiationDate;
    }

    public void setInitiationTime(LocalTime initiationTime) {
        this.initiationTime = initiationTime;
    }

    public void setRegirtrationDate(LocalDate regirtrationDate) {
        this.regirtrationDate = regirtrationDate;
    }

    public void setRegistraionNumber(String registraionNumber) {
        this.registraionNumber = registraionNumber;
    }
}