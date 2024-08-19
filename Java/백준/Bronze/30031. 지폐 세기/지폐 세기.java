import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		 
		int sum = 0;
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			if(A == 136) sum += 1000;
			else if(A == 142) sum += 5000;
			else if(A == 148) sum += 10000;
			else if(A == 154) sum += 50000;
		}
		System.out.println(sum);
	}
}