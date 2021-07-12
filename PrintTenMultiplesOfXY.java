// Print First ten multiples of X and Y

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int printmul = 1, value = 1;
		while(printmul <= 10)
		{
		    if(value%a==0 || value%b==0 )
		    {
		        System.out.print(" " + val);
		        printmul++;
		    }
		    value++;
		}

	}
}
