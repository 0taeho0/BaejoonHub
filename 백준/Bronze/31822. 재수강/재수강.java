import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String A = scan.next();
        String [] arr = new String[scan.nextInt()];
        
        for(int i=0; i<arr.length; i++) arr[i] = scan.next();
        
        int count = 0;
        for(int i=0; i<arr.length; i++) {
        	if(A.substring(0, 5).equals(arr[i].substring(0, 5))) {
        		count++;
        	}
        }
        System.out.println(count);
	}
}
