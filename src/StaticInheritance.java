class Parents{
    public static int a = 11;
    public static void f1(){
        System.out.println("Static method from parent");
    }
}
class Childes extends Parents{
    public static int a = 10;
//    static {
//        a = 12;
//    }
    public static void f1(){
        System.out.println("Static method hiding form child");
    }
}
public class StaticInheritance {
    public static void main(String[] args) {
        System.out.println(Childes.a);
        Childes.f1();
    }
}
