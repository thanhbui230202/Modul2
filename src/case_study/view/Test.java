package case_study.view;

import case_study.controller.FuramaController;
import case_study.model.Customer;
import case_study.model.Employee;
import case_study.ultil.ReadAndWriteCustomer;
import case_study.ultil.ReadAndWriteEmployee;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        FuramaController furamaController= new FuramaController();
        furamaController.displayMainMenu();
        List<Employee> employeeList = ReadAndWriteEmployee.readCSV();
        for (Employee employee: employeeList){
            System.out.println(employee);
        }
      ReadAndWriteEmployee.writeCSV(employeeList);

        List<Customer> customerList = ReadAndWriteCustomer.readCSV();
        for (Customer customer: customerList){
            System.out.println(customer);
        }
        ReadAndWriteCustomer.writeCSV(customerList);
    }



}
