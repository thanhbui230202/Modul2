package SS6_Extent.BT.Cirle;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(String color, double radius, double height){
        super(radius, color);
        this.height = height;
    }
    public double volume(){
        return (getRadius()*2)*Math.PI*this.height;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + super.getColor() + '\'' +
                ", radius=" + super.getRadius() +
                ", height=" + this.height +
                '}';
    }


}
