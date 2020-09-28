public class CallByValue {
    int a = 100;
    public void setA (int a){
        this.a = a;
    }
    public void setAA(int a){
        a = a + 200;
        System.out.println(a);
    }

    public static void main(String[] args) {
        CallByValue obj = new CallByValue();
        System.out.println(obj.a);
//        obj.setA(10);
        obj.setAA(10);
        System.out.println(obj.a);
    }
}
