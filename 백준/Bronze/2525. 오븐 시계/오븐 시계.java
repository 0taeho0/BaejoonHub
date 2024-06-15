import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		int C = scan.nextInt();
//		
//		B = B + C;
//		if(A < 24 && B < 59 && C < 1001) {
//			
//		if(B > 60) {
//			A += B / 60;
//			B = B % 60;
//		}
//		if(A > 23) {
//			A -= 24;
//		}
//		System.out.println(A + " " + B);
//		scan.close();
//		
//		}
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();    // 시
        int B = sc.nextInt();    // 분
        int C = sc.nextInt();    // 요리하는데 필요한 시간

        B = A * 60 + B;
        B = B + C;

        A = (B / 60) % 24;       // 시(24시 이상이면 0시부터 시작)
         B %= 60;        // 분

        System.out.println(A + " " + B);
	}
}