package Case_study.models;

import java.io.Serializable;

public class Booking implements Serializable{
    private String idBooking;
    private String startDate;
    private String endDate;
    private Customer customer;
    private Facility facility;

    public Booking() {
    }

    public Booking(String idBooking, String startDate, String endDate, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.facility = facility;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

//    @Override
//    public int compareTo(Booking o) {
//        if (this.idBooking.compareTo(o.getIdBooking()) != 0) {
//            if (this.startDate.compareTo(o.getStartDate()) > 0) {
//                return 1;
//            } else if (this.startDate.compareTo(o.getStartDate()) < 0) {
//                return -1;
//            } else {
//                if (this.endDate.compareTo(o.getEndDate()) > 0) {
//                    return 1;
//                } else if (this.endDate.compareTo(o.getEndDate()) < 0){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        }
//        return 0;
//    }



    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idCustomer=" + customer.getIdCode() +
                ", nameService=" + facility.getNameService()+
                ", idService=" + facility.getIdFacility()+
                '}';
    }
}
