import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	int N = scan.nextInt();
    	int max = 0;
    	for(int i=1; i<N+1; i++) {
    		System.out.print(i+" ");
    		if(i % 6 == 0) System.out.print("Go! ");
    		max = i;
    	}
    	if(max % 6 == 0);
    	else System.out.print("Go!");
    }
}