import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int A = scan.nextInt();
    	
    	if(A/10 != A%10) {
    		System.out.println(0);
    	}else {
    		System.out.println(1);
    	}
    }
}