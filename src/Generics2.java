interface Pair<K,V>{
    public <K> void  getkey();
    public <V> void getValue();
}

class MyPerson <K,V>{
    private K key;
    private V value;
    MyPerson(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return this.key;
    }
    public V getValue(){
        return this.value;
    }


}

public class Generics2 {
    public static void main(String[] args) {
        MyPerson <String, String> pair1 = new MyPerson<>("name","sakil");
        MyPerson <String, Integer> pair2 = new MyPerson<>("id",11);
        System.out.println(pair1.getKey() + " => " + pair1.getValue());
        System.out.println(pair2.getKey() + " => " + pair2.getValue());
    }
}
