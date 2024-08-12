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
		int T = Integer.parseInt(st.nextToken());
		for(int i = 0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int K = M-N+2; ; long sum = M-N+1;
			int n = 2;
			for(;;) {
				if(K<=M) {
					sum*=K;K++;
				}if(sum%n==0&&n<=N) {
					sum/=n;n++;
				}
				if(N<n&&K>M) {
					break;
				}
			}
			bw.write(sum+"\n");
		}
		bw.flush();
	}
}
