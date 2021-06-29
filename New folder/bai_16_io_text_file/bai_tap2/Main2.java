package bai_16_io_text_file.bai_tap2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public List<Country> readFromFile() {
        List<Country> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("country.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] txt = line.split(",");
                int id = Integer.parseInt(txt[0]);
                String code = txt[1];
                String country = txt[2];
                list.add(new Country(id , code , country));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        Main2 m = new Main2();
        List<Country> list = m.readFromFile();
        for (Country o : list) {
            System.out.println(o);
        }
    }
}
