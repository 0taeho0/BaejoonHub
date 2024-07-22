import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	String Junior = "Junior";
    	String Senior = "Senior";
    	
    	while(true) {
    		String name = scan.next();
    		int A = scan.nextInt();
       		int B = scan.nextInt();
       		
       		if(name.equals("#")&&A==0&B==0) break;
       		
       		if(A>17 || B>79) {
       			System.out.printf("%s %s\n",name, Senior);
       		} else {
       			System.out.printf("%s %s\n",name, Junior);
       		}
    	}
    
    }
}