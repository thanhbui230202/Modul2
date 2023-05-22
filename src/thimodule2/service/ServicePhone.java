package thimodule2.service;

import thimodule2.model.DienThoaiChinhHang;
import thimodule2.model.DienThoaiXachTay;
import thimodule2.utils.WriteReadFile;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicePhone {
    private Scanner scanner=new Scanner(System.in);
    public ArrayList<DienThoaiChinhHang> dienThoaiChinhHangs=new ArrayList<>();
    public ArrayList<DienThoaiXachTay> dienThoaiXachTays=new ArrayList<>();

    public void addNew()
    {
        System.out.println("1.Thêm dien thoai chinh hang");
        System.out.println("2.Thêm dien thoai xach tay");
        System.out.println("Thoát");
        String goTo=scanner.nextLine();
        switch (goTo)
        {
            case "1":
                addNewChinhHang();
                WriteReadFile.writeToFile(DienThoaiChinhHang.FILE,dienThoaiChinhHangs);
                System.out.println("Thêm thành công");
                break;
            case "2":
                addNewXachTay();
                WriteReadFile.writeToFiles(DienThoaiXachTay.FILE,dienThoaiXachTays);
                System.out.println("Thêm thành công");
                break;
            default:
                return;
        }
    }

    public void addNewChinhHang()
    {
        System.out.println("Them moi dien thoai chinh hang");
        System.out.print("Ten dien thoai: ");
        String tenDienThoai=scanner.nextLine();
        System.out.print("Gia ban: ");
        float giaBan =Float.parseFloat(scanner.nextLine());
        System.out.print("Số lượng: ");
        int soLuong=Integer.parseInt(scanner.nextLine());
        System.out.print("Nhà sản xuất: ");
        String nhaSanXuat=scanner.nextLine();
        System.out.println("Thoi gian bao hanh: ");
        String thoiGianBaoHanh= scanner.nextLine();
        System.out.println("Pham vi bao hanh:  ");
        String phamViBaoHanh= scanner.nextLine();
        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(tenDienThoai,giaBan,soLuong,nhaSanXuat,thoiGianBaoHanh,phamViBaoHanh);
        dienThoaiChinhHangs.add(dienThoaiChinhHang);
    }

    public void addNewXachTay()
    {
        System.out.println("Them moi dien thoai xach tay");
        System.out.print("Ten dien thoai: ");
        String tenDienThoai=scanner.nextLine();
        System.out.print("Gia ban: ");
        float giaBan =Float.parseFloat(scanner.nextLine());
        System.out.print("Số lượng: ");
        int soLuong=Integer.parseInt(scanner.nextLine());
        System.out.print("Nhà sản xuất: ");
        String nhaSanXuat=scanner.nextLine();
        System.out.println("Quoc gia xach tay: ");
        String quocGiaXachTay= scanner.nextLine();
        System.out.println("Trang thai:  ");
        String trangThai= scanner.nextLine();
        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(tenDienThoai,giaBan,soLuong,nhaSanXuat,quocGiaXachTay,trangThai);
        dienThoaiXachTays.add(dienThoaiXachTay);

    }

    public void disPlay()
    {
        if(dienThoaiChinhHangs.size()==0 && dienThoaiXachTays.size()==0)
        {
            System.out.println("Danh sách dien thoai trống!");
        }
        else
        {
            System.out.println("Danh sách dien thoai: ");
            for (DienThoaiChinhHang dienThoaiChinhHang:dienThoaiChinhHangs)
            {
                System.out.println(dienThoaiChinhHang.toString());
            }

            for (DienThoaiXachTay dienThoaiXachTay:dienThoaiXachTays)
            {
                System.out.println(dienThoaiXachTay.toString());
            }
        }

    }



    public void search()
    {
        System.out.println("1.Tìm kiếm theo id dien thoai");
        System.out.println("2.Tìm kiếm theo ten dien thoai");
        System.out.println("Thoát");
        String goTo=scanner.nextLine();
        switch (goTo)
        {
            case "1":
                System.out.print("Nhập id dien thoai: ");
                int idDienThoai=Integer.parseInt(scanner.nextLine());
                searchIdDienThoai(idDienThoai);
                break;
            case "2":
                System.out.print("Nhập tên dien thoai: ");
                String tenDienThoai=scanner.nextLine();
                searchTenDienThoai(tenDienThoai);
                break;
            default:
                return;
        }
    }

    private void searchIdDienThoai(int id)
    {
        System.out.println("Dien thoai can tim la: ");
        for (DienThoaiChinhHang dienThoaiChinhHang: dienThoaiChinhHangs)
        {
            if(dienThoaiChinhHang.getId()==id)
            {
                System.out.println(dienThoaiChinhHang.toString());
            }
        }

        for (DienThoaiXachTay dienThoaiXachTay: dienThoaiXachTays)
        {
            if(dienThoaiXachTay.getId()==id)
            {
                System.out.println(dienThoaiXachTay.toString());
            }
        }

    }

    private void searchTenDienThoai(String tenDienThoai)
    {
        int check=0;
        System.out.println("Dien thoai can tim: ");
        for (DienThoaiChinhHang dienThoaiChinhHang:dienThoaiChinhHangs)
        {
            if(dienThoaiChinhHang.getTenDienThoai().equalsIgnoreCase(tenDienThoai) || dienThoaiChinhHang.getTenDienThoai().indexOf(tenDienThoai)!=-1)
            {
                System.out.println(dienThoaiChinhHang.toString());
                check++;
            }
        }

        for (DienThoaiXachTay dienThoaiXachTay:dienThoaiXachTays)
        {
            if(dienThoaiXachTay.getTenDienThoai().equalsIgnoreCase(tenDienThoai) || dienThoaiXachTay.getTenDienThoai().indexOf(tenDienThoai)!=-1)
            {
                System.out.println(dienThoaiXachTay.toString());
                check++;
            }
        }
        if(check==0)
        {
            System.out.println("Không tìm thấy! ");
        }

    }

    public void delete()
    {
        System.out.println("Xóa dien thoai");
        System.out.print("Nhập id dien thoai:");
        int id= Integer.parseInt(scanner.nextLine());
        for (DienThoaiChinhHang dienThoaiChinhHang:dienThoaiChinhHangs)
        {
            if(dienThoaiChinhHang.getId()==id)
            {
                while (true)
                {
                    System.out.println("1.Yes  2.No");
                    System.out.print("Chọn: ");
                    String goTo=scanner.nextLine();
                    if(goTo.equals("1"))
                    {
                        dienThoaiChinhHangs.remove(dienThoaiChinhHang);
                        WriteReadFile.writeToFile(DienThoaiChinhHang.FILE,dienThoaiChinhHangs);
                        System.out.println("Xóa thành công!");
                        return;
                    }
                    if(goTo.equals("2"))
                    {
                        return;
                    }
                }
            }
        }

        for (DienThoaiXachTay dienThoaiXachTay:dienThoaiXachTays)
        {
            if(dienThoaiXachTay.getId()==id)
            {
                while (true)
                {
                    System.out.println("1.Yes  2.No");
                    System.out.print("Chọn: ");
                    String goTo=scanner.nextLine();
                    if(goTo.equals("1"))
                    {
                        dienThoaiXachTays.remove(dienThoaiXachTay);
                        WriteReadFile.writeToFiles(DienThoaiChinhHang.FILE,dienThoaiXachTays);
                        System.out.println("Xóa thành công!");
                        return;
                    }
                    if(goTo.equals("2"))
                    {
                        return;
                    }
                }
            }
        }
    }
}
