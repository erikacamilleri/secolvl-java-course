package yr_11.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * An example of validating a date, using exception handling in Java
 */
public class DateValidator {

    public static void main(String[] args) {
        String validDate = "23/12/2021";
        String invalidDate = "Ms Camilleri";
        System.out.println(validDate + " is valid: " + DateValidator.isValid(validDate));
        System.out.println(invalidDate + " is valid: " + DateValidator.isValid(invalidDate));
    }

    /**
     * Given a date in String format, try to parse it, if we manage then valid, otherwise not valid
     * @param dateIn e.g. "23/12/2021"
     * @return isValid
     */
    public static boolean isValid(String dateIn) {
        boolean isValid = true;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            formatter.parse(dateIn);
        } catch (Exception e) {
            isValid = false;
        }
        return isValid;
    }
}