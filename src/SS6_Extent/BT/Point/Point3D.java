package SS6_Extent.BT.Point;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(){

    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float X, float Y, float Z){
        setX(X);
        setY(Y);
        this.z = Z;
    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + this.z +
                '}';
    }
}
