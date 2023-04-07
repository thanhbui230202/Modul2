package SS5_AccessModifer_StaticMethod_StaticProperty.BT;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public static final double pi = 3.14;
    Circle(){

    }
    public void Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return pi*radius*radius;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double radius1 = circle.getRadius();
        double area = circle.getArea();
        String color = circle.getColor();
        System.out.println(radius1);
        System.out.println(area);
        System.out.println(color);
    }
}
