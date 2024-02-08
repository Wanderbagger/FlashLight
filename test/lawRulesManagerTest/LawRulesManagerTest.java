package lawRulesManagerTest;

import manager.lawRuleManager.LawRulesManager;
import manager.lawRuleManager.LineType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LawRulesManagerTest {
    LawRulesManager lawRulesManager = new LawRulesManager();

    @Test
    public void ShouldAssertEquals(){
        Assertions.assertEquals(LineType.ERROR, lawRulesManager.chooseType(""));
        Assertions.assertEquals(LineType.ARTICLE, lawRulesManager.chooseType("Статья 201.3. Отказ или уклонение лица, подвергнутого административному "));
        Assertions.assertEquals(LineType.PART, lawRulesManager.chooseType("1. Использование частным нотариусом или частным аудитором своих полномочий вопреки задачам своей деятельности и в целях извле"));
        Assertions.assertEquals(LineType.PARAGRAPH, lawRulesManager.chooseType("а) совершенное организованной группой;"));
        Assertions.assertEquals(LineType.NOTE, lawRulesManager.chooseType("Примечание. Лицо, совершившее преступление, предусмотренное частью первой настоящей ст"));
    }
}
