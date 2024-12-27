import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n, s, e, res;
    int r1, r2;
    int[] nums;

    private void sol() throws IOException {
        n = Integer.parseInt(br.readLine());
        nums = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        s = 0;
        e = n - 1;
        r1 = nums[s];
        r2 = nums[e];
        res = Integer.MAX_VALUE;

        while (s < e) {
            int val = nums[s] + nums[e];
            if (Math.abs(val) < Math.abs(res)) {
                res = val;
                r1 = nums[s];
                r2 = nums[e];
            }

            if (val == 0) {
                break;
            } else if (val < 0) {
                s++;
            } else {
                e--;
            }
        }

        System.out.printf("%d %d", r1, r2);
    }

    public static void main(String[] args) throws IOException {
        new Main().sol();
    }
}
