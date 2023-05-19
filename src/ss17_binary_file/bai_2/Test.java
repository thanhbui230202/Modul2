package ss17_binary_file.bai_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1 = new Student(1,"Thanh","Nam");
        Student student2 = new Student(1,"Quan","Nam");
        Student student3 = new Student(3,"Bao","Nam");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        ByteStream.writeObjectList(studentList);
        List<Student> result = ByteStream.readObjectList();
        for (Student student: result){
            System.out.println(student);
        }
    }
}
