package manager.CriminalCaseManager.ProceduralDesicionManager;

import java.time.LocalDate;
import java.time.LocalTime;

public class CriminalCaseInitiation {
    private final LocalDate initiationDate; // дата возбуждения уголовного дела
    private final LocalTime initiationTime;
    private final LocalDate regirtrationDate;
    private final String registraionNumber;

    public CriminalCaseInitiation(LocalDate initiationDate, LocalTime initiationTime, LocalDate regirtrationDate, String registraionNumber) {
        this.initiationDate = initiationDate;
        this.initiationTime = initiationTime;
        this.regirtrationDate = regirtrationDate;
        this.registraionNumber = registraionNumber;
    }

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
}
