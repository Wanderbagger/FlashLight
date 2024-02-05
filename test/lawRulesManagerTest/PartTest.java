package lawRulesManagerTest;

import manager.lawRuleManager.LawRule;
import manager.lawRuleManager.Part;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PartTest extends Part{

    LawRule part = new Part();
    LawRule testPart = new Part();

    @Test
    public void shouldRecognizeSimpleString() {
        String text = "3. Деяния, предусмотренные частями первой или второй настоящей статьи, совершенные:";
        testPart.setNumber("3");
        testPart.setDescription("Деяния, предусмотренные частями первой или второй настоящей статьи, совершенные:");
        part = part.recognize(text);

        Assertions.assertEquals(testPart.getNumber(), part.getNumber());
        Assertions.assertEquals(testPart.getDescription(), part.getDescription());
    }

    @Test
    public void shouldRecognizeOtherString() {
        String text = "2.1. Деяние, предусмотренное частью второй настоящей статьи, совершенное арбитражным управляющим или председателем ликвидационной комиссии (ликвидатором), а равно контролирующим должника лицом либо руководителем этого контролирующего лица, -";
        testPart.setNumber("2.1");
        testPart.setDescription("Деяние, предусмотренное частью второй настоящей статьи, совершенное арбитражным управляющим или председателем ликвидационной комиссии (ликвидатором), а равно контролирующим должника лицом либо руководителем этого контролирующего лица");
        part = part.recognize(text);
        Assertions.assertEquals(testPart.getNumber(), part.getNumber());
        Assertions.assertEquals(testPart.getDescription(), part.getDescription());
    }

}


