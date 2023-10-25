package manager.CriminalCaseManager;

import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecision;
import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecisions;
import manager.LawRuleManager.Article;
import manager.investigatorManager.Investigator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CriminalCase {
    private Investigator currentInvestigator; // текущий следователь по делу
    private Article article; // статьи уголовного кодекса
    private Victim victim; // потерпевшие по уголовному делу
    private Suspect suspect; // фигуранты по уголовному делу
    private Expertise expertise; // экспертизы по уголовному делу
    private ProceduralDecisions proceduralDecision; // принятые процессуальные решения по делу;
    private String accusationPlot; // фабула уголовного дела
    private long id;
    private LocalDateTime startDate; // дата возбуждения уголовного дела
    private LocalDateTime proceduralTerm; // процессуальный срок по делу
    private boolean isUnderway = false; // ведется расследование

        public CriminalCase(CriminalCaseBuilder criminalCaseBuilder) {
            if (criminalCaseBuilder == null) {
                throw new IllegalArgumentException("Ошибка, отсутствует Builder");
            } if (criminalCaseBuilder.currentInvestigator.equals(null) ||
                            criminalCaseBuilder.id == 0 ||
                            criminalCaseBuilder.startDate.equals(null) ||
                            criminalCaseBuilder.article.equals(null) ||
                            criminalCaseBuilder.accusationPlot.equals(null)
            ) {
                throw new IllegalArgumentException("Ошибка, поля не заполнены");
            }
            this.currentInvestigator = criminalCaseBuilder.currentInvestigator;
            this.id = criminalCaseBuilder.id;
            this.startDate = criminalCaseBuilder.startDate;
            this.article = criminalCaseBuilder.article;
            this.accusationPlot = criminalCaseBuilder.accusationPlot;
            this.proceduralDecision = ProceduralDecisions.INITIATION;
            this.isUnderway = true;
        }


    @Override
    public String toString() {
        return "CriminalCase{" +
                "currentInvestigator=" + currentInvestigator +
                ", article=" + article +
                ", victim=" + victim +
                ", suspect=" + suspect +
                ", expertise=" + expertise +
                ", proceduralDecision=" + proceduralDecision +
                ", accusationPlot='" + accusationPlot + '\'' +
                ", id=" + id +
                ", startDate=" + startDate +
                ", proceduralTerm=" + proceduralTerm +
                ", isUnderway=" + isUnderway +
                '}';
    }

    public static class CriminalCaseBuilder {
            private Investigator currentInvestigator; // текущий следователь по делу
            private Article article; // статьи уголовного кодекса
            private Victim victim; // потерпевшие по уголовному делу
            private Suspect suspect; // фигуранты по уголовному делу
            private Expertise expertise; // экспертизы по уголовному делу
            private ProceduralDecisions proceduralDecisions; // принятые процессуальные решения по делу;
            private String accusationPlot; // фабула уголовного дела
            private long id;
            private LocalDateTime startDate; // дата возбуждения уголовного дела
            private LocalDateTime proceduralTerm; // процессуальный срок по делу
            private boolean isUnderway = false; // ведется расследование

            public CriminalCaseBuilder() {
                super();
            }

            public CriminalCaseBuilder currentInvestigator(Investigator currentInvestigator) {
                this.currentInvestigator = currentInvestigator;
                return this;
            }

            public CriminalCaseBuilder article (Article article) {
                this.article = article;
                return this;
            }

            public CriminalCaseBuilder victim (Victim victim) {
                this.victim = victim;
                return this;
            }

            public CriminalCaseBuilder suspect (Suspect suspect) {
                this.suspect = suspect;
                return this;
            }

            public CriminalCaseBuilder expertise (Expertise expertise) {
                this.expertise = expertise;
                return this;
            }

        public CriminalCaseBuilder accusationPlot (String accusationPlot) {
            this.accusationPlot = accusationPlot;
            return this;
        }

            public CriminalCaseBuilder proceduralDecisions (ProceduralDecisions proceduralDecision) {
                this.proceduralDecisions = proceduralDecision;
                return this;
            }

            public CriminalCaseBuilder id(long id){
                this.id = id;
                return this;
            }
        public CriminalCaseBuilder startDate(LocalDateTime startDate){
            this.startDate = startDate;
            return this;
        }
        public CriminalCaseBuilder proceduralTerm(LocalDateTime proceduralTerm){
            this.proceduralTerm = proceduralTerm;
            return this;
        }

        public CriminalCaseBuilder isUnderWay(boolean isUnderway){
            this.isUnderway = isUnderway;
            return this;
        }



        public boolean validateCriminalCase(){
                return !this.currentInvestigator.equals(null) &&
                        this.id != 0 &&
                        !this.startDate.equals(null) &&
                        !this.article.equals(null) &&
                        !this.accusationPlot.equals(null);
            }

            public CriminalCase build() {
            CriminalCase criminalCase = null;
            if (validateCriminalCase()) {
                criminalCase = new CriminalCase(this);
            } else {
                System.out.println("Уголовное дело не прошло валидацию");
            }
            return criminalCase;
        }
    }
}
