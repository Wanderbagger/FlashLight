package manager.investigatorManager;

public class Investigator {
    private String name; // ФИО следователя
    private InvestigatorPosition position;
    private InvestigatorRank rank; // звание следователя
    private Department department;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public InvestigatorRank getRank() {
        return rank;
    }
    public void setRank(InvestigatorRank rank) {
        this.rank = rank;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public InvestigatorPosition getPosition() {
        return position;
    }
    public void setPosition(InvestigatorPosition position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Investigator{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", rank=" + rank +
                ", department=" + department +
                '}';
    }

    public Investigator(String name, InvestigatorPosition position, InvestigatorRank rank, Department department) {
        this.name = name;
        this.position = position;
        this.rank = rank;
        this.department = department;
    }
}
