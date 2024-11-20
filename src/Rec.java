public class Rec {
    static int per(int width, int height) {


        int perimeter = 2 * (width + height);
        return perimeter;


    }
    static int par(int width,int height){
        int Area = width*height;
        return Area;
    }


    public static void main(String[] args) {
        Rec rec = new Rec();
        int Area=par(6,7);
        int perimeter=per(6,7);
        System.out.println(Area);
        System.out.println(perimeter);
    }
}

