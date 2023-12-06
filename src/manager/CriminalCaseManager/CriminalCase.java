package manager.CriminalCaseManager;

import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecisions;
import manager.CriminalCaseManager.SubjectManager.Suspect;
import manager.CriminalCaseManager.SubjectManager.Victim;
import manager.LawRuleManager.Article;
import manager.investigatorManager.Investigator;

import java.time.LocalDate;
import java.time.LocalTime;

public class CriminalCase {
    private Investigator currentInvestigator; // текущий следователь по делу
    private Article article; // статьи уголовного кодекса
    private Victim victim; // потерпевшие по уголовному делу
    private Suspect suspect; // фигуранты по уголовному делу
    private Expertise expertise; // экспертизы по уголовному делу
    private ProceduralDecisions proceduralDecision; // принятые процессуальные решения по делу;
    private String accusationPlot; // фабула уголовного дела
    private final LocalDate initiationDate; // дата возбуждения уголовного дела
    private final LocalTime initiationTime;
    private LocalDate proceduralTerm; // процессуальный срок по делу
    private boolean isUnderway = false; // ведется расследование

        public CriminalCase(CriminalCaseBuilder criminalCaseBuilder) {
            if (criminalCaseBuilder == null) {
                throw new IllegalArgumentException("Ошибка, отсутствует Builder");
            } if (criminalCaseBuilder.currentInvestigator == null ||
                            criminalCaseBuilder.initiationDate == null ||
                            criminalCaseBuilder.article == null ||
                            criminalCaseBuilder.accusationPlot == null)
            {
                throw new IllegalArgumentException("Ошибка, поля не заполнены");
            }
            this.currentInvestigator = criminalCaseBuilder.currentInvestigator;
            this.victim = criminalCaseBuilder.victim;
            this.suspect = criminalCaseBuilder.suspect;
            this.initiationDate = criminalCaseBuilder.initiationDate;
            this.initiationTime = criminalCaseBuilder.initiationTime;
            this.article = criminalCaseBuilder.article;
            this.accusationPlot = criminalCaseBuilder.accusationPlot;
            this.proceduralDecision = ProceduralDecisions.INITIATION;
            this.proceduralTerm = criminalCaseBuilder.proceduralTerm;
            this.isUnderway = true;
        }


    @Override
    public String toString() {
        return  " дело " + '\n' +
                "следователь - " + currentInvestigator + '\n' +
                "статья  - " + article + '\n' +
                "потерпевший - " + victim + '\n' +
                "фигурант - " + suspect + '\n' +
                "экспертиза - " + expertise + '\n' +
                "последнее процессуальное решение - " + proceduralDecision + '\n' +
                "фабула дела - " + accusationPlot +  '\n' +
                "дата возбуждения - " + initiationDate + '\n' +
                "время возбуждения - " + initiationTime + '\n' +
                "процессуальный срок  - " + proceduralTerm + '\n' +
                "находится в производстве - " + isUnderway +
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
            private LocalDate initiationDate; // дата возбуждения уголовного дела
            private LocalTime initiationTime;
            private LocalDate proceduralTerm; // процессуальный срок по делу
            private boolean isUnderway = false; // ведется расследование

            public CriminalCaseBuilder() {
                super();
            }

        @Override
        public String toString() {
            return "CriminalCaseBuilder{" +
                    "currentInvestigator=" + currentInvestigator +
                    ", article=" + article +
                    ", victim=" + victim +
                    ", suspect=" + suspect +
                    ", expertise=" + expertise +
                    ", proceduralDecisions=" + proceduralDecisions +
                    ", accusationPlot='" + accusationPlot + '\'' +
                    ", initiationDate=" + initiationDate +
                    ", initiationTime=" + initiationTime +
                    ", proceduralTerm=" + proceduralTerm +
                    ", isUnderway=" + isUnderway +
                    '}';
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
                return this;
            }
        public CriminalCaseBuilder initiationDate(LocalDate initiationDate){
            this.initiationDate = initiationDate;
            return this;
        }

        public CriminalCaseBuilder initiationTime(LocalTime initiationTime){
            this.initiationTime = initiationTime;
            return this;
        }

        public CriminalCaseBuilder proceduralTerm(LocalDate proceduralTerm){
            this.proceduralTerm = proceduralTerm;
            return this;
        }
        public CriminalCaseBuilder isUnderWay(boolean isUnderway){
            this.isUnderway = isUnderway;
            return this;
        }



        public boolean validateCriminalCase(){
            return this.currentInvestigator != null &&
                        this.initiationDate != null &&
                        this.article != null &&
                        this.accusationPlot != null;
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
