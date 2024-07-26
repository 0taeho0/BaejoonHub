import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int N = scan.nextInt();
        for(int i=0; i<N; i++) {
        	long A = scan.nextLong();
        	int B = scan.nextInt();
        	int C = scan.nextInt();
        	int D = scan.nextInt();
        	
        	if((B+C+D)>=55 && B>=(35/10.0)*3 &&
        			C>=(25/10.0)*3 &&
        			D>=(40/10.0)*3) System.out.println(A+
        					" "+(B+C+D)+" "+"PASS");
        	else System.out.println(A+" "+(B+C+D)+" FAIL");
        }	
    }
}
