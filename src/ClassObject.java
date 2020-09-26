class Point{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Rectangle {
    int x,y;
    Point point;
    Rectangle(Point p, int x, int y){
        this.x = x;
        this.y = y;
        point = p;
        System.out.println(point);
        point.x = x;
        point.y = y;
    }
}

class Parent{
    int a;
//    Parent(int a){
//        this.a = a;
//    }
}

class Child{
    int a;
}
public class ClassObject {
    public static void main(String[] args) {
//        Point point1 = new Point(11,12);
//        Rectangle rect1 = new Rectangle(point1, 10,20);
//        System.out.println(point1.x);
//        System.out.println(point1.y);
        Child c1 = new Child();
        Child c2 = new Child();
        System.out.println(c1);
        System.out.println(c2);
    }
}
