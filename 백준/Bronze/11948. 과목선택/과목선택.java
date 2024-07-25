import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int A = scan.nextInt();
       int B = scan.nextInt();
       int C = scan.nextInt();
       int D = scan.nextInt();
       int E = scan.nextInt();
       int F = scan.nextInt();
    
       System.out.println(((A+B+C+D)-Math.min(Math.min(Math.min(A, B), C), D)
    		   +Math.max(E, F)));
    } 
}