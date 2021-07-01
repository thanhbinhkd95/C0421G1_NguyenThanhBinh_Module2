package bai17_io_binary_file_serialization.bai_tap_17.copy_file_nhi_phan;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void copyFileNhiPhan(String fileNguon,String fileDich) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(fileNguon);
            outputStream = new FileOutputStream(fileDich);
            byte[] bytes = new byte[1024];
            int length;
            while ((length=inputStream.read(bytes))>0){
                outputStream.write(bytes,0,length);
            }
            System.out.println("copy xong");
            System.out.println("Số byte trong tệp: ");
            for (int a: bytes){
                System.out.println(a);
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            assert inputStream != null;
            inputStream.close();
            assert outputStream != null;
            outputStream.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập file nguồn: ");
        String fileNguon = scanner.nextLine();
        System.out.print("Nhập file đích: ");
        String fileDich = scanner.nextLine();
        copyFileNhiPhan(fileNguon,fileDich);
    }
}
