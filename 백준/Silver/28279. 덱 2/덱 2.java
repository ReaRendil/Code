import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Deque<Integer> deq = new ArrayDeque<>();
		for(int i = 0 ;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			if(n==1) {
				int m = Integer.parseInt(st.nextToken());
				deq.addFirst(m);
			}else if(n==2) {
				int m = Integer.parseInt(st.nextToken());
				deq.addLast(m);
			}else if(n==3) {
				if(deq.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(deq.pollFirst()+"\n");
				}
			}else if(n==4) {
				if(deq.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(deq.pollLast()+"\n");
				}
			}else if(n==5) {
				bw.write(deq.size()+"\n");
			}else if(n==6) {
				if(deq.isEmpty()) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}
			}else if(n==7) {
				if(deq.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(deq.getFirst()+"\n");
				}
			}else if(n==8) {
				if(deq.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(deq.getLast()+"\n");
				}
			}
		}bw.flush();
	}

}
