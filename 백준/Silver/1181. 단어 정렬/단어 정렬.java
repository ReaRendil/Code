import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	static int Order (int i,String n,String m) {
		int num = n.length();
		if(num==i) {
			return 2;
		}
		if(n.charAt(i)>m.charAt(i)) {
			return 0;
		}
		else if(n.charAt(i)<m.charAt(i)) {
			return 1;
		}
		else {
			i++;
			return Order(i,n,m);
		}
	}
	
	static int Sel (String n, String m) {
		if(n.length()>m.length()) {
			return 0;
		}
		else if(n.length()<m.length()) {
			return 1;
		}
		else {
			int i=0;
			return  Order(i,n,m);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int a = 0;
		String str;
		String StrArr [] = new String [N];
		for(int i =0;i<N;i++) {
			str = br.readLine();
			StrArr[i]=str;
		}
		
		for(int i = N-1;i>1;i--) {
			for(int j = N-1-a;j>N-i-1;j--) {
				int num = Sel(StrArr[j],StrArr[j-1]);
				if(num==0) {
					
				}
				else if (num ==1) {
					String n = StrArr[j-1];
					StrArr[j-1] = StrArr[j];
					StrArr[j]=n;
				}
				else {
					a++;
					for(int k = j;j<N-a;j++) {
						StrArr[j]=StrArr[j+1];
					}
					
				}
			}
		}
		for(int i =0;i<N-a;i++) {
			System.out.println(StrArr[i]);
		}
		
	}

}
