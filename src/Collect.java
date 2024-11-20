import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collect {
    public static void main(String[] args) {
        List<String> colour= new ArrayList<>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("purple");
        Collections.sort(colour);
        System.out.println(colour);
    }
}
