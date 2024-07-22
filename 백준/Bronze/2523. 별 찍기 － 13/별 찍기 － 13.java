import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int A = scan.nextInt();
       
       for(int i=1; i<A+1; i++) {
    	   for(int j=0; j<i; j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       for(int i=1; i<A; i++) {
    	   for(int j=A; j>=i+1; j--) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
    } 
}