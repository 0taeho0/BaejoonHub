import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	int N = scan.nextInt();
    	sb.append("Gnomes:\n");
    	
    	for(int i=0; i<N; i++) {
        	int A = scan.nextInt();
        	int B = scan.nextInt();
        	int C = scan.nextInt();
    		
        	if((A<B && B<C) || (A>B && B>C)) sb.append("Ordered\n");
        	else sb.append("Unordered\n");
    	}
    	System.out.println(sb);
    }
}