public class StringTest {
    String a = "first";
    String c = new String("cat");
    String d = new String("cat");

    void changeA(StringTest myObj){
        myObj.a = "changed";
    }

    public static void main(String[] args) {
        StringTest obj = new StringTest();
        obj.changeA(obj);
//        System.out.println(obj.a);
//        System.out.println(obj.b);
//        System.out.println(obj.a == obj.b);
//        System.out.println(obj.c == obj.d);
//        System.out.println(obj.c.contains(obj.d));

        String e = "egg";
//        e = "abc";
        String g = "egg";
        e = "double egg";
//        e = e.concat(" eagle");
        System.out.println(e);
//        System.out.println(g);

    }
}
