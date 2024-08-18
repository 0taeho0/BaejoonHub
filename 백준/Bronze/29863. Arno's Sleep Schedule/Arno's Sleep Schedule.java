import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);

    	int N1 = scan.nextInt();
    	int N2 = scan.nextInt();
    	
    	System.out.println((N2+24-N1)%24);
    }
}