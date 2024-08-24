import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	while(true) {
    		double n = scan.nextDouble();
    		if(n == -1) break;
    		
    		System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n"
    				,n, n*0.167);
    	}
    }
}