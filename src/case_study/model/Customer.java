package case_study.model;

public class Customer extends Person{
    private String idCustomer;
    private String typeCustomer;
    private String address;

    public Customer(String name, String dateOfBirth, String gender, int identityCard, int phoneNumber, String email, String idCustomer, String typeCustomer, String address) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
