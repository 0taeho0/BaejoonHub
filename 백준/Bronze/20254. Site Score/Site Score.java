import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int A = scan.nextInt();
    	int B = scan.nextInt();
    	int C = scan.nextInt();
    	int D = scan.nextInt();
    	
    	int sum = A*56 + 24*B + 14*C + 6*D;
    	System.out.println(sum);
    	
    }
}