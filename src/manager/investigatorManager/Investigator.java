package manager.investigatorManager;

public class Investigator {
    String name; // ФИО следователя
    InvestigatorRank rank; // звание следователя
    Department department;

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

    @Override
    public String toString() {
        return "Investigator{" +
                "name='" + name + '\'' +
                ", rank=" + rank.getTitle() +
                ", department=" + department.getTitle() +
                '}';
    }

    public Investigator(String name, InvestigatorRank rank, Department department) {
        this.name = name;
        this.rank = rank;
        this.department = department;
    }
}
