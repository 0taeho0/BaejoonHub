import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String name = "SciComLove";
        int N = scan.nextInt();
        
        for(int i=0; i<N; i++) {
            String n = "";
        	for(int j=name.length(); j>0; j--) {
        		n += name.substring(j-1, j);
        	}
        	name = n;
        }
        System.out.println(name);
	}
}
