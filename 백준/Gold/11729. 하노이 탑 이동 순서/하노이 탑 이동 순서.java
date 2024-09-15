import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class  Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static void Recu(int N,int current,int target) throws IOException {
		if(N==1) {
			bw.write(current+" "+target+"\n");
			return;
		}
		Recu(N-1, current,6-current-target);
		bw.write(current+" "+target+"\n");
		Recu(N-1,6-current-target, target);
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 1;
		for(int i=0;i<N;i++) sum*=2;
		bw.write(String.valueOf(sum-1)+"\n");
		Recu(N, 1, 3);
		bw.flush();
	}

}
