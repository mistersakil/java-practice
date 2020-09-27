import java.util.*;
public class WrapperClass {
    Character c = 'c';
    static void unboxing(List<Integer> list){
        int sum = 0;
        for(Integer item:list){
            sum+=item; //item.intValue() // Unboxing
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for(int i=1; i <= 11; i++){
            arrayList.add(i); // Example of autoboxing
        }
        for(int value:arrayList){
            System.out.println(value);
        }
        unboxing(arrayList);
        // List all System properties
        Properties pros = System.getProperties();
        pros.list(System.out);

    }
}
