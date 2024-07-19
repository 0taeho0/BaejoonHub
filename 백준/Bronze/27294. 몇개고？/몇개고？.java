import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int T = scan.nextInt();
    	int S = scan.nextInt();
    	
    	if(T >= 12 && T <= 16 && S == 0) {
    		System.out.println(320);
    	}else {
    		System.out.println(280);
    	}
    }
}