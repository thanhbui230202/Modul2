package case_study.model;

public class Employee extends Person {
    private String idEmployee;
    private String level;
    private String position;
    private int salary;

    public Employee(String name,
                    String dateOfBirth,
                    String gender,
                    int identityCard,
                    int phoneNumber,
                    String email,
                    String idEmployee,
                    String level,
                    String position,
                    int salary) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String
    getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard=" + identityCard +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
    //                    String name,
    //                    String dateOfBirth,
    //                    String gender,
    //                    int identityCard,
    //                    int phoneNumber,
    //                    String email,
    //                    String idEmployee,
    //                    String level,
    //                    String position,
    //                    int salary
    public String getInfo(){
        return name+","+dateOfBirth +","+gender+","+identityCard+","+phoneNumber+","+email+","+idEmployee+","+level+","+position+","+salary;
    }
}
