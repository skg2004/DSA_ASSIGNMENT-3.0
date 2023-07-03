import java.util.Scanner;

public class Prog_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lucky number: ");
        int n = sc.nextInt();
            try {
                if (n>0){
                    System.out.println("My lucky number is: "+n);
                }
                else
                    throw new NumberFormatException("Negative Number");
            }
            catch (NumberFormatException e) {
                System.out.println(e);
            }
    }
}