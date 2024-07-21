import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(true) {
        	int A = scan.nextInt();
        	int B = scan.nextInt();
        	
        	if((A == 0) && (A == 0)){
        		break;
        	}
        	if(A % B == 0) {
        		System.out.println("multiple");
        	}else if(B % A == 0) {
        		System.out.println("factor");
        	}else {
        		System.out.println("neither");
        	}
        }
        scan.close();
    } 
}
