import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);

    	for(int i = 0; i < 3; i++) {
    		int H1 = scan.nextInt();
    		int M1 = scan.nextInt();
    		int S1 = scan.nextInt();
    		int H2 = scan.nextInt();
    		int M2 = scan.nextInt();
    		int S2 = scan.nextInt();
    		
    		int st = H1 * 3600 + M1 * 60 + S1;
    		int ed = H2 * 3600 + M2 * 60 + S2;
    		
    		int result = ed - st;
    		
    		if (result < 0) result += 24 * 3600;

    		int H = result / 3600;
    		result %= 3600;
    		int M = result / 60;
    		int S = result % 60;
    		
    		System.out.printf("%d %d %d\n", H, M, S);
    	}
    }
}
