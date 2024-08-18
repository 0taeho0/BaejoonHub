import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long N = scan.nextInt();
        long sum = 1;
        
        for(int i=1; i<N+1; i++) {
        	sum *= i;
        }
        if(N==0) System.out.println(1);
        else System.out.println(sum);
    }
}
