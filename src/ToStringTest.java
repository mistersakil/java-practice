public class ToStringTest {
    int id;
    String name;
    String email;
    ToStringTest(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    @Override
    public String toString(){
        return ("summary from toString: "+ id + " " + name+ " " + email);
    }
    public static void main(String[] args) {
        ToStringTest obj = new ToStringTest(11, "sakil", "sakil@mail.com");
        System.out.println(obj
        );
    }
}
