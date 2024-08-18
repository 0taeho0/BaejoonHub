import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	String A = scan.next();
    	int bool = 0;
    	int B = Integer.parseInt(A);
    	int temp = B;
    	
    	while(temp > 0) {
    		if(temp % 10 == 7) bool = 1;
    		temp /= 10;
    	}
    	
    	if(bool == 1) {
    		if(B % 7 == 0) System.out.println(3);
    		else System.out.println(2);
    	}else {
    		if(B % 7 == 0) System.out.println(1);
    		else System.out.println(0);
    	}
    }
}