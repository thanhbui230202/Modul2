package case_study.model;

public class Villa  extends Facility{
    private String roomStandard;
    private double areaPool;
    private int numberFloor;
    public Villa(String nameService, double area, double cost, int maxPerson, String rentalType, String roomStandard, double areaPool, int numberFloor) {
        super(nameService, area, cost, maxPerson, rentalType);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }
}
