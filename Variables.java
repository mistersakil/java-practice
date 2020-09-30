class Variables{
	int instanceVar;
	static int staticVar;
	private String name;
	public Variables(String name){
		
	}
	public void callAge(){
		int age = 10;
		instanceVar = 10;
		int myAge = age + instanceVar;
		System.out.println(myAge);

	}
	public static void main(String ar[]){
		Variables obj = new Variables();		
		obj.callAge();
		staticVar = 99;
		System.out.println(staticVar);
		System.out.println(obj.name);

	}
}