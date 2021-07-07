package Case_study.services.class_service;

import Case_study.libs.BookingComparator;
import Case_study.models.*;
import Case_study.utils.ReadAndWriteBooking;
import Case_study.utils.class_ReadAndWrite.ReadAndWriteFacilityImp;
import java.io.File;
import java.util.*;

public class BookingServiceImpl {

    private static final Scanner scanner = new Scanner(System.in);

    private static Set<Booking> myTree = new TreeSet<>(new BookingComparator());


    public void displayListBooking(ReadAndWriteBooking readAndWrite) {
        File file = new File("src\\Case_study_new\\data\\booking.csv");
        if (file.exists()){
            for (Booking element : readAndWrite.readFile("src\\Case_study_new\\data\\booking.csv")) {
                System.out.println(element.toString());
            }
        }else {
            System.out.println("Chưa có booking nào");
        }
    }


    public void addBooking(ReadAndWriteBooking readAndWrite) {
        File file = new File("src\\Case_study_new\\data\\booking.csv");
        if (file.exists()){
            myTree = (Set<Booking>) readAndWrite.readFile("src\\Case_study_new\\data\\booking.csv");
        }
        System.out.println("Danh sách customer");
        new CustomerServiceImpl().display();
        System.out.println("Danh sách facility ");
        new FacilityServiceImpl().display();
        System.out.println("Nhập id của lượt booking này");
        String idBooking = scanner.nextLine();
        System.out.println("Ngày bắt đầu booking");
        String startDate = scanner.nextLine();
        System.out.println("Ngày kết thúc");
        String endDate = scanner.nextLine();
        Customer customer;
        Facility facility;
        do {
            customer = findCustomer();
            facility = findFacility();
        }while ((customer != null) && (facility!= null));
        Booking booking = new Booking(idBooking, startDate, endDate, customer, facility);
        myTree.add(booking);
        readAndWrite.writeFile("src\\Case_study_new\\data\\booking.csv", myTree);
    }

    private static Customer findCustomer(){
        System.out.println("Nhập id của customer");
        String idCus = scanner.nextLine();
        for (Customer element : new CustomerServiceImpl().getList()) {
            if (element.getIdCode().equals(idCus)) {
                return element;
            }
        }
        return null;
    }

    private static Facility findFacility(){
        System.out.println("Nhập id của mã dịch vụ");
        String idFac = scanner.nextLine();
        Facility facility = null;
        Map<Facility, Integer> facilityIntegerMap = new FacilityServiceImpl().getList();
        for (Facility element : facilityIntegerMap.keySet()) {
            if (element.getIdFacility().equals(idFac)) {
                facility = element;
                int newValue = facilityIntegerMap.get(element) +1;
                facilityIntegerMap.put(element, newValue);
                break;
            }
        }
        Map<Facility, Integer> mapVilla = new LinkedHashMap<>();
        Map<Facility, Integer> mapHouse = new LinkedHashMap<>();
        Map<Facility, Integer> mapRoom = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            if (element.getKey() instanceof Villa) {
                mapVilla.put(element.getKey(), element.getValue());
                continue;
            }
            if (element.getKey()  instanceof House) {
                mapHouse.put(element.getKey(), element.getValue());
                continue;
            }
            if (element.getKey()  instanceof Room) {
                mapRoom.put(element.getKey(), element.getValue());
            }
        }
        new ReadAndWriteFacilityImp().writeFile("src\\Case_study_new\\data\\villa.csv", mapVilla);
        new ReadAndWriteFacilityImp().writeFile("src\\Case_study_new\\data\\house.csv", mapHouse);
        new ReadAndWriteFacilityImp().writeFile("src\\Case_study_new\\data\\room.csv", mapRoom);
        return facility;
    }
}
