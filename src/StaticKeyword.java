class MyStatic{
    static String staticVar;
    String name = "i'm instance variable";
    static{
        staticVar = "i'm static variable";
        System.out.println(MyStatic.staticVar);
    }
    public MyStatic(){
        System.out.println("Constructor called after static calls");
        System.out.println(this.name);
    }
}
public class StaticKeyword {
    public static void main(String[] args){
        MyStatic obj = new MyStatic();

    }
}
