import java.util.Scanner;

public class Prog_7 {
    public static int factorial(int n){
        if (n==1)
            return 1;
        return (n*factorial(n-1));
    }
    public static int power(int p ,int q){
        if (q==0)
            return 1;
        int pow = power(p , q/2);
        if (q%2 ==0)
            return pow*pow;
        return p*pow*pow;
    }
    public static int GCD(int x , int y){
        if (y==0)
            return x;
        return GCD(y,x%y);
    }
    public static String Binary_Equivalent(int n , String sum){
        if (n==0)
            return sum;
        return Binary_Equivalent((n/2 ),( n%2+sum));

    }
    public static int product(int a , int b ){
        if (b==1)
            return a;
        return a+product(a,--b);
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        int ans = factorial(n);
//        System.out.println("factorial of the given number "+n +" is: "+ans);

//        System.out.println("Enter p: ");
//        int p =sc.nextInt();
//        System.out.println("Enter q: ");
//        int q =sc.nextInt();
//        int ans = power(p ,q);
//        System.out.println("Power of "+p+","+q+" is "+ans);

//        System.out.println("Enter x: ");
//        int x =sc.nextInt();
//        System.out.println("Enter y: ");
//        int y =sc.nextInt();
//        int ans = GCD(x ,y);
//        System.out.println("GCD of "+x+","+y+" is "+ans);

//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        String ans = Binary_Equivalent(11 ,"");
//        System.out.println(ans);

//        System.out.println("Enter p:  ");
//        int p =sc.nextInt();
//        System.out.println("Enter q: ");
//        int q = sc.nextInt();
//        int ans = product(p,q);
//        System.out.println("Product of "+p+","+q+" is "+ans);
    }
}
