import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String A = ":fan:";
        
        String B = ":"+scan.next()+":";
    
        System.out.printf("%s%s%s\n", A, A, A);
        System.out.printf("%s%s%s\n", A, B, A);
        System.out.printf("%s%s%s\n", A, A, A);
    }
}
