import java.io.*;
import java.util.*;

public class Main {
    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            System.out.println(combi(M, N));
        }

    }

    static int combi(int n, int r) {
        if(dp[n][r] > 0)
            return dp[n][r];

        if(n==r || r == 0)
            return dp[n][r] = 1;


        return dp[n][r] = combi(n-1, r-1) + combi(n-1, r);
    }
}