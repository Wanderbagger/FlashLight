package manager.CriminalCaseManager;

import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecisions;
import manager.LawRuleManager.Article;
import manager.investigatorManager.Investigator;
import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecision;

import java.time.LocalDateTime;
import java.util.*;

public class InMemoryCriminalCaseManager implements CriminalCaseManager{

    private Map<String, CriminalCase> criminalCaseMap;

    @Override
    public void addNewCase(Investigator investigator) {
        Article article = new Article();
        Victim victim = new Victim();
        Suspect suspect = new Suspect();
        Expertise expertise = new Expertise();
        ProceduralDecisions proceduralDecisions = ProceduralDecisions.INITIATION;
        String accusationPlot = "";
        long id = 0;
        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime proceduralTerm = startDate.plusMonths(2);
        boolean isUnderway = true;

        CriminalCase criminalCase = new CriminalCase.CriminalCaseBuilder().currentInvestigator(investigator).article(article).victim(victim).
                suspect(suspect).expertise(expertise).proceduralDecisions(proceduralDecisions).accusationPlot(accusationPlot).id(id).startDate(startDate).
                proceduralTerm(proceduralTerm).isUnderWay(isUnderway).build();

    }

    @Override
    public void deleteCase(String caseId) {
        criminalCaseMap.remove(caseId);
    }

    @Override
    public void printCase(String caseId) {

    }

    @Override
    public void updateCase(CriminalCase CriminalCase) {

    }

    @Override
    public CriminalCase getCaseById(String caseId) {
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
    public HashMap<String, CriminalCase> getActualCriminalCases() {
        return null;
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
