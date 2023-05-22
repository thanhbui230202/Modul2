package thimodule2.utils;

import thimodule2.model.DienThoaiChinhHang;
import thimodule2.model.DienThoaiXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile {
    public static void writeToFile(String path, ArrayList<DienThoaiChinhHang> dienThoaiChinhHangs) {
        try {
            FileWriter fr = new FileWriter(path);
            BufferedWriter br = new BufferedWriter(fr);
            for (DienThoaiChinhHang dienThoaiChinhHang:dienThoaiChinhHangs) {
                br.write(dienThoaiChinhHang.toStringWrite());
                br.newLine();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("File recording failed!");
        }
    }

    public static void writeToFiles(String path, ArrayList<DienThoaiXachTay> dienThoaiXachTays) {
        try {
            FileWriter fr = new FileWriter(path);
            BufferedWriter br = new BufferedWriter(fr);
            for (DienThoaiXachTay dienThoaiXachTay:dienThoaiXachTays) {
                br.write(dienThoaiXachTay.toStringWrite());
                br.newLine();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("File recording failed!");
        }
    }
    public static List<DienThoaiChinhHang> readPhoneDTCHCSV(){
        List<DienThoaiChinhHang> list = new ArrayList<>();
        FileReader fileReader =null;
        BufferedReader bufferedReader  =null;
        try{
            fileReader = new FileReader(DienThoaiChinhHang.FILE);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            DienThoaiChinhHang dienThoaiChinhHang;
            String[] temp;
            while ((line=bufferedReader.readLine())!=null){
                temp = line.split(",");
                int id =Integer.parseInt(temp[0]);
                String tenDienThoai= temp[1];
                float giaBan =Float.parseFloat(temp[2]);
                int soLuong=Integer.parseInt(temp[3]);
                String nhaSanXuat=temp[4];
                String thoiGianBaoHanh= temp[5];
                String phamViBaoHanh=temp[6];
                dienThoaiChinhHang = new DienThoaiChinhHang(tenDienThoai,giaBan,soLuong,nhaSanXuat,thoiGianBaoHanh,phamViBaoHanh);
                list.add(dienThoaiChinhHang);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return list;
    }

    public static List<DienThoaiXachTay> readPhoneDTXTCSV(){
        List<DienThoaiXachTay> list = new ArrayList<>();
        FileReader fileReader =null;
        BufferedReader bufferedReader  =null;
        try{
            fileReader = new FileReader(DienThoaiXachTay.FILE);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            DienThoaiXachTay dienThoaiXachTay;
            String[] temp;
            while ((line=bufferedReader.readLine())!=null){
                temp = line.split(",");
                int id =Integer.parseInt(temp[0]);
                String tenDienThoai= temp[1];
                float giaBan =Float.parseFloat(temp[2]);
                int soLuong=Integer.parseInt(temp[3]);
                String nhaSanXuat=temp[4];
                String quocGiaXachTay= temp[5];
                String trangThai=temp[6];
                dienThoaiXachTay = new DienThoaiXachTay(tenDienThoai,giaBan,soLuong,nhaSanXuat,quocGiaXachTay,trangThai);
                list.add(dienThoaiXachTay);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<DienThoaiChinhHang> dienThoaiXachTays = new ArrayList<>();
        dienThoaiXachTays= WriteReadFile.readPhoneDTCHCSV();
        for(DienThoaiChinhHang dienThoaiXachTay: dienThoaiXachTays){
            System.out.println(dienThoaiXachTay);
        }
    }


}
