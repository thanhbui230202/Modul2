package ss17_binary_file.bai_1;

import ss17_binary_file.bai_2.Student;

import java.io.*;
import java.util.List;

public class ReadAndWrite {
    private static final String FILE_PATH = "E:\\CodeGym\\Modul2\\Modul2\\src\\ss17_binary_file\\bai_1\\Product.txt";
    public static void writeObject (Product product) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(product);
        oos.close();
    }
    public static void writeObjectList(List<Product> productList) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(productList);
        oos.close();
    }
    public static List<Product> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Product> productList = (List<Product>) ois.readObject();
        ois.close();
        return productList;
    }
    public static Product readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Product product = (Product) ois.readObject();
        ois.close();
        return product;
    }
}
