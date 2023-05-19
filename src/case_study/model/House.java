package case_study.model;

public class House extends Facility{
    private String roomStandard;
    private int numFloor;

    public House(String nameService, double area, double cost, int maxPerson, String rentalType, String roomStandard, int numFloor) {
        super(nameService, area, cost, maxPerson, rentalType);
        this.roomStandard = roomStandard;
        this.numFloor = numFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }
}
