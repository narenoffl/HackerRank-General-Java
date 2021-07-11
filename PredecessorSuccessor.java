//Printing Predecessor and Successor Element in Array

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
		System.out.println(arr[x-2] + " " +arr[x-1]+ " " +arr[x]);

	}
}
