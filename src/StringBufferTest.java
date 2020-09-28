public class StringBufferTest {
    public static void stringSpeedTest(){
        String a = "abc";
        for(int i=0; i<=99999; i++){
            a = a.concat("def ");
        }
//        System.out.println(a);
    }
    public static void stringBufferSpeedTest(){
        StringBuffer sb = new StringBuffer("jon");
        for(int i=0; i<=99999; i++){
            sb.append(" doe");
        }
//        System.out.println(sb);
    }
    public static void hashCodeCheck(){
        String s = new String("jon");
        System.out.println("s hashcode= "+s.hashCode());
        s = s + " doe";
        System.out.println("s hashcode= "+s.hashCode());
        StringBuffer sb = new StringBuffer("jain");
        System.out.println("s hashcode= "+sb.hashCode());
        sb.append(" doe");
        System.out.println("s hashcode= "+sb.hashCode());
    }

    public  static void consumedTime(){
        String s = new String("jon");
        StringBuffer sb = new StringBuffer("jain");
        StringBuilder sbl = new StringBuilder("john");
        long startTime = System.currentTimeMillis();
        for(int i=0; i<=99999; i++){
            s = s.concat(" doe");
        }
        System.out.println("Time taken by String class= " + (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        for(int i=0; i<=99999; i++){
            sb = sb.append(" doe");
        }
        System.out.println("Time taken by String class= " + (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        for(int i=0; i<=99999; i++){
            sbl = sbl.append(" doe");
        }
        System.out.println("Time taken by String class= " + (System.currentTimeMillis() - startTime) + " ms");
    }

    public static void main(String[] args) {
//        consumedTime();
//        hashCodeCheck();
//        long startTime = System.currentTimeMillis();
//        stringSpeedTest();
//        System.out.println("String concat time=" + (System.currentTimeMillis() - startTime));
//        startTime = System.currentTimeMillis();
//        stringBufferSpeedTest();
//        System.out.println("String Buffer concat time =" + (System.currentTimeMillis() - startTime));
//
//        StringBuffer a = new StringBuffer("java is going to my ");
//        a.append(" favorite programming language now a days.");
//        System.out.println(a.capacity());


    }
}
