import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	int A = scan.nextInt();
    	int B = scan.nextInt();
    	
    	int result = B - A;
    	if(result <= 0) System.out.println("Congratulations, you are within the speed limit!");
    	else if(result <= 20) System.out.println("You are speeding and your fine is $100.");
    	else if(result <= 30) System.out.println("You are speeding and your fine is $270.");
    	else System.out.println("You are speeding and your fine is $500.");
	}
}
