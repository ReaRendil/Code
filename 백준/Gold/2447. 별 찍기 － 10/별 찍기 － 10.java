

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = sc.nextInt();
		boolean arr [] [] =new boolean [N+1][N+1];
		nine(arr,1,1,N,N);
		for(int i = 1;i<=N;i++) {
			for(int j = 1;j<=N;j++) {
				if(arr[i][j]==true) {
					bw.write("*");
				}
				else {
					bw.write(" ");
				}
			}
			bw.write("\n");
			bw.flush();
		}
	}
	static void nine (boolean arr [][],int x,int y, int X,int Y) {
		if(x!=X) {
			int my = (Y-y+1)/3-1;
			int mx = (X-x+1)/3-1;
			nine(arr,x,y,mx+x,my+y);
			nine(arr,mx+x+1,y,X-mx-1,my+y);
			nine(arr,X-mx,y,X,my+y);
			nine(arr,x,Y-my,mx+x,Y);
			nine(arr,mx+x+1,Y-my,X-mx-1,Y);
			nine(arr,X-mx,Y-my,X,Y);
			nine(arr,x,my+y+1,mx+x,Y-my-1);
			nine(arr,X-mx,my+y+1,X,Y-my-1);
			
		}
		else {
			arr[x][y]=true;
		}
	}
	

}
