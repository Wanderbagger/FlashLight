import manager.LawRuleManager.LawRulesManager;
import manager.MenuManager;

public class Main {
    public static void main(String[] args) {
        LawRulesManager lawRulesManager = new LawRulesManager();
        lawRulesManager.initializeCriminalCode();
        MenuManager menuManager = new MenuManager();
        menuManager.start();
    }
}
