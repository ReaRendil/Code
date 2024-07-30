import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Stack<Integer> line = new Stack<>();
		Stack<Integer> space = new Stack<>();
		boolean tf = true;
		String s = br.readLine();
		String [] arr = s.split(" ");
		for(int i = 0;i<N;i++) {
			space.push(Integer.parseInt(arr[i]));
		}
		for(int i = 0;i<N;i++) {
			line.add(space.pop());
		}
		int n = 1;
		for(;;) {
			if(!line.isEmpty()&&line.peek()==n) {
				line.pop();n++;
			}else if(line.isEmpty()){
				break;
			}else if(!space.isEmpty()&&space.peek()==n){
                space.pop();n++;
            }else {
				space.add(line.pop());
			}
			
		}
		int R=0;
		for(;;) {
            if(space.isEmpty()&&line.isEmpty()) {
				break;
			}
			R++;
			if(!space.isEmpty()&&space.peek()==n) {
				space.pop();n++;
				R=0;
				if(n==N) {
					break;
				}
			}
			if(R>2) {
				tf = false;
				break;
				
			}
		}
		if(tf) {
			bw.write("Nice");
		}else {
			bw.write("Sad");
		}
		bw.flush();
		bw.close();
		
	}
}
