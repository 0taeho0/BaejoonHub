import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double A = 1;
        for(int i=0; i<n; i++) {
        	double B = scan.nextDouble();
        	double C = scan.nextDouble();
        	double D = scan.nextDouble();
        	A = B * C * D;
        	
        	A = Math.round(A * 100) / 100.0;
        	
        	System.out.printf("$%.2f%n", A);
        }
    }
}
