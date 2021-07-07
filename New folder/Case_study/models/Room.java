package Case_study.models;

public class Room extends Facility {
    private String freeService;
    private final static String NAME = "Room";

    public Room(String idFacility,  double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeService) {
        super(idFacility, NAME, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.freeService = freeService;
    }

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "idFacility='" + super.getIdFacility()  + '\'' +
                ", nameService='" + super.getNameService()  + '\'' +
                ", areaUse=" + super.getAreaUse()  +
                ", rentalPrice=" + super.getRentalPrice()  +
                ", rentalPeopleMax=" + super.getRentalPeopleMax()  +
                ", styleRental='" + super.getStyleRental()  + '\'' +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
