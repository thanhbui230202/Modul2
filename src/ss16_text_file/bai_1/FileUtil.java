package ss16_text_file.bai_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILE_PATH = "E:\\CodeGym\\Modul2\\Modul2\\src\\ss16_text_file\\bai_1\\SourceFile.csv";
    private static final String FILE_PATHS = "E:\\CodeGym\\Modul2\\Modul2\\src\\ss16_text_file\\bai_1\\TargetFile.csv";
    public static List<Student> readCSV() throws IOException{
        List<Student> studentList = new ArrayList<>();
        FileReader  fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String temp[];
        Student student;
        while ((line = bufferedReader.readLine())!= null){
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            String sex = temp[2];
            student = new Student(id,name,sex);
            studentList.add(student);
        }
        bufferedReader.close();
        return studentList;
    }
    public static void writeCSV(List<Student>studentList) throws IOException{
        FileWriter fileWriter = new FileWriter(FILE_PATHS,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(Student s:studentList)
        {
            bufferedWriter.write(""+s);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
