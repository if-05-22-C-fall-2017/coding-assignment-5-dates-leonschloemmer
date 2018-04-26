import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        Pattern p = Pattern.compile("^(([0-2]?[0-9])|(30|31))[\\.\\-\\s]((0?[1-9])|(1[0-2]))[\\.\\-\\s]((19|20)?[0-9]{2})$");
        return p.matcher(dateString);
    }
}
