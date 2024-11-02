import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 
		 int num = Integer.parseInt(bf.readLine());
	
		 int N = num * 2 -1;
		 
		 for(int i=0; i<num; i++) {
			 System.out.print(" ".repeat(i));
			 System.out.println("*".repeat(N-2*i));
		 }
		 
		 for (int i = 1; i < num; i++) { 
	            System.out.print(" ".repeat(num - i - 1)); 
	            System.out.println("*".repeat(2 * i + 1));
		 }
	}
}
