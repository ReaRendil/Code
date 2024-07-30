

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int num = 0;
		int [] arr = new int [N];
		for(int i = 0;i<N;i++) {
			int n = sc.nextInt();
			arr[i]=n;
		}for(int i = N-1;i>=0;i--) {
			if(arr[i]<=K) {
				for(;;) {
					K-=arr[i];num++;
					if(K<arr[i])break;
					
				}
			}
		}
		System.out.println(num);
	}

}
