package thimodule2.model;

public class DienThoaiXachTay extends Phone {
    public static final String FILE="F:\\CODEGYM\\Modull2\\src\\thimodule2\\data\\mobiles.csv";
    private String quocGiaxachTay;
    private String trangThai;

    public DienThoaiXachTay( String tenDienThoai, float giaBan, int soLuong, String nhaSanXuat, String quocGiaxachTay, String trangThai) {
        super(tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGiaxachTay = quocGiaxachTay;
        this.trangThai = trangThai;
    }

    public DienThoaiXachTay() {
    }

    public String getQuocGiaxachTay() {
        return quocGiaxachTay;
    }

    public void setQuocGiaxachTay(String quocGiaxachTay) {
        this.quocGiaxachTay = quocGiaxachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DienThoaiXachTay{" +
                ", id=" + id +
                ", tenDienThoai='" + tenDienThoai + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                "quocGiaxachTay='" + quocGiaxachTay + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
    public String toStringWrite()
    {
        return  id+","+
                tenDienThoai+","+
                giaBan+","+
                soLuong+","+
                nhaSanXuat+","+
                quocGiaxachTay+","+
                trangThai;
    }
}
