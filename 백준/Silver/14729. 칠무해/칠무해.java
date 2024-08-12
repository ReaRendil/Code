import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		double [] arr = new double [N];
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Double.parseDouble(st.nextToken());
		}
		Arrays.sort(arr);
		for(int i = 0;i<7;i++) {
			System.out.printf("%.3f"+"\n",arr[i]);
		}
	}

}
