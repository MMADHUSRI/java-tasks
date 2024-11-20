import java.util.*;
import java.util.stream.Collectors;


public class Twolist {
   public  static  <T> List<T> mad(List<T> list1,List<T> list2){
       List<T> list = new ArrayList<T>(list1);
       for (T x:list2){
           list.add(x);

       }
       return list;
    }
    public static void main(String[] args) {
        List<Integer > list1 = List.of(11,3,43,24,6,0);
        List<Integer> list2 = List.of(8,4,45,23,6,76,100);
        List<Integer> result = mad(list1,list2);
        Collections.sort(result);
        System.out.println(result);

    }
}
