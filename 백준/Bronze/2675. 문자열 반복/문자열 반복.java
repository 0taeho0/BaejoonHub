import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        for(int i=0; i<N; i++) {
        	int n = scan.nextInt();
        	String name = scan.next();
        	for (int j=0; j<name.length(); j++) {
                for (int k=0; k<n; k++) {
                    System.out.print(name.charAt(j));
                }
            }
        	System.out.println();
        }
    }
}