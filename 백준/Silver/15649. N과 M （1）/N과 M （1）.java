

	import java.util.Scanner;

	public class Main {

	   public static int[] arr;
	   public static boolean[] tf;
	   
	   public static void main(String[] args) {
	      // TODO Auto-generated method stub

	      Scanner sc = new Scanner(System.in);
	      int N = sc.nextInt();
	      int M = sc.nextInt();
	      arr  =new int [N+1];
	      for(int i =1;i<=N;i++) {
	         arr[i]=i;
	      }
	      tf = new boolean [N+1];
	      dep(N,M,0);
	            
	   }
	    static void dep(int N, int M, int depth) {
	      if(depth == M) {
	         for(int i =0;i<depth;i++) {
	            System.out.print(arr[i] + " ");
	         }
	         System.out.println();
	         return;
	      }
	      
	      for(int i = 0;i<N;i++){
	         if(!tf[i]){
	            tf[i] = true;
	            arr[depth] = i+1;
	            dep(N,M,depth + 1);
	            
	            tf[i] = false;
	         }
	      }
	   }
	}



