import java.util.*;
public class Main {
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        String[] no=n.split("[ ]");
        int s=0;
        for(String i:no)
        {
            s+=Integer.parseInt(i);
        }
        System.out.println(s);
	}
}
