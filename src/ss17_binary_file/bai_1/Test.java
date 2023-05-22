package ss17_binary_file.bai_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        void add() throws IOException{
            System.out.println("Nhap id:");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap ten san pham:");
            String name = sc.nextLine();
            System.out.println("Nhap ten hang san xuat:");
            String nameOriginal = sc.nextLine();
            System.out.println("Nhap gia tien :");
            double price = Double.parseDouble(sc.nextLine());
            System.out.println("NHap mieu ta khac:");
            String otherDescription = sc.nextLine();
            Product p = new Product(id, name, nameOriginal, price, otherDescription);
            products.add(p);
            ReadAndWrite.writeObjectList(products);
        }
    void display() throws IOException, ClassNotFoundException {
        List<Product> result = ReadAndWrite.readObjectList();
        for (Product p : result) {
            System.out.println(p);
        }
    }
    void search() throws IOException, ClassNotFoundException {
        List<Product> result = ReadAndWrite.readObjectList();
        System.out.println("Nhap id can tim:");
        int findId = sc.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (findId == products.get(i).getId()) {
                System.out.println(products.get(i));
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Test test = new Test();
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product(123, "A", "HAHA", 12000, "Tuyet voi");
        Product p2 = new Product(1234, "AB", "HAHAB", 120020, "TuyetT voi");
        Product p3 = new Product(12345, "ABC", "HAHABA", 1230020, "TuyetT Vvoi");
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        ReadAndWrite.writeObjectList(products);
        List<Product> result = ReadAndWrite.readObjectList();
//        for(Product  p:result)
//        {
//            System.out.println(p);
//        }
        while (true) {

            System.out.println("1> Them ");
            System.out.println("2> hien thi");
            System.out.println("3> tim kiem");
            System.out.println("4>thoat");
            int casee = sc.nextInt();

            switch (casee) {
                case 1: {
                    test.add();
                    break;
                }
                case 2: {
                    test.display();
                    break;
                }
                case 3: {
                    test.search();
                    break;
                }
                case 4: {
                    break;
                }
            }
        }
    }
}

