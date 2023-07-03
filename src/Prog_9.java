import java.util.Scanner;

public class Prog_9 {
    public static int nth_fibonacci(int n){
        if (n==0 || n==1)
            return n;
        return nth_fibonacci(n-1)+nth_fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth number of the series: ");
        int n = sc.nextInt();
        System.out.println("nth fibonacci number is "+nth_fibonacci(n));
    }
}
