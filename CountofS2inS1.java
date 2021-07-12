//Count the occurrences of string 

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		char[] ch1 = sc.next().toCharArray();
		char[] ch2 = sc.next().toCharArray();
		int count=0;
		for(int i=0;i<ch1.length-1;i++)
		{
		    if(ch1[i] == ch2[0] && ch1[i+1] == ch2[1])
		    {
		        count++;
		    }
		}
		System.out.print(count);

	}
}
