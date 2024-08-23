import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int [][][] arr = new int [21][21][21];
	static int Re (int a,int b,int c) {
		if(a<=0||b<=0||c<=0) {
		return 1;	
		}
		 if(a>20||b>20||c>20) {
			return Re(20, 20, 20);
		}
		 if(arr[a][b][c]!=0) {
				return arr[a][b][c];
			}
		 if(a<b&&b<c) {
			arr[a][b][c] = Re(a, b, c-1) + Re(a, b-1, c-1) - Re(a, b-1, c);
			return arr[a][b][c];
		}
		 arr[a][b][c] = Re(a-1, b, c) + Re(a-1, b-1, c) + Re(a-1, b, c-1) - Re(a-1, b-1, c-1);
		return arr[a][b][c];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		for(;;) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a==-1&&b==-1&&c==-1) {
				break;
			}
			bw.write("w("+a+", "+b+", "+c+") = ");
			bw.write(Re(a, b, c)+"\n");
		}
		bw.flush();
	}

}
