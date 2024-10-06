import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String A = scan.next();
        String B = "";
        for(int i=A.length() - 1; i>=0; i--) {
        	 B += A.charAt(i);
        }
        System.out.println(B);
    } 
}
