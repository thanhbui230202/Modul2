package thimodule2.model;

public class DienThoaiChinhHang extends Phone {
    public static final String FILE="F:\\CODEGYM\\Modull2\\src\\thimodule2\\data\\mobiles.csv";
    private String thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang( String tenDienThoai, float giaBan, int soLuong, String nhaSanXuat, String thoiGianBaoHanh, String phamViBaoHanh) {
        super( tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public DienThoaiChinhHang() {
    }

    public String getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return  "DienThoaiChinhHang{" +
                ", id=" + id +
                ", tenDienThoai='" + tenDienThoai + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                "thoiGianBaoHanh='" + thoiGianBaoHanh + '\'' +
                ", phamViBaoHanh='" + phamViBaoHanh + '\'' +
                '}';
    }
    public String toStringWrite()
    {
        return  id+","+
                tenDienThoai+","+
                giaBan+","+
                soLuong+","+
                nhaSanXuat+","+
                thoiGianBaoHanh+","+
                phamViBaoHanh;
    }
}
