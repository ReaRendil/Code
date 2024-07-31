

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N =sc.nextInt();
		int arr[] = new int [6];
		for(int i =0;i<6;i++) {
			int n = sc.nextInt();
			arr[i]=n;
		}
		int T =sc.nextInt();
		int num = 0;
		for (int i =0;i<6;i++){
			for(;;) {
				if(arr[i]>0) {
					num++;
					arr[i]-=T;
					
				}
				else {
					break;
				}
			}
		}
		int P =sc.nextInt();
		
		System.out.println(num);
		System.out.print(N/P);
		System.out.print(" "+N%P);
		
	}

}
