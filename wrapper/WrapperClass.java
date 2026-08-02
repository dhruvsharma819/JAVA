// 1.Create a program to convert student marks from String format to Integer and calculate total marks. 

public class WrapperClass {
    public static void main(String[] args) {

        
        String mark1 = "8";
        String mark2 = "9";
        String mark3 = "10";

       
        int m1 = Integer.parseInt(mark1);
        int m2 = Integer.parseInt(mark2);
        int m3 = Integer.parseInt(mark3);

       
        int total = m1 + m2 + m3 ;

       
        System.out.println("Marks:");
        System.out.println("Subject 1: " + m1);
        System.out.println("Subject 2: " + m2);
        System.out.println("Subject 3: " + m3);
        System.out.println("Total Marks = " + total);
    }
}