package manager.CriminalCaseManager;

import java.util.ArrayList;
import java.util.HashMap;

public class CriminalCaseManager {
    private HashMap <String, CriminalCase> criminalCaseHashMap;



    public void addNewCase(CriminalCase criminalCase){
        if(!criminalCaseHashMap.containsKey(criminalCase.getNumber())){
            criminalCaseHashMap.put(criminalCase.getNumber(), criminalCase);
        } else {
            System.out.println("ТАКОЕ ДЕЛО УЖЕ ЕСТЬ В БАЗЕ");
        }
    }


}
