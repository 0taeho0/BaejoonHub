import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int N = scan.nextInt();
        for(int i=0; i<N; i++) {
        	int num = scan.nextInt();
        	
        	if(Math.abs(num)%2==0) System.out.println(num+" is even");
        	else System.out.println(num+" is odd");
        }
    }
}
