import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();	
        String D = "";
        D += A;
        D += B;
        System.out.println(A+B-C);
        System.out.println(Integer.parseInt(D)-C);
    }
}
