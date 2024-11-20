public class Empty {
    public static void main(String[] args) {
        interface Stringcheck {
            boolean isempty(String input);
        }
        Stringcheck stringcheck = input -> input==null||input.isEmpty();



            String input1 = "";
            String input2 = "madhu";
        System.out.println(stringcheck.isempty(input1));
        System.out.println(stringcheck.isempty(input2));

    }
}
