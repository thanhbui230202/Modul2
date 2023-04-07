package SS5_AccessModifer_StaticMethod_StaticProperty.BT;

public class Student {
    private String name = "John";
    private String classes = "C02";
    Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student student = new Student();
        String name = student.getName();
        String classes = student.getClasses();
        System.out.println("Name: "+ name+" class: "+classes);
    }
}
