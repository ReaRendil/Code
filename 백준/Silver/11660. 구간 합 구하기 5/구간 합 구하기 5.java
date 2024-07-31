
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arrx [][] = new int [N][N];
		int arry [][] = new int [N][N];
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j =0;j<N;j++) {
				int n = Integer.parseInt(st.nextToken());
				 if(j!=0) {
					 arrx[i][j] =n+arrx[i][j-1];
				 }
				 else {
					 arrx[i][j] +=n;
				 }
			}
		}
		for(int i = 0;i<N;i++) {
			for(int j = 0;j<N;j++) {
				if(j!=0) {
					arry[i][j]=arrx[j][i]+arry[i][j-1];
				}
				else {
					arry[i][j]+=arrx[j][i];
				}
			}
		}
		for(int R = 0;R<M;R++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int sum = arry[y2-1][x2-1];
			if(x1!=1) {
				sum-=arry[y2-1][x1-2];
				
			}
			if(x1!=1&&y1!=1) {
				sum+=arry[y1-2][x1-2];
			}
			if(y1!=1) {
				sum-=arry[y1-2][x2-1];
			}
			

			System.out.println(sum);
		}
	}

}
