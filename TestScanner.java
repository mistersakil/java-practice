import java.util.Scanner;
public class TestScanner{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		String strings = scanner.nextLine();
		int sum = num1 + num2;
		System.out.println("Sum of two numbers = " + sum);
		for(int i=0; i<strings.length; i++){
			System.out.println("Given string: ");
		}

	}
}