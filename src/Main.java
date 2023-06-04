import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getString(new String[]{"123", "32", "13", "123", "13", "9"}));
    }

    public String getString(String[] strings) {
        Set<String> set = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            if (set.contains(s)) {
                continue;
            } else {
                builder.append(s);
                set.add(s);
            }
        }
        return builder.toString();
    }

}