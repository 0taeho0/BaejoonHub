import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		
    		int N = scan.nextInt();
    		N -= 2;
    		if(N % 7== 0) {
    			System.out.println(1);
    		}else {
    			System.out.println(0);
    		}
    }
}