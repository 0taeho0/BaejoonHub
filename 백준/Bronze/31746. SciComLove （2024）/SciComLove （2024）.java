import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String name = "SciComLove";
        int N = scan.nextInt();
        
        if(N%2 == 0) {
        	System.out.println(name);
        }else {
        	for(int i=0; i<1; i++) {
                String n = "";
            	for(int j=name.length(); j>0; j--) {
            		n += name.substring(j-1, j);
            	}
            	name = n;
            }
            System.out.println(name);	
        }
        
	}
}
