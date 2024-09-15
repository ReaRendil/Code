import java.util.Scanner;
public class Main {
	static int square (int a) {
		int result = a*a;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0;i<5;i++) {
		int a = sc.nextInt();
		sum+=square(a);
		}
		System.out.print(sum%10);
	}

}