/**
@Author: Stack Learner
@Topic: Static Import
*/
class Person{
	String name = "sakil";
	int id;
	public void userId(int id){
		// id = 1;
		this.id = id;
		System.out.println(name + " "+ this.id);
	}
}
public class PassByValue{

	public static void main(String arg[]){
		Person obj = new Person();
		System.out.println(obj.id);
		obj.userId(10);
		System.out.println(obj.id);

	}
}

