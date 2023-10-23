package manager.CriminalCaseManager;

import manager.CriminalCaseManager.ProceduralDesicionManager.ProceduralDecision;
import manager.LawRuleManager.Article;
import manager.investigatorManager.Investigator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CriminalCase {
    private Investigator currentInvestigator; // текущий следователь по делу
    private List<Investigator> investigators = new ArrayList<>(); // следователи, которые вели расследование по делу
    private List <Article> articles = new ArrayList<>(); // статьи уголовного кодекса
    private List <Victim> victims = new ArrayList<>(); // потерпевшие по уголовному делу
    private List <Suspect> suspects= new ArrayList<>(); // фигуранты по уголовному делу
    private List <Expertise> expertiseArrayList = new ArrayList<>(); // экспертизы по уголовному делу
    private LocalDateTime proceduralTerm; // процессуальный срок по делу
    private List <ProceduralDecision> proceduralDecisions = new ArrayList<>(); // принятые процессуальные решения по делу;
    private String accusationPlot; // фабула уголовного дела
    private String id;
    private LocalDateTime startDate; // дата возбуждения уголовного дела
    private boolean isUnderway = false; // ведется расследование

        public CriminalCase(CriminalCaseBuilder criminalCaseBuilder) {
            if (criminalCaseBuilder == null) {
                throw new IllegalArgumentException("Ошибка, отсутствует Builder");
            }
            if (
                    criminalCaseBuilder.currentInvestigator.equals(null) ||
                            criminalCaseBuilder.id.equals(null) ||
                            criminalCaseBuilder.startDate.equals(null) ||
                            criminalCaseBuilder.articles.isEmpty() ||
                            criminalCaseBuilder.accusationPlot.equals(null)
            ) {
                throw new IllegalArgumentException("Please provide valid employee number.");
            }
            this.currentInvestigator = criminalCaseBuilder.currentInvestigator;
            this.id = criminalCaseBuilder.id;
            this.startDate = criminalCaseBuilder.startDate;
            this.articles = criminalCaseBuilder.articles;
            this.accusationPlot = criminalCaseBuilder.accusationPlot;

        }

        public int getEmpNo() {
            return empNo;
        }

        public String getName() {
            return name;
        }

        public String getDepttName() {
            return depttName;
        }

        public int getSalary() {
            return salary;
        }

        public int getMgrEmpNo() {
            return mgrEmpNo;
        }

        public String getProjectName() {
            return projectName;
        }

        @Override
        public String toString() {
            // Класс StringBuilder также использует паттерн проектирования Builder с реализацией
            // интерфейса java.lang.Appendable
            StringBuilder builder = new StringBuilder();
            builder.append("Employee [empNo=").append(empNo).append(", name=").append(name).append(", depttName=")
                    .append(depttName).append(", salary=").append(salary).append(", mgrEmpNo=").append(mgrEmpNo)
                    .append(", projectName=").append(projectName).append("]");
            return builder.toString();
        }

        public static class CriminalCaseBuilder {
            private Investigator currentInvestigator; // текущий следователь по делу
            private List<Investigator> investigators = new ArrayList<>(); // следователи, которые вели расследование по делу
            private List <Article> articles = new ArrayList<>(); // статьи уголовного кодекса
            private List <Victim> victims = new ArrayList<>(); // потерпевшие по уголовному делу
            private List <Suspect> suspects= new ArrayList<>(); // фигуранты по уголовному делу
            private List <Expertise> expertiseArrayList = new ArrayList<>(); // экспертизы по уголовному делу
            private LocalDateTime proceduralTerm; // процессуальный срок по делу
            private List <ProceduralDecision> proceduralDecisions = new ArrayList<>(); // принятые процессуальные решения по делу;
            private String accusationPlot; // фабула уголовного дела
            private String id;
            private LocalDateTime startDate; // дата возбуждения уголовного дела
            private boolean isUnderway = false; // ведется расследование

            public CriminalCaseBuilder() {
                super();
            }

            public EmployeeBuilder empNo(int empNo) {
                this.empNo = empNo;
                return this;
            }

            public EmployeeBuilder name(String name) {
                this.name = name;
                return this;
            }

            public EmployeeBuilder depttName(String depttName) {
                this.depttName = depttName;
                return this;
            }

            public EmployeeBuilder salary(int salary) {
                this.salary = salary;
                return this;
            }

            public EmployeeBuilder mgrEmpNo(int mgrEmpNo) {
                this.mgrEmpNo = mgrEmpNo;
                return this;
            }
            public EmployeeBuilder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public Employee build() {
                Employee emp = null;
                if (validateEmployee()) {
                    emp = new Employee(this);
                } else {
                    System.out.println("Sorry! Employee objects can't be build without required details");
                }
                return emp;
            }

            private boolean validateEmployee() {
                return (empNo > 0 && name != null && !name.trim().isEmpty());
            }
        }
    }
}
