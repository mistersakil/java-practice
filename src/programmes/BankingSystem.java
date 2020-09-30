package programmes;
import java.util.Scanner;
public class BankingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank.welcome();
        Bank bank = new Bank();
        // Step 1
        int operationType = scanner.nextInt();
        switch (operationType){
            case 1:
                System.out.println("So, You want to create a bank account.\nPlease fill up " +
                        "following information's");
                System.out.printf("Full Name (Multi Word): ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.printf("Gender (Single Word ): ");
                String gender = scanner.nextLine();
                System.out.printf("NID Number (Number): ");
                long nid = scanner.nextLong();
                scanner.nextLine();
                System.out.printf("Address (Multi Word ): ");
                String address = scanner.nextLine();
                bank.createAccount(name,gender,nid,address);
//                bank.viewAccountInfo();



            case 2:

            default:
                break;


        }

    }
}
