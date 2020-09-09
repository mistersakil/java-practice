import calc.*;
import java.util.Scanner;
public class DoCalculation{
	public static void main(String arguments[]){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		Calculation calc = new Calculation();
		System.out.println(Calculation.doSum(a,b));
		System.out.println(calc.doMult(a,b));
	}
}