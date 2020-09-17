public class Test {
    public static void main(String[] args) {
        long sum = 1;
        for(long i = 1; i <= 999999999; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
