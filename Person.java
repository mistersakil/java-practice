class Main{

	public static void main(String arg[]){
		Person obj = new Person("Mister Sakil", 11.5f);
		Person obj2 = new Person(obj);
		obj.info();
		obj2.info();

	}
}

class Person {
	String name;
	float salary;
	int age;
	String email;

	public Person(String n, float s){
		name = n;
		salary = s;
	}
	public Person(Person obj){
		name = obj.name;
		salary = obj.salary;
	}

	public void info(){		
		System.out.println(name + ' ' +salary);
	}
}