public class Initializers {
    private  static int  count;
    public int num;
    Initializers(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Object block initializers 1");
        count++;
        num++;

    }
//    static {
//        System.out.println("Static block initializers");
//        count++;
//    }
    {
        System.out.println("Object block initializers 2");
        count++;
        num++;

    }
    public static void getCount(){
        System.out.println(count);
    }
    public static void main(String[] args) {
        Initializers in = new Initializers();
        Initializers in2 = new Initializers();
        Initializers.getCount();
        Initializers.getCount();
        System.out.println(in.num);
        System.out.println(in2.num);

    }
}
