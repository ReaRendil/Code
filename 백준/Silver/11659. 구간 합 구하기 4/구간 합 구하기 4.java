import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [] num = new int [N];
		int [] sum = new int [N+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 0;i<N;i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		sum [1] = num [0];
		for(int i = 2;i<N+1;i++) {
			sum[i] = sum[i-1] + num[i-1];
		}
		for(int i = 0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(sum[e] - sum[s-1])+"\n");
		}
		bw.flush();
	}

}
