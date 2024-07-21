import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	String A = scan.next();
    	
    	if(A.equals("SONGDO")) {
    		System.out.println("HIGHSCHOOL");
    	}else if(A.equals("CODE")) {
    		System.out.println("MASTER");
    	}else if(A.equals("2023")) {
    		System.out.println("0611");
    	}else {
    		System.out.println("CONTEST");
    	}
    }
}
