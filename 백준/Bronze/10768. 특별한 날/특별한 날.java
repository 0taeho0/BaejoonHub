import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int A = scan.nextInt();
       int B = scan.nextInt();
       
       if(A==2 && B==18) System.out.println("Special");
       else if(A < 2) {
    	   System.out.println("Before");
       }else if(A > 2){
    	   System.out.println("After");
       }else {
    	   if(B < 18) {
    		   System.out.println("Before");
    	   }else if(B > 18) {
    		   System.out.println("After");
    	   }
       }
    } 
}