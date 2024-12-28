import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n, s;
    int[] nums;
    int start, end; // two pointer
    int partial_sum = 0; // 부분 수열의 합
    int res = Integer.MAX_VALUE; // 가장 짧은 길이의 부분 수열

    private void sol() throws IOException {
        init();

        while (end <= n) {
            if (partial_sum < s) {
                partial_sum += nums[end++];
            } else {
                if (end - start < res) {
                    res = end - start;
                }
                partial_sum -= nums[start++];
            }
        }

        if (res == Integer.MAX_VALUE) {
            res = 0;
        }
        System.out.println(res);
    }

    private void init() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        start = 0;
        end = 0;
        nums = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        new Main().sol();
    }
}
