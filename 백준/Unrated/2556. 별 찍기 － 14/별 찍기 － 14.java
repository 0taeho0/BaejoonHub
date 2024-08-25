import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	int A = scan.nextInt();
    	
    	for(int i=0; i<A; i++) {
    		for(int j=0; j<A; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
	}
}
