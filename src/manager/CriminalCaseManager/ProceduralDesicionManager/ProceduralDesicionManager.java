package manager.CriminalCaseManager.ProceduralDesicionManager;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProceduralDesicionManager {
    List<ProceduralDecision> proceduralDecisionArrayList = new ArrayList<>();

public CriminalCaseInitiation initiationInput(){

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);

    LocalDate date = LocalDate.parse("23-02-2019", dtf);
    System.out.println(date);
    String number = "6554";
    return new CriminalCaseInitiation(date, LocalTime.now(), LocalDate.now(), number);
}





}
