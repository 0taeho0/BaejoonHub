import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int A = scan.nextInt();
       int B = scan.nextInt();
       int C = scan.nextInt();
       int D = scan.nextInt();
       int E = scan.nextInt();
       
       System.out.println((Math.min(Math.min(A, B), C) + Math.min(D, E))-50);
    } 
}