import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean[] visit;
	static ArrayList<ArrayList<Integer>> graph;
	public static void putE(int s,int e) {
		graph.get(s-1).add(e);
		graph.get(e-1).add(s);
	}
	public static void bfs(int V) throws IOException {
		visit[V] = true;
		Queue<Integer> que = new LinkedList<>();
		que.add(V);
		while(!que.isEmpty()) {
			int t = que.poll();
			bw.write(t+" ");
			for(int next : graph.get(t-1)) {
				if(!visit[next]) {
					que.add(next);
					visit[next] = true;
				}
			}
		}
		
	}
	public static void dfs(int V) throws IOException {
		visit[V] = true;
		bw.write(V+" ");
		for(int next : graph.get(V-1)) {
			if(!visit[next]) dfs(next);
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		visit = new boolean [N+1];
		graph = new ArrayList<>();
		for(int i = 0;i<N;i++) {
			  graph.add(new ArrayList<>());
		}
		for(int i = 0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			putE(s,e);
		}
		for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }
		dfs(V);bw.write("\n");Arrays.fill(visit,false);
		bfs(V);
		bw.flush();
		
	}
}
