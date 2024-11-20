class Method {
    static int Staticvar=40;
    int instancevar=20;
    static void staticMethod(){
        System.out.println("static method called : ");
        System.out.println("static variable is : " +Method.Staticvar);
    }
    void instanceMethod(){
        System.out.println("instance method called : ");
        System.out.println("static variable is : " + Staticvar);
        System.out.println("instance variable is : " + instancevar);
    }

    public static void main(String[] args) {
        Method.staticMethod();
        Method method1 = new Method();
        method1.instanceMethod();
    }

}
