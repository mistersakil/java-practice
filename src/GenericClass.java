class MyObject{
    int id;
    public <GM> void setId(GM id){
        System.out.println(id);
    }
    public int getId(){
        return this.id;
    }
}
public class GenericClass {
    public static void main(String[] args) {
        MyObject ob = new MyObject();
        String newId = "10";
        int int1 = 11;
        Integer int2 = 12;
        ob.setId(newId);
        ob.setId(int1);
        ob.setId(int2);
        System.out.println(ob.getId());
    }
}
