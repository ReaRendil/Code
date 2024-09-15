

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char chessboard [][] = new char [N][M];
		for(int i = 0;i<N;i++) {
			String str = sc.next();
			for(int j = 0;j<str.length();j++) {
				chessboard [i][j] = str.charAt(j);
						
			}
		}
		int Min = 64;
		
		for(int n = 0;n+8<=N;n++) {
			for(int m = 0;m+8<=M;m++) {
				int minA = 0;
				int minB = 0;
				for(int i = n;i<n+8;i++) {
					int num = i+1;
					for(int j = m;j<m+8;j++) {
						if(num%2==0) {
							if(chessboard[i][j]=='W') {
								minA++;
							}
							if(chessboard[i][j]=='B') {
								minB++;
							}
							
						} else {
							if(chessboard[i][j]=='B') {
								minA++;
							}
							if(chessboard[i][j]=='W') {
								minB++;
							}
							
						}

						
						num++;
					}

				}
				if(minA>minB) {
					if(Min>minB) {
						 Min = minB;
					}
				}else {
					if(Min>minA) {
						Min = minA;
					}
				}
				
			}
		}
		System.out.println(Min);
		
	}

}
