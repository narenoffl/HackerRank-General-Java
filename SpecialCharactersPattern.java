import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i-1;j++)
		    {
		        System.out.print("*")
		    }
		    System.out.print("#");
		    
		    for(int j=1;j<=n-i;j++)
		    {
		        System.put.print("-");
		    }
		    System.out.print("\n");
		}

	}
}
