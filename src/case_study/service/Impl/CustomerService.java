package case_study.service.Impl;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.service.Interface.ICustomerService;
import case_study.statics.Validate;
import case_study.ultil.ReadAndWriteCustomer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Customer customer: customerList){
            System.out.println(customer.toString());
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
        String id =getIdCustomer();
        String type =getTypeCustomer();
        String address = getAddress();
        Customer customer = new Customer(name,date,gender,idCard,phone,email,id,type,address);
        customerList.add(customer);
        try {
            ReadAndWriteCustomer.writeCSV(customerList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update() {

    }
    String getIdCustomer(){
        while (true){
            System.out.println("Enter the id employee");
            String id = scanner.nextLine();
            if (Validate.isIdCus(id)){
                return id;
            }else {
                System.out.println("Enter id correct format KH-XXXX");
            }
        }
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
    String getTypeCustomer () {
        System.out.println("1.Diamond");
        System.out.println("2.Platinum");
        System.out.println("3.Gold");
        System.out.println("4.Silver");
        System.out.println("5.Member");
        System.out.println("Enter your choice: ");
        int n = Integer.parseInt(scanner.nextLine());
        String type = null;
        switch (n) {
            case 1:
                type = "Diamond";
                break;
            case 2:
                type = "Platinum";
                break;
            case 3:
                type = "Gold";
                break;
            case 4:
                type = "Silver";
                break;
            case 5:
                type = "Member";
                break;
            default:
                System.out.println("Enter the number 1-5");
        }
        return type;
    }
    String getAddress(){
        System.out.println("Enter the address");
        String address = scanner.nextLine();
        return address;
    }
}
