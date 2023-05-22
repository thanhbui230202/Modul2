package thimodule2.controler;

import thimodule2.service.ServicePhone;

import java.util.Scanner;

public class QuanLyDienThoai {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ServicePhone servicePhone=new ServicePhone();
        while (true)
        {
            menu();
            System.out.print("Chọn chức năng: ");
            String goTo=scanner.nextLine();
            switch (goTo)
            {
                case "1":
                    try {
                        servicePhone.addNew();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Tạo mới dien thoai không thành công!");
                    }
                    break;
                case "2":
                    servicePhone.delete();
                    break;
                case "3":
                    servicePhone.disPlay();
                    break;
                case "4":
                    servicePhone.search();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng chức năng!");
            }
        }
    }



    private static void menu()
    {
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ DIEN THOAI--");
        System.out.println("Chọn chức năng theo số");
        System.out.println("1.Thêm mới");
        System.out.println("2.Xóa");
        System.out.println("3.Xem danh sách dien thoai");
        System.out.println("4.Tìm kiếm");
        System.out.println("5.Thoát");
    }
}
