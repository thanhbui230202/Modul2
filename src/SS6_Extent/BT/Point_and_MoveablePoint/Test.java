package SS6_Extent.BT.Point_and_MoveablePoint;

public class Test {
    public static void main(String[] args) {
        MoveablePoint mP = new MoveablePoint(5,7,2,3);
        System.out.println(mP.toString());
        System.out.println(mP.move());
    }
}
