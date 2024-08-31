import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static boolean visit[];
	static ArrayList<Integer>[] graph;
	static int num;
	static int arr [];
	public static void dfs(int R) {
		visit[R] = true;
		arr[R] = num;num++;
		for(int next : graph[R]) if(!visit[next]) dfs(next);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		graph = new ArrayList[N+1];
		for(int i = 0;i<=N;i++) graph[i] = new ArrayList<Integer>();
		for(int i = 0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph[u].add(v); graph[v].add(u);
		}
		for (int i = 0; i <= N; i++) Collections.sort(graph[i]);
		arr = new int [N+1];num = 1;visit = new boolean [N+1];
		dfs(R);
		for(int i = 1;i<=N;i++) {
			bw.write(arr[i]+"\n");
		}
		bw.flush();
	}

}
