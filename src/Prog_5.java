import java.util.Scanner;

public class Prog_5 {
    public static <T> int count(T[]ar ,T item){
        int count =0;
        for (T ele : ar){
            if (ele.equals(item))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Integer [] ar = {1,2,3,2,1,2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key");
        int key = sc.nextInt();
        int ans =count(ar,key);
        System.out.println("Occurrence of "+key+" is "+ans);
    }
}
