import investigator.Investigator;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CriminalCase {
    Investigator currentInvestigator; // текущий следователь по делу
    ArrayList<Investigator>investigators; // следователи, которые вели расследование по делу
    ArrayList <Article> articles; // статьи уголовного кодекса
    ArrayList <Victim> victims; // потерпевшие по уголовному делу
    ArrayList <Suspect> suspects; // фигуранты по уголовному делу
    ArrayList <Expertise> expertiseArrayList; // экспертизы по уголовному делу
    LocalDateTime proceduralTerm; // процессуальный срок по делу
    ArrayList <ProceduralDecision> proceduralDecisions; // принятые процессуальные решения по делу;
    String accusationPlot; // фабула уголовного дела
}
