import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		while(num>0)
		{
            if(num%2 != 0)
            {
                System.out.print(num%10);
                flag=true;
            }
            
            num = num/10;
	}
	if(!flag)
	{
	    System.out.print("-1");
	}
}
}
  
