package p2;

public class Employee {
    String name;
    String email;
    Address address;

    public Employee(String name, String email, Address address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void details(){
        System.out.println("Name: "+ this.name + ", Email: "+ this.email + ", Country: " + this.address.country);
    }
}
