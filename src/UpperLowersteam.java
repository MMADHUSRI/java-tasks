
//limport java.util.*;


import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UpperLowersteam {
    public static void main(String[] args) {
        List<String > name = Arrays.asList("m","f","d","l");
        List<String> upper= name.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upper);
        List<String> lower= name.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lower);

    }

    }


