import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        String bar = br.readLine();

        for(int i=0; i<N; i++) {
            String s = bar.substring(i, i+1);
            if(s.equals(s.toUpperCase())) sb.append(s.toLowerCase());
            else sb.append(s.toUpperCase());
        }
        System.out.println(sb.toString());
    }
}