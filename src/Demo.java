import java.util.Scanner;

class myexception extends Exception{
    myexception(String s){
        super(s);
    }
}
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age>=18){
                System.out.println("You are eligible to vote");
            }
            else {
                throw new myexception("you are not eligible to vote");
            }
        }
        catch (myexception s){
            System.out.println(s);
        }
    }
}
