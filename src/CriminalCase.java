import article.Article;
import investigator.Investigator;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CriminalCase {
    private Investigator currentInvestigator; // текущий следователь по делу
    private ArrayList<Investigator>investigators; // следователи, которые вели расследование по делу
    private ArrayList <Article> articles; // статьи уголовного кодекса
    private ArrayList <Victim> victims; // потерпевшие по уголовному делу
    private ArrayList <Suspect> suspects; // фигуранты по уголовному делу
    private ArrayList <Expertise> expertiseArrayList; // экспертизы по уголовному делу
    private LocalDateTime proceduralTerm; // процессуальный срок по делу
    private ArrayList <ProceduralDecision> proceduralDecisions; // принятые процессуальные решения по делу;
    private String accusationPlot; // фабула уголовного дела
}
