import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASS_REGEX = "^[C,A,P]{1}+[0-9]{4}+[G, H, I, K, L, M]{1}$";

    private static Pattern pattern;
    private Matcher matcher;

    public ClassName() {
    }

    public ClassName(Matcher matcher) {
        this.matcher = matcher;
    }

    public boolean validate(String regex){
        pattern= Pattern.compile(regex);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
