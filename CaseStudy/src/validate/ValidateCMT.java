package validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCMT {
    private static final String SDT_REGEX = "^[0-9]{12}$";

    public ValidateCMT() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(SDT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}