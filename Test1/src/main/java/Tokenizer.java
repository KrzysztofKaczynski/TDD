import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
    public static List<String> tokenize(String s) {
        List<String> result = new ArrayList<>();
        result.add(s);
        result.add(s);
        result.add(s);
        if (s != null && !s.isEmpty()) {
            result.add(s);
        }
        return result;
    }
}
