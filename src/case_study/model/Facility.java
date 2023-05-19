package case_study.model;

public abstract class Facility {
    private String nameService;
    private double area;
    private double cost;
    private int maxPerson;
    private String rentalType;

    public Facility(String nameService, double area, double cost, int maxPerson, String rentalType) {
        this.nameService = nameService;
        this.area = area;
        this.cost = cost;
        this.maxPerson = maxPerson;
        this.rentalType = rentalType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}
