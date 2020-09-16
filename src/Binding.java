public class Binding {
    void view(){
        System.out.println("Static Binding");
    }
    void show(){
        System.out.println("Static show method");
    }
}
class BindingChild extends Binding{
    void view(){
        System.out.println("Dynamic view method");
    }
    void prints(){
        System.out.println("Dynamic Print method");

    }

    public static void main(String args[]){
        BindingChild b1 = new BindingChild();
        Binding b2 = new BindingChild();
        b1.prints();
        b2.show();
//        b1.view();
//        b1.show();
//        b2.view();
//        b2.show();
//
//        System.out.println(b1 instanceof BindingChild);
//        System.out.println(b1 instanceof Binding);
//        System.out.println(b2 instanceof BindingChild);
//        System.out.println(b2 instanceof Binding);
    }
}
