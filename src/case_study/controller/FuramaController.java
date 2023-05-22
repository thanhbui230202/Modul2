package case_study.controller;

import case_study.service.Impl.EmployeeService;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Enter the number 1 - 6 ");
                    break;
            }
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeService employeeService = new EmployeeService();
        boolean check = true;
        while (check) {
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Return main menu");
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }
    public static void displayCustomerMenu(){
        boolean check = true;
        while (check) {
            System.out.println("1.Display list customer");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.Return main menu");
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:

                case 2:

                case 3:

                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }
    public static void displayFacilityMenu(){
        boolean check = true;
        while (check) {
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list facility maintenance");
            System.out.println("4.Return main menu");
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                case 2:
                case 3:
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }
    public static void displayBookingMenu(){
        boolean check = true;
        while (check) {
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Creat new contact");
            System.out.println("4.Display list contact");
            System.out.println("5.Edit contact");
            System.out.println("6.Return main menu");
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:
                displayMainMenu();
                break;
            }
        }
    }
    public static void displayPromotionMenu(){
        boolean check = true;
        while (check) {
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3.Return main menu");
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:

                case 2:

                case 3:
                    displayMainMenu();
                    break;
            }
        }
    }
}