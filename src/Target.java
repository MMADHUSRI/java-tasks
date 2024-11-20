import java.util.List;

public class Target {
    public static <T>  int target(List<T> list,T input){
        for (int i =0;i< list.size();i++){
            if(list.get(i)==input){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<String> tar=List.of("m","g","h","k");
        String targeted = "i";
        int result = target(tar,targeted);
        List<Integer> var = List.of(7,0,6,4,3);
        int dargeted= 4;
        int madd= target(var,dargeted);
        System.out.println(result);
        System.out.println(madd);
    }
}
