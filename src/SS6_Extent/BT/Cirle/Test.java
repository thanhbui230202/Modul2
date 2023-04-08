package SS6_Extent.BT.Cirle;

public class Test {
    public static void main(String[] args) {
        System.out.println("Lớp Circle:");
        Circle circle = new Circle(1,"Yellow");
        System.out.println(circle.toString());
        System.out.println("Lớp Cylinder:");
        Cylinder cylinder = new Cylinder("Red", 8, 5);
        System.out.println("Thể Tích Hình Trụ Là :" + cylinder.volume());
        System.out.println(cylinder.toString());
    }
}
