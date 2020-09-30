public class SortThreeNumbers{
	public void swap(int a, int b){
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
	public static void main(String arguments[]){
		SortThreeNumbers obj = new SortThreeNumbers();
		int a = Integer.parseInt(arguments[0]);
		int b = Integer.parseInt(arguments[1]);
		int c = Integer.parseInt(arguments[2]);				
		// 2 3 1
		if(a<b) obj.swap(a,b);
		System.out.println(a +" "+ b+" "+ c);
				
	}
}