import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = "LoveisKoreaUniversity";

        int num = Integer.parseInt(br.readLine());
        if(num == 1) System.out.println(N);
        else{
            for(int i = 1; i <= num; i++){
                System.out.print(N);
                System.out.print(" ");
            }
        }
    }
}
