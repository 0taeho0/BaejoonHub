import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
// Scanner을 사용해가 간단해서 BufferReader는 선언하고 안사용함
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int Aon = 1;
		int Bon = 1;
		int temp = 0;
		
		for(int i=0; i<N; i++) {
			Aon += A; Bon += B;
			if(Aon < Bon) {
				temp = Aon;
				Aon = Bon;
				Bon = temp;
			}else if(Aon == Bon) Bon -= 1;
		}
		System.out.println(Aon+" "+Bon);
	}

}
