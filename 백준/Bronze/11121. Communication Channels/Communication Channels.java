import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int N = scan.nextInt();
        for(int i=0; i<N; i++) {
        	String A = scan.next();
        	String B = scan.next();
        	
        	if(A.equals(B)) System.out.println("OK");
        	else System.out.println("ERROR");
        }	
    }
}
