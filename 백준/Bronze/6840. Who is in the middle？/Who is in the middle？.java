import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int A = scan.nextInt();
    	int B = scan.nextInt();
    	int C = scan.nextInt();
    	
    	int sum = A + B + C;
    	
    	System.out.println((sum - Math.min(Math.min(A, B), C))- Math.max(Math.max(A, B), C));
    }
}
