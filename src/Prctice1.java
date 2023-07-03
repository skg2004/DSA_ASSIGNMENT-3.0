import java.util.Scanner;
class MarkOutOfBound extends Exception{
    int nm;                                                     //user-defined-Exception using toString() method
    MarkOutOfBound(int nm){
        this.nm=nm;
    }
    public String toString(){
        return "Mark above 100 is not possible";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark ");
        int mark = sc.nextInt();
        try {
            if (mark < 100)
                System.out.println("Your mark is " + mark);
            else
               throw (new MarkOutOfBound(mark));
        }
        catch (MarkOutOfBound e){
            System.out.println(e);
        }
    }
}