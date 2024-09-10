import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int h =sc.nextInt();
        int m =sc.nextInt();
        if (m>44)  {
            m=m-45 ; 
        }
      else if (m<45&&h!=0){
            h=h-1;
            m=45-m;
            m=60-m;
      }
        else {
            h=23;
            m=45-m;
            m=60-m;
        }
         System.out.printf("%d ", h);
         System.out.printf("%d", m);      
    }
}