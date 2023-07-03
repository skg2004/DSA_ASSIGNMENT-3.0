public class Prog_4 {
    public static <E> void PrintArray(E[] inputArray){
        for (E ele : inputArray){
            System.out.println(ele+" ");
        }
    }
    public static void main(String[] args) {
        Integer [] ar = {1,2,3,4,5,6};
        Double [] ar1 = {1.2,2.3,3.4,4.5,5.6};
        System.out.println("Integer array is: ");
        PrintArray(ar);
        System.out.println("Double array is: ");
        PrintArray(ar1);
    }
}
