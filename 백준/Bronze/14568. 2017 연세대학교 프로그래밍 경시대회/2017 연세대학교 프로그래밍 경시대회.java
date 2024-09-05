import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 0;
		for(int i = 1;i<N;i++) {
			for(int j = 1;j<N-i;j++) {
				int k = N-i-j;
					if(k!=0&&j!=0&&i!=0) {
						if(j%2==0) {
							if(i+2<=k) {
								num++;
							}
						}
					}
				
			}
		}
		System.out.println(num);
	}

}
