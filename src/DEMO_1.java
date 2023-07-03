import java.util.Scanner;
public class DEMO_1 {
    static void vote(int age) throws ArithmeticException
     {
        if (age>=18)
            System.out.println("You are eligible to vote");
        else
           throw new ArithmeticException("AgeoutofBoundException ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of the candidate");
        int age = sc.nextInt();
        try{
            vote(age);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
