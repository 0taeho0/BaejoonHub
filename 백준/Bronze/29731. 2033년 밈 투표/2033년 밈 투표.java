import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	String [] arr = {"Never gonna give you up",
    					"Never gonna stop",
    					"Never gonna tell a lie and hurt you",
    					"Never gonna say goodbye",
    					"Never gonna make you cry",
    					"Never gonna run around and desert you",
    					"Never gonna let you down"};
    	int count = 0;
    	int N = scan.nextInt();
    	
    	for(int i=0; i<N+1; i++) {
    		String name = scan.nextLine();
    		for(int j=0; j<arr.length; j++) {
    			if(name.equals(arr[j])) count++;
    		}
    	}
    	if(N == count) System.out.println("No");
    	else System.out.println("Yes");
    }
}
