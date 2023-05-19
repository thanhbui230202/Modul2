package ss17_binary_file.bai_2;

import java.io.*;
import java.util.List;

public class ByteStream {
    private static final String FILE_PATH = "E:\\CodeGym\\Modul2\\Modul2\\src\\ss17_binary_file\\bai_2\\source.txt";
    private static final String FILE_PATHS = "E:\\CodeGym\\Modul2\\Modul2\\src\\ss17_binary_file\\bai_2\\target.txt";
    public static void writeObject(Student student) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.close();
    }
    public static void writeObjectList(List<Student> studentList) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(studentList);
        oos.close();
    }
    public static List<Student> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Student> studentList = (List<Student>) ois.readObject();
        ois.close();
        return studentList;
    }
    public static Student readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = (Student) ois.readObject();
        ois.close();
        return student;
    }
}
