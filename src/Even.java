import Oops.Calculator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9,5,8,7,4);
        List<Integer> odd = numbers.stream().filter(integer -> integer %2!=0).collect(Collectors.toList());
        List<Integer> even = numbers.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
        System.out.println("original number : "+ numbers);
        System.out.println("even number : "+ even);
        System.out.println("odd number : " + odd);

    }
}
