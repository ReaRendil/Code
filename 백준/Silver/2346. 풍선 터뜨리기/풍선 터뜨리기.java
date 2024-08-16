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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Deque<Integer> deq = new ArrayDeque<Integer>();
		for(int i = 1;i<=N;i++) {
			deq.add(i);
		}st = new StringTokenizer(br.readLine());
		int [] arr = new int [N+1];
		for(int i = 1;i<=N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}int num;
		for(int i = 0;i<N;i++) {
			bw.write(String.valueOf(deq.peek()));
			num = arr[deq.poll()];
			if(i+1==N) {
				break;
			}else bw.write(" ");
			if(num>0) {
				for(int j = 1;j<num;j++) {
					deq.add(deq.poll());
				}
			}else if(num<0) {
				for(int j = 0;j>num;j--) {
					deq.addFirst(deq.pollLast());
				}
			}
		}
		bw.flush();
	}

}
