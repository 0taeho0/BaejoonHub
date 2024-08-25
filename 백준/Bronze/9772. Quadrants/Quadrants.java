import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	
    	while(true) {
    		double A = scan.nextDouble();
    		double B = scan.nextDouble();
    		
    		
    		if(A == 0 && B == 0) break;
    		
    		if(A==0 || B==0) System.out.println("AXIS"); 
    		else if(A > 0) 
    			if(B > 0) System.out.println("Q1");
    			else System.out.println("Q4");
    		else if(A < 0)
    			if(B > 0) System.out.println("Q2");
    			else System.out.println("Q3");
    	}
    	System.out.println("AXIS");
    }
}
