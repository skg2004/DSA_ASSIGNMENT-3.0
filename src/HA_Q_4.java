import java.util.Scanner;

public class HA_Q_4 {
    public static void sort(int[]ar){
        for (int i =0;i< ar.length;i++){
            for (int j =i+1 ;j< ar.length;j++){
                if (ar[i]>ar[j]){
                    int temp =ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }
    public static int Binary_Search(int []ar , int lb ,int up ,int key){
        if (lb<=up){
            int mid = (lb+up)/2;
            if (ar[mid]==key){
                return mid;
            }
            else if (ar[mid]>key){
                return (Binary_Search(ar,lb,mid-1,key));
            }
            else
                return (Binary_Search(ar,mid+1,up,key));
        }
        else
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []ar = {15,1,18,16,24,36};
        sort(ar);
        for (int i =0;i< ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the key to be searched in the array: ");
        int key = sc.nextInt();
        int ans =Binary_Search(ar,0, ar.length,key);
        System.out.println("Index of the searched element is "+ans);
    }
}
