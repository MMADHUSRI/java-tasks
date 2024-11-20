import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Average {




    public static void main(String[] args) {
        List<Integer> mad = Arrays.asList(1,2);
        double aver= mad.stream().mapToDouble(Integer::doubleValue).average().orElse(0 );

        System.out.println(aver);


    }

}
