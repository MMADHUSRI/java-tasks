import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gen {
    public static <R extends Number> int[] mad(List<R> numbers) {
       int even = 0;

        int odd = 0;
        for (R number : numbers) {
            if (number.intValue() % 2 == 0) {
                even += number.intValue();
                          }
            else {
                odd += number.intValue();

            }
        }

        System.out.println("even " + even);
        System.out.println(" odd" + odd);

        return new int[0];

   }


     {
             List<Integer> num= List.of(1,2,3,4,5,6);


          mad(num);



    }


    }


