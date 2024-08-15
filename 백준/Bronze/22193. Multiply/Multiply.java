import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String A = scan.nextLine();
        BigInteger n = new BigInteger(scan.nextLine());
        BigInteger m = new BigInteger(scan.nextLine());
        
        System.out.println(n.multiply(m));
	}
}