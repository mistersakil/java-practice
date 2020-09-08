public class Hello{
	public static void main(String[] args){
		System.out.println("Hello java how are you today? ");
		// int x = Integer.parseInt(args[0]);
		// int y = Integer.parseInt(args[1]);

		int sum = 0;
		for(int i = 0; i < args.length; i++){
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("The sum of two numbers = "+ sum);

	}
}