import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	while(true) {
    		int N = scan.nextInt();
    		int sum = 0;
    		if(N == 0) break;
    		
    		for(int i=1; i < N+1; i++) {
    			sum += i;
    		}
    		System.out.println(sum);
    	}
    }
}
