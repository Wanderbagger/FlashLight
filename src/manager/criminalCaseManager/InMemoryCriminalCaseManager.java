package manager.criminalCaseManager;

import manager.criminalCaseManager.proceduralDesicionManager.CriminalCaseInitiation;
import manager.criminalCaseManager.proceduralDesicionManager.ProceduralDecision;
import manager.criminalCaseManager.subjectManager.SubjectManager;
import manager.criminalCaseManager.subjectManager.Suspect;
import manager.criminalCaseManager.subjectManager.Victim;
import manager.investigatorManager.Investigator;
import manager.lawRuleManager.LawRulesManager;

import java.time.LocalDate;
import java.util.*;

public class InMemoryCriminalCaseManager implements CriminalCaseManager{

    private Map<Long, CriminalCase> criminalCaseMap = new HashMap<>();

    public String inputStringData(String message, Scanner scanner){
        System.out.println("Введите " + message);
        String data = "";

        if (scanner.hasNext()) {
            data =  scanner.nextLine();
        }
        return data;
    }

    public long inputLongData(String message, Scanner scanner){
        System.out.println("Введите " + message);

        long data = 0;

        if (scanner.hasNextLong()) {
            data =  scanner.nextLong();
        }

        return data;
    }

    @Override
    public void addNewCase(Investigator investigator) {
        Scanner scanner = new Scanner(System.in);
        LawRulesManager lawRulesManager = new LawRulesManager();
        SubjectManager subjectManager = new SubjectManager();
        CriminalCaseInitiation criminalCaseInitiation = new CriminalCaseInitiation();
        Expertise expertise = new Expertise();
        long id = inputLongData("номер уголовного дела", scanner);

        CriminalCase criminalCase = new CriminalCase.CriminalCaseBuilder().currentInvestigator(investigator).article(lawRulesManager.chooseArticle())
                .victim(subjectManager.addVictim()).suspect(subjectManager.addSuspect()).expertise(expertise).initiation(criminalCaseInitiation.initiation(investigator))
                .accusationPlot(inputStringData("фабулу уголовного дела", scanner)).id(id).proceduralTerm(LocalDate.now().plusMonths(2)).isUnderWay(true).build();
        criminalCaseMap.put(id, criminalCase);
        scanner.close();
    }



    @Override
    public void deleteCase(long caseId) {
        criminalCaseMap.remove(caseId);
    }

    @Override
    public void printCase(long caseId) {

    }

    @Override
    public void updateCase(CriminalCase CriminalCase) {

    }

    @Override
    public CriminalCase getCaseById(long caseId) {
        return null;
    }

    @Override
    public void save() {

    }

    @Override
    public boolean load() {
        return false;
    }

    @Override
    public Map<Long, CriminalCase> getActualCriminalCases() {
        return criminalCaseMap;
    }

    @Override
    public void addNewExpertise(Expertise expertise) {

    }

    @Override
    public void editExpertise(Expertise expertise) {

    }

    @Override
    public void deleteExpertise(Expertise expertise) {

    }

    @Override
    public void addNewProceduralDecision(ProceduralDecision proceduralDecision) {

    }

    @Override
    public void editProceduralDecision(ProceduralDecision proceduralDecision) {

    }

    @Override
    public void deleteProceduralDecision(ProceduralDecision proceduralDecision) {

    }


    @Override
    public void addNewSuspect(Suspect suspect) {

    }

    @Override
    public void editSuspect(Suspect suspect) {

    }

    @Override
    public void deleteSuspect(Suspect suspect) {

    }

    @Override
    public void addNewVictim(Victim victim) {

    }

    @Override
    public void editVictim(Victim victim) {

    }

    @Override
    public void deleteVictim(Victim victim) {

    }

}