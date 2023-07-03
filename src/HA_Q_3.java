import java.util.Scanner;

public class HA_Q_3 {
    public static String Reverse(String s , String str, int n){
        if (n==0)
            return str;
        return Reverse(s,str+s.charAt(n-1),--n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str =sc.next();
        String ans = Reverse(str , "" ,str.length());
        if (str.equals(ans))
            System.out.println("The string is palindrome");
        else
        System.out.println("The string is not palindrome");
    }
}
