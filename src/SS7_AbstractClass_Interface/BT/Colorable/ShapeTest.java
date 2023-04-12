package SS7_AbstractClass_Interface.BT.Colorable;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Square(5.0);
        shape[1] = new Circle(2.0);
        shape[2] = new Rectangle(3.0,1.0);

        for (Shape a: shape) {
            if (a instanceof Colorable){
                ((Colorable) a).howtoColor();
            } else {
                System.out.println(a.toString());
            }

        }
    }
}
