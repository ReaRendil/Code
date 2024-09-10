import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOError;
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
		int [] dp = new int [N+1];
		dp[1] = 0;
		for(int i = 2;i<N+1;i++) {
			if(i%3==0&&dp[i/3]<=dp[i/2]&&dp[i/3]<=dp[i-1]) {
				dp[i] = dp[i/3] + 1;
			}else if(i%2==0&&dp[i/2]<dp[i-1]) {
				dp[i] = dp[i/2] + 1;

			}else {
				dp[i] = dp[i-1] + 1;
			}
		}
		bw.write(String.valueOf(dp[N]));
		bw.flush();
	}

}
