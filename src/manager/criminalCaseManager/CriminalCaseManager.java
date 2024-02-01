package manager.criminalCaseManager;

import manager.criminalCaseManager.subjectManager.Suspect;
import manager.criminalCaseManager.subjectManager.Victim;
import manager.investigatorManager.Investigator;
import manager.criminalCaseManager.proceduralDesicionManager.ProceduralDecision;

import java.util.Map;

public interface CriminalCaseManager {


    void addNewCase(Investigator investigator);

    void deleteCase(long caseId);

    void printCase(long caseId);

    void updateCase(CriminalCase CriminalCase);

    CriminalCase getCaseById(long caseId);

    void save();

    boolean load();

    Map<Long, CriminalCase> getActualCriminalCases();

    void addNewExpertise(Expertise expertise);

    void editExpertise(Expertise expertise);

    void deleteExpertise(Expertise expertise);

    void addNewProceduralDecision(ProceduralDecision proceduralDecision);

    void editProceduralDecision(ProceduralDecision proceduralDecision);

    void deleteProceduralDecision(ProceduralDecision proceduralDecision);

    void addNewSuspect(Suspect suspect);

    void editSuspect(Suspect suspect);

    void deleteSuspect(Suspect suspect);

    void addNewVictim(Victim victim);

    void editVictim(Victim victim);

    void deleteVictim(Victim victim);

}
