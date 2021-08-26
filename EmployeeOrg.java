import java.util.*;

public class EmployeeOrg {

    private static int workingWeeks(int[] projC) {
        int max_modules = 0, total_sum = 0, rest_sum;
        for (int modules : projC) {
            total_sum += modules;
            if (modules > max_modules) max_modules = modules;
        }
        rest_sum = total_sum - max_modules;
        return rest_sum + Math.min(max_modules, rest_sum + 1);
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int projC_size = in.nextInt();
        int projC[] = new int[projC_size];
        for(int idx=0; idx<projC_size; idx++){
            projC[idx] = in.nextInt();
        }

        int result = workingWeeks(projC);
        System.out.print(result);

        in.close();
    }
}
