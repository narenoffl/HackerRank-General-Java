import java.util.*;
public class CloudProblem {

    public static int memServer1(int []req)
    {
        int answer = 0;
        for(int i=0;i<req.length;i+=2){
            answer += req[i];
        }

        return answer;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int req_size = in.nextInt();
        int req[] = new int[req_size];

        for(int idx=0; idx<req_size;idx++)
        {
            req[idx] = in.nextInt();
        }

        int result = memServer1(req);
        System.out.print(result);

        in.close();
    }
}
