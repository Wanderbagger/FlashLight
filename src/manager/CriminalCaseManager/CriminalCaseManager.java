package manager.CriminalCaseManager;

import manager.CriminalCaseManager.SubjectManager.Suspect;
import manager.CriminalCaseManager.SubjectManager.Victim;
import manager.investigatorManager.Investigator;
import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecision;

import java.util.HashMap;

public interface CriminalCaseManager {


    void addNewCase(Investigator investigator);

    void deleteCase(long caseId);

    void printCase(long caseId);

    void updateCase(CriminalCase CriminalCase);

    CriminalCase getCaseById(long caseId);

    void save();

    boolean load();

    HashMap<String, CriminalCase> getActualCriminalCases();

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

    void editRegistrationNumber (RegistrationNumber registrationNumber);
}
