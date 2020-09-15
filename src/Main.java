import p2.Employee;
import p2.Address;
public class Main {
    public static void main(String[] args) {
        Address add1 = new Address("Bangladesh", "Dhaka");
        Employee emp1 = new Employee("sakil","sakil@gmail.com",add1);
        Employee emp2 = new Employee("Rasel","rasel@gmail.com",add1);
        emp1.details();
        emp2.details();
    }
}
