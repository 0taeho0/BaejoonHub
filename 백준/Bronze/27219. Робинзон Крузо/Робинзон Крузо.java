import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int A = scan.nextInt();
    	
    	for(int i=0; i<A/5; i++) System.out.print("V");
    	
    	for(int i=0; i<A%5; i++) System.out.print("I");
    }
}