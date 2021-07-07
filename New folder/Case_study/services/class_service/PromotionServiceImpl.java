package Case_study.services.class_service;

import Case_study.models.Booking;
import Case_study.models.Customer;
import Case_study.utils.class_ReadAndWrite.ReadAndWriteBookingImp;

import java.util.*;

public class PromotionServiceImpl implements PromotionService {
    private static final Scanner scanner = new Scanner(System.in);

    private static TreeSet<Booking> getListBooking() {
        return (TreeSet<Booking>) new ReadAndWriteBookingImp().readFile("Case_study_new\\data\\booking.csv");
    }

    @Override
    public void display() {
        TreeSet<Booking> treeSet = getListBooking();
        Set<CustomerList> customerListSet = new TreeSet<>();
        for (Booking element : treeSet) {
            System.out.println("Tên của customer " + element.getCustomer().getNamePerson());
            System.out.println("Id của customer: " + element.getCustomer().getIdCode());
            System.out.println("Nhập vào số năm của customer sử dụng dịch vụ: ");
            int year = Integer.parseInt(scanner.nextLine());
            customerListSet.add(new CustomerList(element.getCustomer(), year));
        }
        for (CustomerList element : customerListSet)
            System.out.println(element);
    }

    @Override
    public void listGetVoucher() {
        TreeSet<Booking> treeSet = getListBooking();
        Stack<Booking> myList = new Stack();
        myList.addAll(treeSet);
        int[] listVoucher = numberVoucher(treeSet);
        for (int i = listVoucher[2]; i > 0; i--) {
            System.out.println(myList.pop() + "Voucher 10%");
        }
        for (int i = listVoucher[1]; i > 0; i--) {
            System.out.println(myList.pop() + "Voucher 20%");
        }
        for (int i = listVoucher[0]; i > 0; i--) {
            System.out.println(myList.pop() + "Voucher 50%");
        }
    }

    private int[] numberVoucher(Set<Booking> set) {
        int voucher50 = 0;
        int voucher20 = 0;
        int voucher10 = 0;
        System.out.println("Tổng customer là:" + set.size());
        while (voucher50 + voucher20 + voucher10 != set.size()) {
            System.out.println("Nhập số voucher 50%");
            voucher50 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số voucher 20%");
            voucher20 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số voucher 10%");
            voucher10 = Integer.parseInt(scanner.nextLine());
            if (voucher50 + voucher20 + voucher10 != set.size()) {
                System.out.println("Vui lòng nhập đúng số voucher = số customer");
            }
        }
        return new int[]{voucher50, voucher20, voucher10};
    }

    private static class CustomerList implements Comparable<CustomerList> {
        private Customer customer;
        private int year;

        public CustomerList(Customer customer, int year) {
            this.customer = customer;
            this.year = year;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public int compareTo(CustomerList o) {
            return this.getYear() - o.getYear();
        }

        @Override
        public String toString() {
            return "CustomerList{" +
                    "customer=" + customer +
                    ", year=" + year +
                    '}';
        }
    }
}
