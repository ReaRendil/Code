import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		   StringTokenizer st = new StringTokenizer(br.readLine());
	       int N = Integer.parseInt(st.nextToken());
	       for(int i = 0;i<N;i++) {
	    	   if(i!=0) {
	    		   bw.write("\n");
	    	   }
	    	   st = new StringTokenizer(br.readLine());
	    	   int a = Integer.parseInt(st.nextToken());
	    	   int b = Integer.parseInt(st.nextToken());
	    	   int sum = 1;
	    	   for(int j = 0;j<b;j++) {
	    		   sum*=a;sum%=10;
	    	   }
	    	   if(sum==0) {
	    		   bw.write("10");
	    	   }else {
	    	   bw.write(String.valueOf(sum));
	    	   }
	       }
		bw.flush();
	}

}
