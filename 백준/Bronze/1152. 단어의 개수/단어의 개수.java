import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int a = 1;
		int z = S.length();
		for (int i = 0;i<S.length();i++) {
			if(S.charAt(i)==' ') 
			a++;
		}
		if(S.charAt(0)==' ') a--;
		if(S.charAt(S.length()-1)==' ') a--;
		System.out.println(a);
	}

}

