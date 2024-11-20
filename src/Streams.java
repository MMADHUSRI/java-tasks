import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> name = Arrays.asList(6,8,7,5,3);
        List<Integer> even = name.stream().filter(integer-> integer %2==0).map(Integer::intValue).collect(Collectors.toList());
        List<Integer> odd = name.stream().filter(integer-> integer  %2!=0).map(Integer::intValue).collect(Collectors.toList()).reversed();
        System.out.println(even);
        System.out.println(odd);
    }
}
