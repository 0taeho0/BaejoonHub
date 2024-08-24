import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	while(true) {
    		double N = scan.nextDouble();
    		if(N == 0) break;
    		
    		String num = String.format("%.2f", 1+N+(N*N)+(N*N*N)+(N*N*N*N));
    		sb.append(num).append("\n");
    	}
    	System.out.println(sb);
    }
}