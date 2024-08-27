import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
			if(right[m] == -4 || dfs(right[m])) {
				right[m] = n;
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [][] chess = new int [N][M];
		boolean [] [] space = new boolean [N][M];
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<M;j++) {
				chess[i][j] = Integer.parseInt(st.nextToken());
				if(chess[i][j]!=0) space[i][j] = true;
			}
		}int [][] point =new int [N][M];//주변 벽 갯수 
		for(int i = 0;i<N;i++) {
			for(int j = 0;j<M;j++) {
				if(chess[i][j]==0) {
					int sum = 0;
					if(i>0) {
						if(chess[i-1][j]==2)sum++;
					}else sum++;
					if(i+1<N) {
						if(chess[i+1][j]==2)sum++;
					}else sum++;
					if(j>0) {
						if(chess[i][j-1]==2)sum++;
					}else sum++;
					if(j+1<M) {
						if(chess[i][j+1]==2)sum++;
					}else sum++;
					point [i][j] = sum;
				}
			}
		}
		Queue<Integer> quei = new LinkedList<Integer>();
		Queue<Integer> quej = new LinkedList<Integer>();
		for(int k = 4;k>=0;k--) {
			for(int i = 0;i<N;i++) {
				for(int j = 0;j<M;j++) {
					if(chess[i][j]==0&&point[i][j]==k) {
						quei.add(i);quej.add(j);
					}
				}
			}
		}
		//행 열 구분 
		int [][] raw = new int [N][M]; int [][] col = new int [N][M];
		boolean wall = false; int rawnum = 0; int colnum = 0;
		for(int i = 0;i<N;i++) {
			for(int j = 0;j<M;j++) {
				if(chess[i][j]==2) {
					if(wall) { 
						wall = false; rawnum++;
					}
				}else {
					if(!wall)wall = true;
					raw[i][j] = rawnum;
				}
			}if(wall) {
				wall = false;rawnum++;
			}
		}
		for(int j = 0;j<M;j++) {
			for(int i = 0;i<N;i++) {
				if(chess[i][j]==2) {
					if(wall) {
						wall = false; colnum++;
					}
				}else {
					if(!wall)wall = true;
					col[i][j] = colnum;
				}
			}if(wall) {
				wall = false;colnum++;
			}
		}
		
		graph = new ArrayList[rawnum];
		for(int i = 0;i<rawnum;i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0;i<N;i++) {
			for(int j = 0;j<M;j++) {
				if(!space[i][j]) {
					graph[raw[i][j]].add(col[i][j]);
				}
			}
		}
		int sum = 0;
		right = new int [colnum];
		for(int i = 0;i<right.length;i++) {
			right[i] = -4;
		}
		
		for(int i = 0;i<rawnum;i++) {
			visit = new boolean [colnum];
			if(dfs(i)) sum++;
		}
		
		
		bw.write(String.valueOf(sum));
		bw.flush();
	}
}
