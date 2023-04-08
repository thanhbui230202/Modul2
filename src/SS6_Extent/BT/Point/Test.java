package SS6_Extent.BT.Point;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(5, 3);
        System.out.println(point2D.toString());
        point2D.setXY(4, 7);
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D(6,5,4);
        System.out.println(point3D.toString());
        point3D.setXYZ(7,8,9);
        System.out.println(point3D.toString());
    }
}
