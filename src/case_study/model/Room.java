package case_study.model;

public class Room extends Facility{
    private String freeService;

    public Room(String nameService, double area, double cost, int maxPerson, String rentalType, String freeService) {
        super(nameService, area, cost, maxPerson, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
