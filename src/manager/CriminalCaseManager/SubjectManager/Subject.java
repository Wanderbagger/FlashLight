package manager.CriminalCaseManager.SubjectManager;

public abstract class Subject {
    private String surname;
    private String firstName;
    private String patronymic;

    public String getSurnameAndInitials(){
        return surname.substring(0, 1).toUpperCase() + surname.substring(1) + " " + firstName.substring(0, 1).toUpperCase() + patronymic.substring(0, 1).toUpperCase();
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

}
