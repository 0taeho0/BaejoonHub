import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	int N = scan.nextInt();
    	for(int i=1; i<N+1;i++) {
    		int max = 0;
    		
    		for(int j=0; j<5; j++) {
    			int n = scan.nextInt();
    			if(n > max) max = n;
    		}
    		System.out.printf("Case #%d: %d\n", i, max);
    	}
    }
}
