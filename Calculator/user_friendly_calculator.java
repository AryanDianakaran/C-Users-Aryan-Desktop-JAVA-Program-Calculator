import java.util.Scanner;
public class user_friendly_calculator
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("==========");
        System.out.println("Calculator");
        System.out.println("==========");
        
        System.out.println("");
        
        System.out.println("Enter First Number");
        System.out.print(">>");
        int fnum = scan.nextInt();
        
        System.out.println("");
        
        System.out.println("Enter Second Number");
        System.out.print(">>");
        int snum = scan.nextInt();
        
        System.out.println("");
        
        System.out.println("Addition: " + (fnum+snum));
        
        System.out.println("");
        
        System.out.println("Subtraction: " + (fnum-snum));
        
        System.out.println("");
        
        System.out.println("Multiplication: " + (fnum*snum));
        
        System.out.println("");
        
        System.out.println("Division: " + (fnum/snum));
        
        System.out.println("");
        
        System.out.println("Remainder: " + (fnum%snum));
    }
}
