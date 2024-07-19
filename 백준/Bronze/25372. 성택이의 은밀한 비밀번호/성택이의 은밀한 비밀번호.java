import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		
    		int N = scan.nextInt();
    		
    		String [] arr = new String[N];
    		
    		for(int i=0; i < arr.length; i++) {
    			arr[i] = scan.next();
    			if(arr[i].length() >= 6 && arr[i].length() < 10) {
    				System.out.println("yes");
    			} else {
    				System.out.println("no");
    			}
    		}
    }
}