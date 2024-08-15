import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.WriteAbortedException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Queue<Integer> que = new LinkedList<>();
		int num = 0; int size = 0; int e = 0;
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("push")) {
				int n = Integer.parseInt(st.nextToken());
				que.add(n);num++;size++;e=n;
			}else if(str.equals("pop")){
				if(que.isEmpty()) {
					bw.write("-1");
				}else {
					bw.write(String.valueOf(que.poll()));num--;size++;
				}
				bw.write("\n");
			}else if(str.equals("size")) {
				bw.write(String.valueOf(num)+"\n");
			}else if(str.equals("empty")) {
				if(que.isEmpty()) {
					bw.write("1");
				}else {
					bw.write("0");
				}
				bw.write("\n");
			}else if(str.equals("front")) {
				if(que.isEmpty()) {
					bw.write("-1");
				}else {
					bw.write(String.valueOf(que.peek()));
				}
				bw.write("\n");
			}else if(str.equals("back")) {
				if(que.isEmpty()) {
					bw.write("-1");
				}else {
					bw.write(String.valueOf(e));
				}
				bw.write("\n");
			}
			
		}bw.flush();
	}

}
