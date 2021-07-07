package Case_study.services.class_service;

import Case_study.models.*;
import Case_study.utils.ReadAndWriteFacility;
import Case_study.utils.class_ReadAndWrite.ReadAndWriteFacilityImp;

import java.io.File;
import java.util.*;
import java.util.regex.Pattern;

public class FacilityServiceImpl {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<Facility, Integer> myMap = new LinkedHashMap<>();//VL1, H1, R1, VL2
    private static Map<Facility, Integer> mapVilla = new LinkedHashMap<>();
    private static Map<Facility, Integer> mapHouse = new LinkedHashMap<>();
    private static Map<Facility, Integer> mapRoom = new LinkedHashMap<>();

    static {
        runMap();
    }

    private static void runMap() {
        mapVilla = new ReadAndWriteFacilityImp().readFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\villa.csv");
        mapHouse = new ReadAndWriteFacilityImp().readFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\house.csv");
        mapRoom = new ReadAndWriteFacilityImp().readFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\room.csv");
        myMap.putAll(mapVilla);
        myMap.putAll(mapHouse);
        myMap.putAll(mapRoom);
    }


    public void display() {
        for (Map.Entry<Facility, Integer> element : myMap.entrySet()) {
            System.out.println("Service" + element.getKey() + " số lần sử dụng: " + element.getValue());
        }
    }

    public Map<Facility, Integer> getList() {
        return myMap;
    }

    public void displayFacMaintain() {
        boolean maintainFac = false;
        for (Map.Entry<Facility, Integer> entry : myMap.entrySet()) {
            Facility key = entry.getKey();
            int value = entry.getValue();
            if (value >= 5) {
                System.out.println(key.toString());
                maintainFac = true;
            }
        }
        if (!maintainFac) {
            System.out.println("Không có Facility cần bảo trì");
        }
    }

    private static boolean checkFile(String path) {
        File file = new File(path);
        return file.exists();
    }

    private static String regexVilla() {
        String regular = "(SVVL)[-][\\d]{4}";
        boolean check;
        String nameFacility;
        do {
            System.out.println("Nhập Id cho Villa");
            nameFacility = scanner.nextLine();
            check = Pattern.matches(regular, nameFacility);
        } while (!check);
        return nameFacility;
    }

    private static String regexHouse() {
        String nameFacility;
        String regular = "(SVHO)[-][\\d]{4}";
        boolean check;
        do {
            System.out.println("Nhập Id cho House");
            nameFacility = scanner.nextLine();
            check = Pattern.matches(regular, nameFacility);
        } while (!check);
        return nameFacility;
    }

    private static String regexRoom() {
        String nameFacility;
        String regular = "(SVRO)[-][\\d]{4}";
        boolean check;
        do {
            System.out.println("Nhập Id cho Room");
            nameFacility = scanner.nextLine();
            check = Pattern.matches(regular, nameFacility);
        } while (!check);
        return nameFacility;
    }

    private static String styleAndStandardService() {
        String style;
        String regular = "[A-Z][a-zA-z]*";
        boolean check;
        do {
            style = scanner.nextLine();
            check = Pattern.matches(regular, style);
            if (!check) {
                System.out.println("Mời nhập lại");
            }
        } while (!check);
        return style;
    }

    public void addVilla(ReadAndWriteFacility readAndWriteFacility) {
        if (checkFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\villa.csv")) {
            mapVilla = readAndWriteFacility.readFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\villa.csv");
        }
        boolean checkVilla = true;
        while (checkVilla) {
            try {
                String idVilla = regexVilla();
                double areaUse;
                int price;
                int rentalPeople;
                double areaPool;
                int floor;
                do {
                    System.out.println("1. Nhập diện tích của Villa");
                    areaUse = Double.parseDouble(scanner.nextLine());
                    System.out.println("2. Giá cho thuê");
                    price = Integer.parseInt(scanner.nextLine());
                    System.out.println("3. Số lượng người thuê tối đa cho 1 Villa");
                    rentalPeople = Integer.parseInt(scanner.nextLine());
                    System.out.println("4. Diện tích hồ bơi");
                    areaPool = Double.parseDouble(scanner.nextLine());
                    System.out.println("5. Số tầng");
                    floor = Integer.parseInt(scanner.nextLine());
                    if (areaUse < 30) {
                        System.out.println("1. Nhập lại diện tích của Villa");
                        areaUse = Double.parseDouble(scanner.nextLine());
                    } else if (price < 0) {
                        System.out.println("2. Nhập lại giá cho thuê");
                        price = Integer.parseInt(scanner.nextLine());
                    } else if (rentalPeople < 0 || rentalPeople > 20) {
                        System.out.println("3. Nhập lại số lượng người thuê tối đa cho 1 Villa");
                        rentalPeople = Integer.parseInt(scanner.nextLine());
                    } else if (areaPool < 30) {
                        System.out.println("4. Nhập lại diện tích hồ bơi");
                        areaPool = Double.parseDouble(scanner.nextLine());
                    } else if (floor < 0) {
                        System.out.println("5. Nhập lại số tầng");
                        floor = Integer.parseInt(scanner.nextLine());
                    }
                } while (areaUse > 30 && price > 0 && (rentalPeople > 0 && rentalPeople < 20) && areaPool > 30 && floor > 0);
                System.out.println("6. Thuê theo ngày/giờ/tháng");
                String styleRental = styleAndStandardService();
                System.out.println("7. Tiêu chuẩn của phòng");
                String standardVilla = styleAndStandardService();
                Villa villa = new Villa(idVilla, areaUse, price, rentalPeople, styleRental, standardVilla, areaPool, floor);
                mapVilla.put(villa, 0);
                myMap.put(villa, 0);
                readAndWriteFacility.writeFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\villa.csv", mapVilla);
                checkVilla = false;
            } catch (RuntimeException ex) {
                System.out.println("Nhập đúng dữ liệu cho Villa");
            }
        }

    }

