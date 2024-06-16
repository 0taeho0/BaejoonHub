import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i=1; i<N+1; i++) {		 
			for(int j=1; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}