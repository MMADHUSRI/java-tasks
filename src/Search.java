import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        List<String> name= new ArrayList<>();
        String [] find= {"m","s","d","g"};
        Scanner mad = new Scanner(System.in);
        String tan = mad.findInLine(Arrays.toString(find));


            System.out.println("The element in this list is  " + tan);



    }
}
