import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	int N = scan.nextInt();
    	for(int i=0; i<N; i++) {
    		int A = scan.nextInt();
    		int B = scan.nextInt();
    		
    		System.out.println(A*B/2);
    	}
    }
}
