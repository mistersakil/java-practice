class parents{
    public parents(){
        this(1);
        System.out.println("Parent constructor: 2");
    }
    public parents(int num2){
        System.out.println("Parent constructor with parameter: "+num2);
    }
}
class childes extends parents{
    public childes(){
        this(3);
        System.out.println("Child constructor without parameter: 4");
    }
    public childes(int num){
        super();
        System.out.println("Parametrized constructor from child: "+num);
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        new childes();

    }
}
