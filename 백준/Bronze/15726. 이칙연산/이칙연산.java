import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        
        double result1 = (A*B)/C;
        double result2 = (A/B)*C;
        
        if(result1 > result2) System.out.println((int)result1); 
        else System.out.println((int)result2);
    }
}
