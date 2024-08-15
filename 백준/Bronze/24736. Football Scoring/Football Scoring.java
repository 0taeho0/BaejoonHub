import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[2];
        
        for(int i=0; i<2; i++) {
        	int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            int e = scan.nextInt();
            
            arr[i] = a*6 + b*3 + c*2 + d + e*2;
        }
        System.out.println(arr[0]+" "+arr[1]);
    }
}