import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static final String NUMBER_REGEX = "\\([0-9]{2}\\)\\-\\(0[0-9]{9}\\)";
    private static Pattern pattern;
    private Matcher matcher;

    public NumberPhone() {
    }

    public NumberPhone(Matcher matcher) {
        this.matcher = matcher;
    }

    public boolean validate(String regex){
        pattern= Pattern.compile(NUMBER_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
