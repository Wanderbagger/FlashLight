package lawRulesManagerTest;

import manager.lawRuleManager.LawRule;
import manager.lawRuleManager.Paragraph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParagraphTest extends Paragraph{
    LawRule paragraph = new Paragraph();
    LawRule test = new Paragraph();
    @Test
    public void shouldRecognizeSimpleString() {
        test.setNumber("г");
        test.setDescription("группой лиц по предварительному сговору или организованной группой");
        paragraph = paragraph.recognize("г) группой лиц по предварительному сговору или организованной группой;");

        Assertions.assertEquals(test.getNumber(), paragraph.getNumber());
        Assertions.assertEquals(test.getDescription(), paragraph.getDescription());
    }

    @Test
    public void shouldRecognizeOtherString() {
        test.setNumber("е.1");
        test.setDescription("по мотиву кровной мести");
        paragraph = paragraph.recognize("е.1) по мотиву кровной мести;");

        Assertions.assertEquals(test.getNumber(), paragraph.getNumber());
        Assertions.assertEquals(test.getDescription(), paragraph.getDescription());
    }

    @Test
    public void shouldReturnNull() {
        paragraph = paragraph.recognize("__________________");
        Assertions.assertNull(paragraph.getNumber());
        Assertions.assertNull(paragraph.getDescription());
    }

}
