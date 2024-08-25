import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	int N = scan.nextInt();
    	for(int i=0; i<N;i++) {
    		sb.append("Hello World, Judge "+(i+1)+"!\n");
    	}
    	System.out.println(sb);
    }
}
