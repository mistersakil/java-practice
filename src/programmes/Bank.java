package programmes;
import java.util.Scanner;
public class Bank {
    private String name;
    private String gender;
    private long nid;
    private String address;
    private long accountNumber;
    private int atmPin;
    private double openingBalance;
    private double balance;

    public void setBalance(double balance){
        System.out.println(balance +" tk credited to your account "+ this.accountNumber);
    }
    /**
     * To create new account.
     * Call createAccount() method.
     * @return void
     * @author Sakil Jomadder
     * @since 2020-09-30
     */
    public void createAccount(String name,String gender,long nid,String address){
        this.name = name;
        this.gender = gender;
        this.nid = nid;
        this.address = address;
        long accountNumber = (long) (Math.random() * 9999 + 1 );
        int atmPin = (int) (Math.random() * 9999 + 1 );
        this.accountNumber = accountNumber;
        this.atmPin = atmPin;
        this.openingBalance = 500.0d;
        System.out.println("Congratulations! Your account has been created successfully. ");
        System.out.println("Account No: "+accountNumber);
        System.out.println("PIN No: "+atmPin);

    }

    public void viewAccountInfo(){
        System.out.println("Name: "+name + "\nGender: " + gender + "\nNID: "+ nid+ "\nAddress: "+address+"\nAccount Number: "+accountNumber+ "\nATM Pin: "+atmPin+"\nOpening Balance: "+openingBalance+"\nMain Balance:" +balance);
    }
    /**
     * Welcome message from the "Dhaka Online Bank"
     * @return void
     * @author Sakil Jomadder
     * @since 2020-09-30
     */
    public static void welcome(){
        System.out.println("Welcome to \"Dhaka Online Bank\"");
        System.out.println("1. Create a new bank account");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("0. Exit");
        System.out.println("N.B: Press desired number to start ");

    }
}
