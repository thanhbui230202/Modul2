package case_study.ultil;

import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    private static final String FILE_PATH = "E:\\CodeGym\\Modul2\\Modul2\\src\\case_study\\data\\employee.csv";
    public static List<Employee> readCSV() throws IOException {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];
        Employee employee;
        while ((line = bufferedReader.readLine())!= null){
            temp = line.split(",");
            String name = temp[0];
            String  dOB= temp[1];
            String gender = temp[2];
            int identityCard = Integer.parseInt(temp[3]);
            int phone = Integer.parseInt(temp[4]);
            String email = temp[5];
            String id = temp[6];
            String level = temp[7];
            String position = temp[8];
            int salary = Integer.parseInt(temp[9]);
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
            employee = new Employee(name,dOB,gender,identityCard,phone,email,id,level,position,salary);
            employeeList.add(employee);
        }
        bufferedReader.close();
        return employeeList;
    }
    public static void writeCSV(List<Employee>employeeList) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Employee employee: employeeList){
            bufferedWriter.write(employee.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
