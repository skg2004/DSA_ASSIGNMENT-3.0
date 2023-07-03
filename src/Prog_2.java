import java.util.Scanner;

public class Prog_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] ar  = {"Green","Red","Blue","Yellow"};
        System.out.println("Enter another color");
        String color= sc.next();
        try{
            int res = Integer.parseInt(color);
            throw new NumberFormatException("For input string "+color);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
      try{
          ar[5]=color;
          throw new ArrayIndexOutOfBoundsException();
      }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e);
       }
        finally {
          System.out.println("The color's entered are: ");
          for (int i =0;i< ar.length;i++){
              System.out.println(ar[i]+" ");
          }
      }
    }
}
