import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class Main {

	static Queue<Integer> que = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		for(int i = 1;i<=N/2;i++) {
			que.add(i*2);
		}if(N==2) {
			
		}else if(N==1){
			que.add(1);
		}else {
		for(;;) {
			if(que.size()==1) break;
		if(N%2==1) {//홀수 일때 먼저 더한다
			que.offer(que.poll());
			que.poll();if(que.size()==1) break;
		}else {//짝수 일때
			que.poll();if(que.size()==1) break;
			que.offer(que.poll());
		}
		}}
		bw.write(String.valueOf(que.peek()));
		bw.flush();
	}

}
