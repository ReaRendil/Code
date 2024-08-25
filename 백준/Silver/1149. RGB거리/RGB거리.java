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
		int [][] rgb = new int [3][N];
		int [][] dp = new int [3][N];
		for(int i = 0;i<N;i++) {
			st =new StringTokenizer(br.readLine());
			for(int j = 0;j<3;j++) {	
				rgb[j][i] = Integer.parseInt(st.nextToken());
				if(i==0) {
					dp[j][i] = rgb[j][i];
				}
			}
		}
		
		for(int i = 1;i<N;i++) {
			for(int j = 0;j<3;j++) {
				for(int k = 0;k<3;k++) {
					if(j!=k) {
						if(dp[j][i]==0) {
							dp[j][i] = dp[k][i-1] + rgb[j][i];
						}else {
							if(dp[j][i]>dp[k][i-1] + rgb[j][i]) {
								dp[j][i] = dp[k][i-1] + rgb[j][i];
							}
						}
					}
				}
			}
		}int min = dp[0][N-1];
		for(int i = 1;i<3;i++) {
			if(min>dp[i][N-1]) {
				min = dp[i][N-1];
			}
		}bw.write(String.valueOf(min));
		bw.flush();
	}
}