    public void addHouse(ReadAndWriteFacility readAndWriteFacility) {
        if (checkFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\house.csv")) {
            mapHouse = readAndWriteFacility.readFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\house.csv");
        }
        boolean checkHouse = true;
        while (checkHouse) {
            try {
                String idHouse = regexHouse();
                double areaUse;
                int price;
                int rentalPeople;
                int floor;
                do {
                    System.out.println("1. Nhập diện tích của House");
                    areaUse = Double.parseDouble(scanner.nextLine());
                    System.out.println("2. Giá cho thuê");
                    price = Integer.parseInt(scanner.nextLine());
                    System.out.println("3. Số lượng người thuê tối đa cho 1 House");
                    rentalPeople = Integer.parseInt(scanner.nextLine());
                    System.out.println("4. Số tầng");
                    floor = Integer.parseInt(scanner.nextLine());
                    if (areaUse < 30) {
                        System.out.println("1. Nhập lại diện tích của House");
                        areaUse = Double.parseDouble(scanner.nextLine());
                    } else if (price < 0) {
                        System.out.println("2. Nhập lại giá cho thuê");
                        price = Integer.parseInt(scanner.nextLine());
                    } else if (rentalPeople < 0 || rentalPeople > 20) {
                        System.out.println("3. Nhập lại số lượng người thuê tối đa cho 1 Villa");
                        rentalPeople = Integer.parseInt(scanner.nextLine());
                    } else if (floor < 0) {
                        System.out.println("4. Nhập lại số tầng");
                        floor = Integer.parseInt(scanner.nextLine());
                    }
                } while (areaUse > 30 && price > 0 && (rentalPeople > 0 && rentalPeople < 20) && floor > 0);
                System.out.println("5. Thuê theo ngày/giờ/tháng");
                String styleRental = styleAndStandardService();
                System.out.println("6. Tiêu chuẩn của phòng");
                String standardVilla = styleAndStandardService();
                House house = new House(idHouse, areaUse, price, rentalPeople, styleRental, standardVilla, floor);
                mapHouse.put(house, 0);
                myMap.put(house, 0);
                readAndWriteFacility.writeFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\house.csv", mapHouse);
                checkHouse = false;
            } catch (RuntimeException ex) {
                System.out.println("Nhập đúng dữ liệu cho House");
            }
        }
    }


    public void addRoom(ReadAndWriteFacility readAndWriteFacility) {
        if (checkFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\room.csv")) {
            mapRoom = readAndWriteFacility.readFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\room.csv");
        }
        boolean checkRoom = true;
        while (checkRoom) {
            try {
                String idRoom = regexRoom();
                double areaUse;
                int price;
                int rentalPeople;
                do {
                    System.out.println("1. Nhập diện tích của Room");
                    areaUse = Double.parseDouble(scanner.nextLine());
                    System.out.println("2. Giá cho thuê");
                    price = Integer.parseInt(scanner.nextLine());
                    System.out.println("3. Số lượng người thuê tối đa cho 1 Room");
                    rentalPeople = Integer.parseInt(scanner.nextLine());
                    if (areaUse < 30) {
                        System.out.println("1. Nhập lại diện tích của Villa");
                        areaUse = Double.parseDouble(scanner.nextLine());
                    } else if (price < 0) {
                        System.out.println("2. Nhập lại giá cho thuê");
                        price = Integer.parseInt(scanner.nextLine());
                    } else if (rentalPeople < 0 || rentalPeople > 20) {
                        System.out.println("3. Nhập lại số lượng người thuê tối đa cho 1 Villa");
                        rentalPeople = Integer.parseInt(scanner.nextLine());
                    }
                } while (areaUse > 30 && price > 0 && (rentalPeople > 0 && rentalPeople < 20));
                System.out.println("4. Thuê theo ngày/giờ/tháng");
                String styleRental = styleAndStandardService();
                System.out.println("5. Các dịch vụ miễn phí");
                String freeService = styleAndStandardService();
                Room room = new Room(idRoom, areaUse, price, rentalPeople, styleRental, freeService);
                mapRoom.put(room, 0);
                myMap.put(room, 0);
                readAndWriteFacility.writeFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\room.csv", mapRoom);
                checkRoom = false;
            } catch (RuntimeException ex) {
                System.out.println("Nhập đúng dữ liệu cho Room");
            }
        }
    }
}
