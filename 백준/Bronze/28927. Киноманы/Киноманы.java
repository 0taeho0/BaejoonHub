import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N1 = scan.nextInt();
        int N2 = scan.nextInt();
        int N3 = scan.nextInt();
        int t1 = scan.nextInt();
        int t2 = scan.nextInt();
        int t3 = scan.nextInt();
        
        if((N1*3+N2*20+N3*120) < (t1*3+t2*20+t3*120))
        	System.out.println("Mel");
        else if((N1*3+N2*20+N3*120) > (t1*3+t2*20+t3*120))
        	System.out.println("Max");
        else System.out.println("Draw");
    }
}