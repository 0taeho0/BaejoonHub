import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int a = 0;
       int b = 0;
       
       for(int i=0; i<8; i++) {
    	   if(i<4) a += scan.nextInt();
    	   else b += scan.nextInt();
       }
       if(a > b) System.out.println(a);
       else if(a < b) System.out.println(b);
       else System.out.println(a);
    } 
}