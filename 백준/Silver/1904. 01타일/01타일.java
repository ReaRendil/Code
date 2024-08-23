import java.util.Scanner;

public class Main {
	static long [] dp;
	static long Re (int n) {
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new long [1000001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		for(int i = 4;i<=n;i++) {
			dp[i] = dp[i-1] + dp[i-2];
			if(dp[i]>=15746) {
				dp[i]%=15746;
			}
		}
		System.out.println(dp[n]);
	}
}
