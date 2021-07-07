package Case_study.models;

public class Customer extends Person {

    private String typeCustomer; // Diamond, Platinium, Gold, silver, Member

    private String address;

    public Customer() {
    }

    public Customer(String idCode, String namePerson, String dateOfBirth, String gender, String idPerson, String phoneNumber, String emailAddress, String typeCustomer, String address) {
        super(idCode, namePerson, dateOfBirth, gender, idPerson, phoneNumber, emailAddress);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(String typeCustomer, String address) {
        this.typeCustomer = typeCustomer;
        this.address = address;
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

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCode + '\'' +
                ", address='" + address + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", namePerson='" + namePerson + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idPerson='" + idPerson + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
