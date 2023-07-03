import java.util.Scanner;

class InvalidBalanceException extends Exception{
    InvalidBalanceException(String s){
        super(s);
    }
}
class Bank{
     String account_no;
     String name;
     double balance;
    public Bank(String account_no , String name ,double balance){
        this.account_no=account_no;
        this.name=name;
        this.balance=balance;
        System.out.println("Account_number is: "+account_no+"\nname is: "+name+"\nbalance is: "+balance);
    }

}
public class HA_Q_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account_Number: ");
        String accn_number =  sc.next();
        sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        try {
            System.out.println("Enter balance: ");
            double balance = sc.nextDouble();
            if (balance<=0)
                throw new  InvalidBalanceException("Balance cannot be less than zero");
            else
                 new Bank(accn_number ,name , balance);
        }
        catch (InvalidBalanceException e ){
            System.out.println("Exception : "+e);
        }

    }
}
