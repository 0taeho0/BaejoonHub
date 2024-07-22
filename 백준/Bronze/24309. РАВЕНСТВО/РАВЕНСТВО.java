import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       BigInteger A = new BigInteger(scan.nextLine());
       BigInteger B = new BigInteger(scan.nextLine());
       BigInteger C = new BigInteger(scan.nextLine());
       
       System.out.println((B.subtract(C)).divide(A));
    } 
}