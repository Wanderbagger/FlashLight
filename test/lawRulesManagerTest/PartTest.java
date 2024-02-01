package lawRulesManagerTest;

import manager.lawRuleManager.Part;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PartTest {

    Part part = new Part();
    @Test
    public void recognizeTest() {
        String text = "3. Деяния, предусмотренные частями первой или второй настоящей статьи, совершенные:";
        Part testPart = new Part();
        testPart.setNumber("3");
        testPart.setDescription("Деяния, предусмотренные частями первой или второй настоящей статьи, совершенные:");
        part = part.recognize(text);

        Assertions.assertEquals(testPart.getNumber(), part.getNumber());
        Assertions.assertEquals(testPart.getDescription(), part.getDescription());
    }
}


