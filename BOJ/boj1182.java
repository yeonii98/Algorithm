import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1182 {//부분수열의 합_비트마스크
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;

        for(int i = 1; i <= (1 << N) - 1; i++){
            int sum = 0;
            for(int j = 0; j < N; j++){
                if((i & (1 << j)) != 0){
                    sum += arr[j];
                }
            }
            if(sum == S)
                answer++;
        }

        System.out.println(answer);
    }
}