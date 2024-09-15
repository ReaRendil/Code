import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String boj = sc.next();
		int k = sc.nextInt();
		int leng = boj.length()-k;
		
		
		
		int num = 0;
		for(int i = 0 ; i<leng;i++) {
			int [] eng = new int [26];
			int max = 0;
			int count = 0;
			for(int j = i;j<boj.length();) {
				
					eng[boj.charAt(j) - 'a']++;
					if(eng[boj.charAt(j) - 'a']>max) {
						max = eng[boj.charAt(j) - 'a'];
					}
				
				count++;
				j+=leng;
			}
			
			num+=count-max;
		}
		System.out.println(num);
		
	}


}
