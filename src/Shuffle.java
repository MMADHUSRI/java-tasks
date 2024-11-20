import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("m");
        name.add("a");
        name.add("d");
        name.add("h");
        name.add("u");
        List<String> shuffle = new ArrayList<>();
        Collections.shuffle(name);
        System.out.print(name);

    }
}
