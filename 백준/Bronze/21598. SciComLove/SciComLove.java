import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String name = "SciComLove";
        int N = scan.nextInt();
        
        if(N == 1) {
        	System.out.println(name);
        }else {
        	for(int i=0; i<N; i++) {
        		System.out.println(name);
        	}
        }
	}
}
