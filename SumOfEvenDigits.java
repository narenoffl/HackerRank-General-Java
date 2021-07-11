//Printing sum of even digits in an integer N

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem,sum=0;
    while(num>0)
    {
      rem = num%10;
      num=num/10;
      
      if(rem%2==0)
      {
        sum = sum + rem;
      }
      
      System.out.println(sum);
		
	}
}
