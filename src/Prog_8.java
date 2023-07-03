import java.util.Scanner;

public class Prog_8 {
    public static int Reverse(int n , int sum){
        if (n==0)
            return sum;
        return Reverse(n/10 , sum*10+n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Reverse of the number "+n+" is: "+Reverse(n,0));
    }
}
