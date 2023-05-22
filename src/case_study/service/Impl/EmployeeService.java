package case_study.service.Impl;

import case_study.model.Employee;
import case_study.service.Interface.IEmployeeService;
import case_study.statics.InvalidEmployeeDataException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Employee employee: employeeList){
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        System.out.println("Enter the date of birth");
        String date = scanner.nextLine();
        System.out.println("Enter the gender");
        String gender = scanner.nextLine();
        System.out.println("Enter the identity card");
        int idCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the phone number");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the email");
        String email = scanner.nextLine();
        System.out.println("Enter the id employee");
        String id =scanner.nextLine();
        System.out.println("Enter the level");
        String level = scanner.nextLine();
        System.out.println("Enter the position");
        String position = scanner.nextLine();
        System.out.println("Enter the salary");
        int salary = Integer.parseInt((scanner.nextLine()));
        Employee employee = new Employee(name,date,gender,idCard,phone,email,id,level,position,salary);
        employeeList.add(employee);
    }
    @Override
    public void update() {

    }
}
