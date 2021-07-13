import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(j=1;j<=n-1;j++){
		        System.out.print("* ");
		    }
		    for(int j=1;j<=(i*2)-1;j++){
		        System.out.print(ctr + " ");
		    }
		    System.out.print("\n");
		}

	}
}
