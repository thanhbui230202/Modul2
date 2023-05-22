package case_study.statics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvalidEmployeeDataException extends Exception {
    public InvalidEmployeeDataException(String message) {
        super(message);
    }
    public static boolean validateEmployeeCode(String employeeCode) throws InvalidEmployeeDataException {
        String regex = "NV-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("NV-1234");
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }
}

