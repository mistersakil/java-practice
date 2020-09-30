package cars;
public class Car {
    String name;
    String model;
	public Car(String name, String model){
		this.name = name;
		this.model = model;
	}
    public void setValues(String name, String model){
        this.name = name;
        this.model = model;
    }
    public void getInfo(){
        System.out.println(this.name + " => "+ this.model); 
    }
}
