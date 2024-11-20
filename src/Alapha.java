import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Alapha {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("r","f","g");
        List<String> sort = strings.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println("original list " + strings);
        System.out.println("sorted list " + sort);
    }
}
