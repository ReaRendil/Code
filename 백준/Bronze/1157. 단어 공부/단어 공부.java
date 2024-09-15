import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int eng [] = new int[26];
		for(int x = 0;x<str.length();x++) {
			int A = 65,a=97;
		for(int i = 0;i<26;i++) {
			if(str.charAt(x)==A||str.charAt(x)==a) {
				eng[i]++;
			}
			A++;a++;
		}
		}
		int A = 0;
		int max = -1, M=0;
		for(int i = 0;i<26;i++) {
			if(eng[i]==max) 
				A=1;
			if(eng[i]>max) {
				max=eng[i];
				M=i;
				A=0;
				}
		}
		char ch = (char)(65 + M);
		if(A==1)
			System.out.println("?");
		else
			System.out.println(ch);
	}

}
