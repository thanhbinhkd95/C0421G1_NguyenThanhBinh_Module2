package Case_study.models;


import java.io.Serializable;

public class Contract implements Comparable<Contract>, Serializable {
    private String idContract;
    private Booking booking;
    private int prePayment;
    private int totalPayment;
    private Customer customer;

    public Contract(String idContract, Booking booking, int prePayment, int totalPayment, Customer customer) {
        this.idContract = idContract;
        this.booking = booking;
        this.prePayment = prePayment;
        this.totalPayment = totalPayment;
        this.customer = customer;
    }

    public Contract() {
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public int getPrePayment() {
        return prePayment;
    }

    public void setPrePayment(int prePayment) {
        this.prePayment = prePayment;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", idBooking=" + booking.getIdBooking() +
                ", prePayment=" + prePayment +
                ", totalPayment=" + totalPayment +
                ", idCustomer=" + customer.getIdCode() +
                '}';
    }

    @Override
    public int compareTo(Contract o) {
        return 0;
    }
}
