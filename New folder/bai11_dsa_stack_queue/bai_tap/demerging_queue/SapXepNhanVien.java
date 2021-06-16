package bai11_dsa_stack_queue.bai_tap.demerging_queue;

import java.time.LocalDate;


public class SapXepNhanVien implements Comparable<SapXepNhanVien> {
    public String name;
    public boolean gender;
    public LocalDate birthday;

    public SapXepNhanVien(String name, boolean gender, LocalDate birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public String gioiTinh(boolean gender){
        if(gender){
            return "Nam";
        }else return "Nu";
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", gender=" + gioiTinh(gender) +
                ", birthday=" + birthday +
                '}';
    }
    @Override
    public int compareTo(SapXepNhanVien o) {
        return this.birthday.compareTo(o.birthday);
    }
}
