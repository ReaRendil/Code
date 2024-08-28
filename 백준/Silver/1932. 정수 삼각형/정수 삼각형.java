import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int [][] arr = new int [N][N];
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<=i;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int [][] dp = new int [N][N];
		dp[0][0] = arr[0][0];
		for(int i = 1;i<N;i++) {
			for(int j = 0;j<=i;j++) {
				if(j==0) {
					dp[i][j] =arr[i][j]+dp[i-1][j];
				}else if(i==j) {
					dp[i][j] =arr[i][j] + dp[i-1][j-1];
				}else {
					if(dp[i-1][j-1]>dp[i-1][j]) {
						dp[i][j] = arr[i][j]+dp[i-1][j-1];
					}else {
						dp[i][j] =arr[i][j]+dp[i-1][j];
					}
				}
			}
		}int max = dp[N-1][0];
		for(int i = 1;i<N;i++) {
			if(max<dp[N-1][i]) {
				max = dp[N-1][i];
			}
		}
		bw.write(String.valueOf(max));
		bw.flush();
	}

}
