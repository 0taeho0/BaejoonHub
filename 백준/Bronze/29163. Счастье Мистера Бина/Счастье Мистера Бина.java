import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int N = scan.nextInt();
    	int even = 0;
    	int odd = 0;
    	
    	for(int i=0; i<N; i++) {
    		int A = scan.nextInt();
    		if(A % 2 == 0) even++;
    		else odd++;
    	}
    	if(even > odd) System.out.println("Happy");
    	else System.out.println("Sad");
    }
}
