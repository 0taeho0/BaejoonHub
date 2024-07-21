import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	String A = scan.next();
    	String B = scan.next();
    	
    	if(A.length() >= B.length()) {
    		System.out.println("go");
    	} else {
    		System.out.println("no");
    	}
    }
}
