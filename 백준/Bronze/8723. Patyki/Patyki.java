import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	int A = scan.nextInt();
    	int B = scan.nextInt();
    	int C = scan.nextInt();
    
    	if(A*A == (B*B + C*C) || B*B == (A*A + C*C) || C*C == (A*A + B*B))
    		System.out.println(1);
    	else if((A == B) && (B == C)) System.out.println(2);
    	else System.out.println(0);
	}
}
