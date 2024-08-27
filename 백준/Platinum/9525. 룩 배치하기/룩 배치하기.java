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
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Boolean [][] bord = new  Boolean [N][N];
		
		for(int i = 0;i<N;i++) {
			String line = br.readLine();
			for(int j = 0;j<N;j++) {
				char n = line.charAt(j); 
				if(n=='X') {
					bord[i][j] = true;
				}else {
					bord[i][j] = false;
				}
			}
		}
		boolean pawnR = false;boolean pawnC = false;
		int [][] raw = new int [N][N];
		int [][] col = new int [N][N];
		int rawnum = 0;int colnum = 0;
		for(int i = 0;i<N;i++) {
			for(int j = 0;j<N;j++) {
				if(bord[i][j]) {
					if(pawnR) {
						pawnR = false; rawnum++;
					}
				}else {
					raw[i][j] = rawnum;
					if(!pawnR) pawnR = true;
				}
				if(bord[j][i]) {
					if(pawnC) {
						pawnC = false;colnum++;
					}
				}else {
					col[j][i] = colnum;
					if(!pawnC) pawnC = true;
				}
			}
			if(pawnC) {
				pawnC = false;colnum++;
			}if(pawnR) {
				pawnR = false; rawnum++;
			}
		}
		graph = new ArrayList[rawnum];
		right = new int [colnum];
		int sum = 0;
		for(int i = 0 ;i<rawnum;i++) {
			graph[i] = new ArrayList<Integer>();
		}
		for(int i = 0;i<N;i++) {
			for(int j = 0;j<N;j++) {
				if(!bord[i][j]) {
					graph[raw[i][j]].add(col[i][j]);
				}
			}
		}
		for(int i = 0;i<right.length;i++) {
			right[i] = -3;
		}
		for(int i = 0;i<rawnum;i++) {
			visit = new boolean[colnum];
			if(dfs(i))sum++;
		}bw.write(String.valueOf(sum));bw.flush();
	}

}
