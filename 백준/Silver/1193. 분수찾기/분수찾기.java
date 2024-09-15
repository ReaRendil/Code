

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int num = N;
		int  n = N;
		for(int i = 1;;) {
			if(num > i) {
				num -= i;
				i+=4;
			}
			else {
				i= i/2+2;
				if(i>num) {
					
				}
				else {
					num =  (i-1)-(num - i +1);
				}
				break;
			}
		}
		for(int i = 3;;) {
			if(n > i) {
				n -= i;
				i+=4;
			}
			else {
				i= i/2+2;
				if(i>n) {
					
				}
				else {
					n =  (i-1)-(n - i +1);
				}
				break;
			}
		}
		
		System.out.println(num+"/"+n);
	}

}
