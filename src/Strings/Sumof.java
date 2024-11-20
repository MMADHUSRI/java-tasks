package Strings;
interface Addition{
    void answer(int x, int y);
}

public class Sumof {



    public static void main(String[] args) {
        Addition obj = (int x,int y) -> System.out.println(x+y);
        obj.answer(6,9);
    }
}
