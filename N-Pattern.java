import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		char ch = sc.next().charAt(0);
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n;j++){
		        if(i == j || j == 1 || j == n){
		            System.out.print(ch);
		        }else{
		            System.out.print("-");
		        }
		    }
		    System.out.print("\n");
		}

	}
}
