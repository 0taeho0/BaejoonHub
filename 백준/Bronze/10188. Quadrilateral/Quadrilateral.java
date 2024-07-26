import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int N = scan.nextInt();
        for(int i=0; i<N; i++) {
        	int A = scan.nextInt();
        	int B = scan.nextInt();
        	
        	String [][] arr = new String[B][A];
        	
        	for(int j=0; j<B; j++) {
        		for(int w=0; w<A; w++) {
        			arr[j][w] = "X";
        		}
        	}
        	for(int z=0; z<arr.length; z++) {
        		for(int y=0; y<A; y++) {
        			System.out.print(arr[z][y]);
        		}
        		System.out.println();
        	}
        	System.out.println();
        }
    }
}
