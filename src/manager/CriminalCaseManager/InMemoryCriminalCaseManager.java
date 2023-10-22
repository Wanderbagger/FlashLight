package manager.CriminalCaseManager;

import manager.investigatorManager.Investigator;
import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecision;

import java.time.LocalDateTime;
import java.util.*;

public class InMemoryCriminalCaseManager implements CriminalCaseManager{
    private final Comparator<CriminalCase> criminalCaseComparator = Comparator.comparing(CriminalCase::getNumber);
    private Map<String, CriminalCase> criminalCaseMap;

    @Override
    public void addNewCase(Investigator investigator) {
CriminalCase criminalCase = new CriminalCase(investigator, (LocalDateTime.now().plusMonths(2)), null, null, null, null, null, null)
        criminalCase.setStartDate(LocalDateTime.now());
        criminalCase.setCurrentInvestigator(investigator);
        System.out.println("Введите номер уголовного дела");
        System.out.println("Введите статью");
        System.out.println("Введите место возбуждения уголовного дела");
        System.out.println("Введите номер КУСП");
        System.out.println("Введите фабулу уголовного дела");
        System.out.println("Введите данные фигуранта");
        System.out.println("Введите данные потерпевшего");
        if(!criminalCaseMap.containsKey(criminalCase.getNumber()) && criminalCase != null){
            criminalCaseMap.put(criminalCase.getNumber(), criminalCase);
        }
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
