package lawRulesManagerTest;

import manager.lawRuleManager.Paragraph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParagraphTest {
    Paragraph paragraph = new Paragraph();

    @Test
    public void recognizeTest() {
        Paragraph test = new Paragraph();
        test.setNumber("г");
        test.setDescription("группой лиц по предварительному сговору или организованной группой");

        paragraph = paragraph.recognize("г) группой лиц по предварительному сговору или организованной группой;");

        Assertions.assertEquals(test.getNumber(), paragraph.getNumber());
        Assertions.assertEquals(test.getDescription(), paragraph.getDescription());
    }


}
