import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		 
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		if(B/2 + C <= A) System.out.println(B/2 + C);
		else System.out.println(A);
	}
}