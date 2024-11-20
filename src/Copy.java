import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class Copy {
    public static void main(String[] args) {
        List<String> nam = new ArrayList<>();
        nam.add("m");
        nam.add("s");
        nam.add("k");
        List<String> copy = new ArrayList<>();
      copy.addAll(nam);

            System.out.println(nam);
        System.out.println(copy);

    }
}
