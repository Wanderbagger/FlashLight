package manager.investigatorManager;

import java.util.Objects;

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
        return position + " " + department.getTitle() + " " + rank + " " + name;
    }

    public Investigator(String name, InvestigatorPosition position, InvestigatorRank rank, Department department) {
        this.name = name;
        this.position = position;
        this.rank = rank;
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Investigator that = (Investigator) o;
        return Objects.equals(name, that.name) && position == that.position && rank == that.rank && department == that.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, rank, department);
    }
}


