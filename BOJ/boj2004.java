import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        System.out.println(Math.min(divide5(N) - (divide5(M) + divide5(N-M)), divide2(N) - (divide2(M) + divide2(N-M))));
    }

    public static int divide5(int n){
        int cnt = 0;
        while(n >= 5){
            cnt += n / 5;
            n /= 5;
        }
        return  cnt;
    }

    public static int divide2(int n){
        int cnt = 0;
        while(n >= 2){
            cnt += n / 2;
            n /= 2;
        }
        return  cnt;
    }
}