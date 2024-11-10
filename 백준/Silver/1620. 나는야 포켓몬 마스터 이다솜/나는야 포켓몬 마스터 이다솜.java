import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> poeple = new HashMap<>();
        HashMap<Integer, String> poket = new HashMap<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        for(int i=0; i<N; i++){
            String name = bf.readLine();
            poeple.put(name, i+1);
            poket.put(i+1, name);
        }

        for(int i=0; i<M; i++){
            // name -> 정수
            String name = bf.readLine();
            try {
                Integer.parseInt(name);
                sb.append(poket.get(Integer.parseInt(name))).append("\n");
            }catch (Exception e) {
                // name -> 문자열
                sb.append(poeple.get(name)).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}