package bai_14_thuat_toan_sap_xep.bai_tap;

public class InsertionSort {

    public void insertionSort(int arr[]) {
        int valueToInsert;
        int holePosition;
        int i;

        // lap qua tat ca cac so
        for (i = 1; i < arr.length; i++) {

            // chon mot gia tri de chen
            valueToInsert = arr[i];

            // lua chon vi tri de chen
            holePosition = i;

            // kiem tra xem so lien truoc co lon hon gia tri duoc chen khong
            while (holePosition > 0 && valueToInsert < arr[holePosition - 1]) {
                arr[holePosition] = arr[holePosition - 1];
                holePosition--;
                System.out.println("Di chuyen phan tu: " + arr[holePosition]);
            }

            if (holePosition != i) {
                System.out.println(" Chen phan tu: " + valueToInsert
                        + ", tai vi tri: " + holePosition);
                // chen phan tu tai vi tri chen
                arr[holePosition] = valueToInsert;
            }

            System.out.println("Vong lap thu " + i);
            display(arr);
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");

        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = {6, 7, 0, 2, 8, 1, 3, 9, 4, 5};

        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Mang du lieu dau vao: ");
        insertionSort.display(arr);
        System.out.println("-----------------------------");
        insertionSort.insertionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        insertionSort.display(arr);
    }
}
