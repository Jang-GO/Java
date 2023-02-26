import java.util.*;

class Main {
  public String solution(String str) {
	  StringBuilder sb = new StringBuilder();
	  sb.append(str);
	  sb.reverse();
	  return sb.toString();
  }
  public static void main(String[] args){
	  Main T = new Main();
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  String[] str = new String[n];
	  for(int i=0;i<n;i++) {
		  String input = sc.next();
	  	  str[i]=T.solution(input);
	  }
	  for(int i=0;i<n;i++) {
		  System.out.println(str[i]);
	  }
   }
}
