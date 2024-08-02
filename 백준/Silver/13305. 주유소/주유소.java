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
		String d = br.readLine();
		String [] Distance = d.split(" ");
		int [] distance = new int [N-1];
		for(int i = 0;i<distance.length;i++) {
			distance[i] = Integer.parseInt(Distance[i]);
		}
		String p = br.readLine();
		String [] Price = p.split(" ");
		int [] price = new int [N];
		for(int i = 0;i<Price.length;i++) {
			price[i] = Integer.parseInt(Price[i]);
		}
		long sum = 0;
		int n = 0;
		for(int i = 1 ;i<price.length; i++) {
			if(price[n]>price[i]||i+1==price.length) {
				for(int j = n;;n++) {
					if(n==i) {
						break;
					}
					sum+=price[j]*distance[n];
				}
			}
		}
		String str = String.valueOf(sum);
		bw.write(str);
		bw.flush();
		
	}

}
