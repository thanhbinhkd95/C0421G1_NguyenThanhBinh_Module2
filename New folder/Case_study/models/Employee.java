package Case_study.models;

public class Employee extends Person {
    private String level; //: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
    private String position; //: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
    private int salary;

    public Employee(String idCode, String namePerson, String dateOfBirth, String gender, String idPerson, String phoneNumber, String emailAddress, String level, String position, int salary) {
        super(idCode, namePerson, dateOfBirth, gender, idPerson, phoneNumber, emailAddress);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idCode='" + idCode + '\'' +
                ", namePerson='" + namePerson + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idPerson='" + idPerson + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
