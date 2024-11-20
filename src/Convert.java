import javax.xml.transform.Transformer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Convert {
    public static void main(String[] args) {
        List<String> Strings= Arrays.asList("madhg","ghfghh","ghtgu");
        List<String> upeerCaseStrings = transformStrings(Strings,str -> str.toUpperCase());
        System.out.println(upeerCaseStrings);
        List<String> lowerCaseStrings = transformStrings(Strings , str -> str.toLowerCase());
        System.out.println(lowerCaseStrings);



    }
    private  static  List<String> transformStrings(List<String> strings, Function< String, String > transformer){
        return strings.stream()
                .map(transformer)
                .collect(Collectors.toList());
    }
}
