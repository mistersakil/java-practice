public class GenericMethod {
    public static void anyType(String list[]){
        for(String listItem : list){
            System.out.println(listItem);
        }
    }
    public static void anyType2(float list[]){
        for(float item : list){
            System.out.println(item);
        }
    }
    public static <E> void  genericType(E list[]){
        for( E item: list){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        String city[] = {"Dhaka","Barisal","Khulna"};
        Float salary[] = {10f,20f,30f,40f,50.55f};
//        anyType(city);
//        anyType2(salary);
        genericType(city);
        genericType(salary);
    }

}
