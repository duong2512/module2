package validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDate {
    private static final String DATE_REGEX = "^[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}$";

    public ValidateDate() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(DATE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
