package p1;

public class Employee {
    String name;
    int employeeId;
    double salary;
    public Employee(String name, int id, double salary){
        this.name = name;
        this.employeeId = id;
        this.salary = salary;
    }
    public String info(){
        return "Name: " + this.name + " Employee Id: " + this.employeeId + " and         salary: " + this.salary;
    }

}
