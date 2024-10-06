import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	while(true) {
    		int A = scan.nextInt();
    		int B = scan.nextInt();
    		
    		if(0==B || A==0) {
    			break;
    		}
    		if(A > B) {
    			System.out.println("Yes");
    		}else {
    			System.out.println("No");
    		}
    	}
    }
}
