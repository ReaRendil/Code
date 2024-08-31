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
		int [] arr = new int [N];
		for(int i = N-1;i>=0;i--) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int [][] dp = new int [3][N];
		dp[1][0] = arr[0];
		for(int i = 1;i<N;i++) {
			if(dp[1][i-1]>dp[2][i-1]) {
				dp[0][i] = dp[1][i-1];
			}else {
				dp[0][i] = dp[2][i-1];
			}
			dp[2][i] = dp[1][i-1] + arr[i];
			if(i!=1) {
				
			
			dp[1][i] = dp[0][i-1] + arr[i];
		}
		}int max = dp[0][N-1];
		for(int i = 1;i<3;i++) {
			if(max<dp[i][N-1]) {
				max = dp[i][N-1];
			}
		}
		bw.write(String.valueOf(max));bw.flush();
	}

}
