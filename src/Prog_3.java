import java.util.Scanner;
class MarkOutOfBoundException extends Exception{
    MarkOutOfBoundException (String s){
        super(s);
    }
}
class student {
    double mark;
    String name;
    student(double mark,String name){
        this.name=name;
        this.mark=mark;
    }
}
public class Prog_3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter mark: ");
        double mark = sc.nextDouble();
        new student(mark,name);
        try{
            if (mark<100){
                System.out.println(name+" has got "+mark);
            }
            else {
                throw new MarkOutOfBoundException("Mark can't be greater than 100");
            }
        }
        catch (MarkOutOfBoundException e){
            System.out.println(e);
        }
    }
}