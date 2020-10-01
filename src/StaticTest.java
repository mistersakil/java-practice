public class StaticTest {
    public static int a;
    public int b;
    {
        b++;
        System.out.println("instance block called first");
    }
    static {
        a++;
        System.out.println("static block called first");

    }
    public static void callStatic(){
        a++;
        System.out.println("Called static method");
    }
    public void first(){
        System.out.println("instance method call");
    }
    public static void main(String[] args) {
        StaticTest.callStatic();
        System.out.println(StaticTest.a);
        StaticTest.callStatic();
        System.out.println(StaticTest.a);
//        StaticTest obj = new StaticTest();
//        obj.first();
//        System.out.println(obj.b);

    }
}
