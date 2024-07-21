import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            if (n == -1) {
                break;
            }
            
            int[] arr = new int[n];
            int num = 0;
            int sum = 0;
            
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    arr[num++] = i;
                    sum += i;
                }
            }
            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < num; i++) {
                    System.out.print(arr[i]);
                    if (i < num - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }

        scan.close();
    }
}
