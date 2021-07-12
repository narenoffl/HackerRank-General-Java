//The program must accept N unique integers and an integer X as the input. 
//The program must print all the integers right to the integer X (inclusive of X) as the output.
//Note: The integer X is always present in the N integers. 
//Boundary Condition(s): 2 <= N <= 100 1 <= Each integer value, X <= 1000 
//Example Input/Output 1: 
//Input: 6 20 35 10 44 99 18 44 
//  Output: 44 99 18

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    if(arr[i] == x)
		    {
		        while(i<n)
		        {
		            System.out.print(arr[i++] + " ");
		        }
		        return;
		    }
		}

	}
}
