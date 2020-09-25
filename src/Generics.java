class MyObject{
    int id;
    public <GM> void setId(GM id){
        System.out.println(id);
    }
    public int getId(){
        return this.id;
    }
}
class GenericClassTest <GT> {
    GT genericData;
    GenericClassTest (GT data){
        this.genericData = data;
    }
    public GT get(){
        return this.genericData;
    }
    public void view(){
        System.out.println(this.genericData);
    }
}
public class Generics {
    public static void main(String[] args) {
        GenericClassTest <Integer> obj1 = new GenericClassTest<Integer>(11);
        System.out.println(obj1.get());

//        MyObject ob = new MyObject();
//        String newId = "10";
//        int int1 = 11;
//        Integer int2 = 12;
//        ob.setId(newId);
//        ob.setId(int1);
//        ob.setId(int2);
//        System.out.println(ob.getId());
    }
}
