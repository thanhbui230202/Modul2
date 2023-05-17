package ss16_text_file.bai_2;

import ss16_text_file.bai_1.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILE_PATH = "E:\\CodeGym\\Modul2\\Modul2\\src\\ss16_text_file\\bai_2\\country.csv";
    public static List<Country> readCSV() throws IOException {
        List<Country> countryList = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String temp[];
        Country country;
        while ((line = bufferedReader.readLine())!= null){
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String code = temp[1];
            String name = temp[2];
            country = new Country(id,code,name);
            countryList.add(country);
        }
        bufferedReader.close();
        return countryList;
    }
}
