import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] graph;
	static int [] right;
	static boolean [] visit;
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
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		boolean [][] bord = new boolean [R][C];
		int rawbord [] [] = new int [R][C];
		int colbord [] [] = new int [R][C];
		
		for(int i = 0;i<R;i++) {
			for(int j = 0;j<C;j++) {
				rawbord[i][j] = i;
				bord[i][j] = true;
			}
		}
		for(int i = 0;i<C;i++) {
			for(int j = 0;j<R;j++) {
				colbord[j][i] = i;
			}
		}
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			bord[x-1][y-1] = false;
		}
		
		graph = new ArrayList[R];
		right = new  int [C];
		int sum = 0;
		for(int i = 0 ;i<R;i++) {
			graph[i] = new ArrayList<Integer>();
		}
		for(int i = 0;i<R;i++) {
			for(int j = 0;j<C;j++) {
				if(bord[i][j]) {
					graph[rawbord[i][j]].add(colbord[i][j]);
				}
			}
		}
		for(int i = 0;i<right.length;i++) {
			right[i] = -3;
		}
		for(int i = 0;i<R;i++) {
			visit = new boolean[C];
			if(dfs(i))sum++;
		}
		bw.write(String.valueOf(sum));bw.flush();
	}

}
