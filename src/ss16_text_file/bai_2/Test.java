package ss16_text_file.bai_2;

import ss16_text_file.bai_1.Student;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
       List<Country> countryList = FileUtil.readCSV();
        for (Country country: countryList){
            System.out.println(country);
        }
    }
}
