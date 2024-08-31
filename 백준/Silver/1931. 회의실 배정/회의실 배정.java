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
		Pos[] posss = new Pos[N];
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			posss[i] = new Pos(x, y);
		}
		Arrays.sort(posss);
		int Count = 1;int X = posss[0].x; int Y = posss[0].y;
		for(int i = 1;i<N;i++) {
			if(Y<=posss[i].x) {
				Count++;
				X = posss[i].x; Y = posss[i].y;
			}
			if(Y>posss[i].y) {
				X = posss[i].x; Y = posss[i].y;
			}
		}
		bw.write(String.valueOf(Count));bw.flush();
	}

}
class Pos implements Comparable<Pos> {
	int x, y;
	public Pos(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public int compareTo(Pos o) {
		if(this.x==o.x) return this.y-o.y;
		return this.x-o.x;
	}
}