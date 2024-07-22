import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        scan.nextLine();
        for(int i=0; i<a; i++) {
        	String A = scan.nextLine();
        	System.out.println((i+1)+". "+A);
        }
    }
}