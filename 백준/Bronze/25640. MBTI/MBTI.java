import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class  Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        int num = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<num; i++){
            String N = br.readLine();
            if(A.equals(N)) count++;
        }
        System.out.println(count);
    }
}