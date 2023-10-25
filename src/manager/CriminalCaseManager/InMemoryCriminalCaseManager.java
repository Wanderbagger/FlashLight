package manager.CriminalCaseManager;

import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecisions;
import manager.LawRuleManager.Article;
import manager.investigatorManager.Investigator;
import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecision;

import java.time.LocalDateTime;
import java.util.*;

public class InMemoryCriminalCaseManager implements CriminalCaseManager{

    private Map<String, CriminalCase> criminalCaseMap;
/*
    private Investigator currentInvestigator; // текущий следователь по делу
    private Article article; // статьи уголовного кодекса
    private Victim victim; // потерпевшие по уголовному делу
    private Suspect suspect; // фигуранты по уголовному делу
    private Expertise expertise; // экспертизы по уголовному делу
    private ProceduralDecisions proceduralDecision; // принятые процессуальные решения по делу;
    private String accusationPlot; // фабула уголовного дела
    private long id;
    private LocalDateTime startDate; // дата возбуждения уголовного дела
    private LocalDateTime proceduralTerm; // процессуальный срок по делу
    private boolean isUnderway = false; // ведется расследование
  */





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
                suspect(suspect).expertise(expertise).proceduralDecisions(proceduralDecisions).accusationPlot(accusationPlot)..build().;

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
