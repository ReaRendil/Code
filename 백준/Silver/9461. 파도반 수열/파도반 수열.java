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
		int T = Integer.parseInt(st.nextToken());
		long [] arr = new long [101];
		arr[1]=1;arr[2] =1;arr[3] = 1; arr[4] = 2; arr[5] = 2; arr[6] = 3;
		for(int i = 7;i<=100;i++) {
			arr[i] = arr[i-1] + arr[i-5];
		}
		for(int i = 0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			bw.write(arr[n]+"\n");
		}
		bw.flush();
	}
}
