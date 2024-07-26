import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int A = scan.nextInt();
       int B = scan.nextInt();
       System.out.println(Math.round(Math.min(A, B) / 2.0 * 100));
    } 
}