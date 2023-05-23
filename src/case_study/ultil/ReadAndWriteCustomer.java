package case_study.ultil;

import case_study.model.Customer;
import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
    private static final String FILE_PATH = "E:\\CodeGym\\Modul2\\Modul2\\src\\case_study\\data\\customer.csv";

    public static List<Customer> readCSV() throws IOException {
        List<Customer> customerList = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];
        Customer customer;
        while ((line = bufferedReader.readLine())!= null){
            temp = line.split(",");
            String name = temp[0];
            String  dOB= temp[1];
            String gender = temp[2];
            int identityCard = Integer.parseInt(temp[3]);
            int phone = Integer.parseInt(temp[4]);
            String email = temp[5];
            String id = temp[6];
            String type = temp[7];
            String address = temp[8];
            //                    String name,
            //                    String dateOfBirth,
            //                    String gender,
            //                    int identityCard,
            //                    int phoneNumber,
            //                    String email,
            //                    String idCustomer,
            //                    String typeCustomer,
            //                    String address
            customer = new Customer(name,dOB,gender,identityCard,phone,email,id,type,address);
            customerList.add(customer);
        }
        bufferedReader.close();
        return customerList;
    }
    public static void writeCSV(List<Customer>customerList) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer customer:customerList ){
            bufferedWriter.write(customer.getInfoCustomer());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
