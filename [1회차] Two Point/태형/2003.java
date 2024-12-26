import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int res, n, m, s = 0, e = 1;
    int val;
    int[] nums;

    private void sol() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        while (s <= e && e <= n) {
            val = sum(s, e);
            if (val < m) {
                e++;
            } else if (val == m) {
                res++;
                e++;
            } else {
                s++;
            }
        }

        System.out.println(res);
    }

    private int sum(int start, int end) {
        int ret = 0;
        for (int i = start; i < end; i++) {
            ret += nums[i];
        }

        return ret;
    }


    public static void main(String[] args) throws IOException {
        new Main().sol();
    }

}
