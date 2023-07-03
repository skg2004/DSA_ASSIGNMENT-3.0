import java.util.Scanner;

class BalanceException extends Exception{
    BalanceException(String S){
        super(S);
    }
}
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        System.out.println("Enter money to be deposited: ");
        double deposit = sc.nextDouble();
        balance+=deposit;
        System.out.println("Your current balance after deposition is: "+balance);
        System.out.println("Enter money to be withdrawal");
        double withdrawl = sc.nextDouble();
        try {
            if (balance>withdrawl){
                balance-=withdrawl;
                System.out.println("Your net balance is: "+balance);
            }
            else {
                throw new BalanceException("Insufficient balance");
            }
        }
        catch (BalanceException e){
            System.out.println(e);
        }
    }
}
