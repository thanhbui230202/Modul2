package case_study.statics;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class Validate {
    private static final String DATE_FORMAT = "\\d{2}/\\d{2}/\\d{4}";
    private static final String CMND_FORMAT="^[0-9]{9,12}$";
    private static final String PHONE_FORMAT="^[0-9]{10}$";
    private static final String ID_EM_FORMAT="^NV-[0-9]{4}$";
    private static final String ID_CUS_FORMAT="^KH-[0-9]{4}$";
    private static final String EMAIL_FORMAT = "^[\\w.]+@[\\w&&[^_]]+([.][\\w&&[^_]]+){1,2}$";
   // private static final String NAME_FORMAT = "^[A-Z][a-z]+((\\s[A-Z][a-z]+)+)?";
    private static final String NAME_FORMAT = "^([A-Z][a-z]+)(\\s[A-Z][a-z]+)+$";
    public static boolean isDateRight(String dateStr) {
        if (!dateStr.matches(DATE_FORMAT)) {
            return false;
        }
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dateArr = dateStr.split("/");
        int day = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        if (month < 0 || month > 12) {
            return false;
        }
        Year year = Year.of(Integer.parseInt(dateArr[2]));
        if (year.isLeap()) {
            daysInMonth[1] = 29;
        }
        return day >= 0 && day<=daysInMonth[month - 1];
    }

    public static boolean isInOutDateRight(LocalDate inDate, LocalDate outDate) {
        return Period.between(inDate, outDate).getDays() >= 0;
    }
    public static boolean isCMND(String CMND)
    {
        return CMND.matches(CMND_FORMAT);
    }
    public static boolean isIdEm(String ID)
    {
        return ID.matches(ID_EM_FORMAT);
    }
    public static boolean isIdCus(String ID)
    {
        return ID.matches(ID_CUS_FORMAT);
    }
    public static boolean isPhone(String Phone)
    {
        return Phone.matches(PHONE_FORMAT);
    }
    public static boolean isEmail(String Email){
        return Email.matches(EMAIL_FORMAT);
    }
    public static boolean isName(String Name){
        return Name.matches(NAME_FORMAT);
    }

}
