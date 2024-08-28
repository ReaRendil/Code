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
	static boolean dfs (int n) {
		for(int m : graph[n]) {
			if(visit[m]) {
				continue;
			}
			visit[m] = true;
			if(right[m]==-3||dfs(right[m])) {
				right[m] = n; return true;
			}
		}return false;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int [][] raw = new int [N][N];
		int [][] col = new int [N][N];
		graph = new ArrayList[N];
		right = new int[N];
		int sum = 0;
		for(int i = 0 ;i<N;i++) graph[i] = new ArrayList<Integer>();
		for(int i = 0;i<K;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x-1].add(y-1);
		}
		for(int i = 0;i<right.length;i++) right[i] = -3;
		for(int i = 0;i<N;i++) {
			visit = new boolean[N];
			if(dfs(i))sum++;
		}bw.write(String.valueOf(sum));bw.flush();
		
	}

}
