import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int [] arr = new int [N];
		int [] sum = new int [N];
		for(int i = 0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		} sum[0] = arr[0];
		for(int i = 1;i<N;i++) {
			if(sum[i-1]>=0){
				sum[i] = sum[i-1] + arr[i];

			}
			else {
				sum[i] = arr[i];
			}
		}
		Arrays.sort(sum);
		bw.write(String.valueOf(sum[N-1]));
		bw.flush();
	}

}
