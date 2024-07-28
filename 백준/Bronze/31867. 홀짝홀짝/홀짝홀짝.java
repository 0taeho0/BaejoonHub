import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int [] arr = new int[scan.nextInt()];
        String N = scan.next();
        int A = 0;
        int B = 0;
        
        for(int i=0; i<arr.length; i++) {
        	arr[i] = Integer.parseInt(N.substring(i, i+1));
        }
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]%2 == 0) A++;
        	else B++;
        }
        
        if(A>B) System.out.println(0);
        else if(B>A) System.out.println(1);
        else System.out.println(-1);
	}
}
