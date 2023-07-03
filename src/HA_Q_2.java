import java.util.Scanner;

public class HA_Q_2 {
    public static int B_Search(int [] ar , int  lb ,int ub , int key){
        if (lb<=ub){
            int mid = (lb+ub)/2;
            if (ar[mid]==key)
                return mid;
            else if (ar[mid]>key)
                return B_Search(ar ,lb ,mid-1 ,key);
            else
                return B_Search(ar,mid+1 ,ub, key);
        }
        else
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int max = sc.nextInt();
        int []ar = new int[max];
        System.out.println("Enter a sorted array elements: ");
        for (int i =0;i<ar.length-1;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the key to be searched: ");
        int key = sc.nextInt();
        int ans = B_Search(ar ,0 ,ar.length ,key);
        System.out.println("Index of the searched element is :"+ans);
    }
}
