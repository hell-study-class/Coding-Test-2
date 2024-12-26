import static java.lang.Math.max;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int res, val, n, k, s, e;
    int[] nums;

    private void sol() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        s = 0;
        e = k;

        st = new StringTokenizer(br.readLine());
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < e; i++) {
            res += nums[i];
        }
        val = res;

        while (e != n) {
            val = val - nums[s] + nums[e];
            res = max(res, val);
            s++;
            e++;
        }

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        new Main().sol();
    }
}
