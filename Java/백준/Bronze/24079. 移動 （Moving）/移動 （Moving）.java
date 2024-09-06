import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(bf.readLine());
		int B = Integer.parseInt(bf.readLine());
		int C = Integer.parseInt(bf.readLine());
		
		if(A*60+B*60 <= C*60+30) System.out.println(1);
		else System.out.println(0);
	}
}