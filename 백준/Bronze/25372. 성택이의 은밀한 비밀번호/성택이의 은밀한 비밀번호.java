
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0;i<N;i++) {
			String  str = sc.next();
			if(str.length()>=6&&str.length()<=9) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

}
