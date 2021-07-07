package Case_study.models;

public class House extends Facility {

    private String standardHose;
    private int floor;
    private static final String NAME = "House";

    public House(String idFacility, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardHose, int floor) {
        super(idFacility, NAME, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardHose = standardHose;
        this.floor = floor;
    }

    public House(String standardHose, int floor) {
        this.standardHose = standardHose;
        this.floor = floor;
    }

    public House() {
    }

    @Override
    public String toString() {
        return "House{" +
                "idFacility='" + super.getIdFacility() + '\'' +
                ", nameService='" + super.getNameService() + '\'' +
                ", areaUse=" + super.getAreaUse() +
                ", rentalPrice=" + super.getRentalPrice() +
                ", rentalPeopleMax=" + super.getRentalPeopleMax() +
                ", styleRental='" + super.getStyleRental() + '\'' +
                "standardHose='" + standardHose + '\'' +
                ", floor=" + floor +
                '}';
    }
}
