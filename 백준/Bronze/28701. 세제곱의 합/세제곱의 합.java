import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int t = 0;
		for(int i = 1; i <= n; i++) {
			t += i;
		}
		System.out.println(t);
		System.out.println(t * t);
		
		t = 0;
		for(int i = 1; i <= n; i++) {
			t += i * i * i;
		}
		System.out.println(t);
	}
}