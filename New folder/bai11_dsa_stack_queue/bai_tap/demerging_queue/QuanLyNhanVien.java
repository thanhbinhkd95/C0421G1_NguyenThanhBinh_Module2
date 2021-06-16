package bai11_dsa_stack_queue.bai_tap.demerging_queue;

import java.time.LocalDate;
import java.util.*;

public class QuanLyNhanVien {
    public static void main(String[] args) {
        Queue<SapXepNhanVien> outPut = new ArrayDeque<>();
        Queue<SapXepNhanVien> nu = new ArrayDeque<>();
        Queue<SapXepNhanVien> nam = new ArrayDeque<>();
        Queue<SapXepNhanVien> sapXepNhanVien = new PriorityQueue<>();
        sapXepNhanVien.add(new SapXepNhanVien("Chanh", true, LocalDate.of(1994, 1, 1)));
        sapXepNhanVien.add(new SapXepNhanVien("Binh", true, LocalDate.of(1995, 2, 3)));
        sapXepNhanVien.add(new SapXepNhanVien("Ronaldo", false, LocalDate.of(1990, 12, 1)));
        sapXepNhanVien.add(new SapXepNhanVien("Kaka", false, LocalDate.of(1997, 5, 20)));
        sapXepNhanVien.add(new SapXepNhanVien("Messi", true, LocalDate.of(1989, 8, 20)));
        sapXepNhanVien.add(new SapXepNhanVien("Neymar", false, LocalDate.of(1988, 3, 20)));
        sapXepNhanVien.add(new SapXepNhanVien("Anh", false, LocalDate.of(1988, 3, 21)));
        while (!sapXepNhanVien.isEmpty()) {
            if (sapXepNhanVien.peek().isGender()) {
                nam.add(sapXepNhanVien.poll());
            } else nu.add(sapXepNhanVien.poll());
        }
        while (nu.size()!=0){
            outPut.add(nu.poll());
        }
        while (nam.size()!=0){
            outPut.add(nam.poll());
        }
        System.out.println("Danh sách nhân viên nữ trước nam sau và theo ngày sinh: ");
        while (outPut.size()!=0){
            System.out.println(outPut.poll());
        }
    }
}
