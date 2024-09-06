import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		System.out.println(Math.max(A+B, A-B));
		System.out.println(Math.min(A+B, A-B));
	}
}