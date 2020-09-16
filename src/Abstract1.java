abstract class Bike{
    int speed = 60;
    int gear = 0;
    void run(){
        System.out.println("Bike running on speed "+this.speed + " km/h");
    }
    public void gearStatus(){
        if (this.gear <= 4) {
            System.out.println("Current gear is " + this.gear);
        } else {
            System.out.println("Gear limit exceed");
        }
        this.gear++;
    }
}
class Honda extends Bike{
    int speed = 100;

}
public class Abstract1 {
    public static void main(String args[]){
        Honda honda = new Honda();
        honda.run();
        honda.gearStatus();
        honda.gearStatus();
        honda.gearStatus();
        honda.gearStatus();
        honda.gearStatus();


    }
}
