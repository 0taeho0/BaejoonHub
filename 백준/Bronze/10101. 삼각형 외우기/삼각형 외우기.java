import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int A = scan.nextInt();
       int B = scan.nextInt();
       int C = scan.nextInt();
       
       if(A+B+C != 180) {
    	   System.out.println("Error");
       }else if((A==60)&&(C==60)&&(B==60)) {
    	   System.out.println("Equilateral");
       }else if((A+B+C == 180)&&(A!=B)&&(A!=C)&&(B!=C)){
    	   System.out.println("Scalene");
       }else if((A+B+C == 180)&&(A==B)||(A==C)||(B==C)){
    	   System.out.println("Isosceles");
       }
    } 
}