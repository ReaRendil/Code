import java.util.Scanner;


public class Main {
	
	static void result(String str) {
		int sum =0;
		
		for(int i = 0;i<str.length();i++) {
			
			int num = str.charAt(i)-'0';
			num -= str.charAt(str.length()-1-i)-'0';
			if(num==0) {
				sum++;
			}
			
			else {break;}	
		}
		if(sum==str.length())
			System.out.println("yes");
		else
			System.out.println("no");
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		for(;;) {
			String str = sc.next();
			if(Integer.parseInt(str)==0) {
				break;
			}
			result(str);
		}
	}

}
