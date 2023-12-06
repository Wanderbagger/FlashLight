package manager.CriminalCaseManager;

import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecision;
import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecisions;
import manager.CriminalCaseManager.SubjectManager.SubjectManager;
import manager.CriminalCaseManager.SubjectManager.Suspect;
import manager.CriminalCaseManager.SubjectManager.Victim;
import manager.LawRuleManager.Article;
import manager.investigatorManager.Investigator;
import manager.LawRuleManager.LawRulesManager;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class InMemoryCriminalCaseManager implements CriminalCaseManager{

    private Map<Long, CriminalCase> criminalCaseMap = new HashMap<>();

    public String inputData(){
        System.out.println("Введите фабулу преступления");
        Scanner scanner = new Scanner(System.in);
        String data = "";

        if (scanner.hasNext()) {
            data =  scanner.nextLine();
        }
        scanner.close();
        return data;
    }

    @Override
    public void addNewCase(Investigator investigator) {
        LawRulesManager lawRulesManager = new LawRulesManager();
        SubjectManager subjectManager = new SubjectManager();
        Expertise expertise = new Expertise();
        long id = 1111;

        CriminalCase criminalCase = new CriminalCase.CriminalCaseBuilder().currentInvestigator(investigator).article(lawRulesManager.chooseArticle())
                .victim(subjectManager.addVictim()).suspect(subjectManager.addSuspect()).expertise(expertise).proceduralDecisions(ProceduralDecisions.INITIATION)
                .accusationPlot(inputData()).id(id).initiationDate(LocalDate.now()).initiationTime(LocalTime.now()).
                proceduralTerm(LocalDate.now().plusMonths(2)).isUnderWay(true).build();
        criminalCaseMap.put(id, criminalCase);
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

    @Override
    public void editRegistrationNumber(RegistrationNumber registrationNumber) {

    }
}