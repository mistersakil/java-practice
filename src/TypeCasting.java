public class TypeCasting {
    private static double number = 999999.555d;
    private static byte numberNarrow = 10;
    public static void widening(){
        float f = (float) number;
        int i = (int) number;
        short s = (short) number;
        byte b = (byte) number;
        System.out.println("Explicit Casting");
        System.out.println("Double = "+number);
        System.out.println("Float = "+f);
        System.out.println("Integer = "+i);
        System.out.println("Short = "+s);
        System.out.println("Byte = "+b);
    }
    public static void narrowing(){
        double d = numberNarrow;
        float f = numberNarrow;
        int i = numberNarrow;
        short s =  numberNarrow;
        System.out.println("Implicit Casting");
        System.out.println("Byte = "+numberNarrow);
        System.out.println("Short = "+s);
        System.out.println("Integer = "+i);
        System.out.println("Float = "+ f);
        System.out.println("Double = "+d);
    }

    public static void main(String[] args) {
        widening();
        narrowing();
    }
}
