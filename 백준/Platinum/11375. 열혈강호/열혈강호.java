import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] graph;
	static boolean [] visit;
	static int [] right;
	static boolean dfs(int n) {
		for(int m : graph[n]) {
			if(visit[m]) continue;
			visit[m] = true;
				if(right[m]==-3||dfs(right[m])) {
					right[m] = n; return true;
				}
		}
		return false;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		graph = new ArrayList[N];
		for(int i = 0 ;i<N;i++) graph[i] = new ArrayList<Integer>();
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int Work = Integer.parseInt(st.nextToken());
			for(int j = 0;j<Work;j++) {
				int w = Integer.parseInt(st.nextToken());
				graph[i].add(w-1);
			}
		}
		right = new int [M];
		for(int i = 0;i<right.length;i++) right[i] = -3;
		int Count = 0;;
		for(int i = 0;i<N;i++) {
			visit = new boolean [M];
			if(dfs(i))Count++;
		}bw.write(String.valueOf(Count));bw.flush();
	}

}
