import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int max (int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int arr [] = new int [N+2];
		int dp [][] = new int [3][N+2];
		for(int i = 0;i<N;i++) arr[i]=Integer.parseInt(br.readLine());
		if(N>1) dp[1][1] = arr[1]; dp[2][1] = arr[1]+arr[0]; dp[0][1] = arr[0];
		int dpxx [] = new int [N+2]; dp[0][0] = arr[0];
		for(int i = 2;i<N;i++) {
			dpxx[i] = dp[0][i-1];
			dp[1][i] = max(dp[0][i-1]+arr[i],dpxx[i-1]+arr[i]);
			dp[2][i] = dp[1][i-1]+arr[i];
			if(dp[2][i-1]>dp[1][i-1]) {
				dp[0][i] = dp[2][i-1];
			}else {
				dp[0][i] = dp[1][i-1];
			}
			
		}
		int max = dp[0][N-1];
		for(int i = 1;i<3;i++) {
			if(dp[i][N-1]>max) max = dp[i][N-1];
		}
		bw.write(String.valueOf(max));
		bw.flush();
	}

}
