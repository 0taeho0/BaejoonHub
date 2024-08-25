import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	
    	int A = scan.nextInt();
    	int B = scan.nextInt();
    	int C = scan.nextInt();
    	
    	int start_m = 11 * 60 + 11 + 11 * 1440;
    	int result = A * 60 * 24 + B * 60 + C - start_m;
    	
    	System.out.println((result >= 0) ? result : -1);
    }
}
