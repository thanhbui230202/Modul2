package case_study.service.Impl;

import case_study.model.Employee;
import case_study.service.Interface.IEmployeeService;
import case_study.statics.Validate;
import case_study.ultil.ReadAndWriteEmployee;

import java.io.IOException;
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
        String name = getName();
        String date = getDateOfBirth();
        String gender = getGender();
        int idCard = Integer.parseInt(getIdentityCard());
        int phone = Integer.parseInt(getPhoneNumber());
        String email = getEmail();
        String id =getIdEmployee();
        String level =getLevel();
        String position = getPosition();
        int salary = getSalary();
        Employee employee = new Employee(name,date,gender,idCard,phone,email,id,level,position,salary);
        employeeList.add(employee);
        try {
            ReadAndWriteEmployee.writeCSV(employeeList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void update() {
        System.out.println("Enter the id want edit");
        int check = Integer.parseInt(scanner.nextLine());
    }
    String getIdentityCard(){
        while (true){
            System.out.println("Enter the identity card");
            String identityCard = scanner.nextLine();
            if (Validate.isCMND(identityCard)){
                return identityCard;
            }else {
                System.out.println("Enter 9-12 number");
            }
        }
    }
    String getPhoneNumber(){
        while (true){
            System.out.println("Enter the phone number");
            String phone = scanner.nextLine();
            if (Validate.isPhone(phone)){
                return phone;
            }else {
                System.out.println("Enter 10 number");
            }
        }
    }
    String getDateOfBirth(){
        while (true){
            System.out.println("Enter the date of birth");
            String dOB = scanner.nextLine();
            if (Validate.isDateRight(dOB)){
                return dOB;
            }else {
                System.out.println("Enter the date of birth correct format DD/MM/YYYY");
            }
        }
    }
    String getIdEmployee(){
        while (true){
            System.out.println("Enter the id employee");
            String id = scanner.nextLine();
            if (Validate.isIdEm(id)){
                return id;
            }else {
                System.out.println("Enter id correct format NV-XXXX");
            }
        }
    }
    String getName(){
        while (true){
            System.out.println("Enter the name");
            String name = scanner.nextLine();
            if (Validate.isName(name)){
                return name;
            }else {
                System.out.println("Enter the name correct format 'Minh Thanh' ");
            }
        }
    }
    String getGender() {
        System.out.println("1.Nam");
        System.out.println("2.Nu");
        System.out.println("Enter your choice: ");
        int n = Integer.parseInt(scanner.nextLine());
        String gender = null;
        switch (n) {
            case 1:
                gender = "Nam";
                break;
            case 2:
                gender = "Nu";
                break;
        }
        return gender;
    }
        String getEmail () {
            while (true) {
                System.out.println("Enter the email");
                String email = scanner.nextLine();
                if (Validate.isEmail(email)) {
                    return email;
                } else {
                    System.out.println("Enter the email correct format ");
                }
            }

        }
        String getLevel () {
            System.out.println("1.Trung Cap");
            System.out.println("2.Cao Dang");
            System.out.println("3.Dai Hoc");
            System.out.println("4.Sau Dai Hoc");
            System.out.println("Enter your choice: ");
            int n = Integer.parseInt(scanner.nextLine());
            String level = null;
            switch (n) {
                case 1:
                    level = "Trung Cap";
                    break;
                case 2:
                    level = "Cao Dang";
                    break;
                case 3:
                    level = "Dai Hoc";
                    break;
                case 4:
                    level = "Sau Dai Hoc";
                    break;
            }
            return level;
        }
        String getPosition () {
            System.out.println("1.Le Tan");
            System.out.println("2.Phuc Vu");
            System.out.println("3.Chuyen Vien");
            System.out.println("4.Giam Sat");
            System.out.println("5.Quan Ly");
            System.out.println("6.Giam Doc");
            System.out.println("Enter your choice: ");
            int n = Integer.parseInt(scanner.nextLine());
            String position = null;
            switch (n) {
                case 1:
                    position = "Le Tan";
                    break;
                case 2:
                    position = "Phuc Vu";
                    break;
                case 3:
                    position = "Chuyen Vien";
                    break;
                case 4:
                    position = "Giam Sat";
                    break;
                case 5:
                    position = "Quan Ly";
                    break;
                case 6:
                    position = "Giam Doc";
                    break;
            }
            return position;
        }
        int getSalary(){
        while (true){
            System.out.println("Enter the salary");
            int salary = Integer.parseInt(scanner.nextLine());
            if (salary > 0){
                return salary;
            }else {
                System.out.println("Enter the salary > 0");
            }
        }
    }
}
