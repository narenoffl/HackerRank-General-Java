import java.util.Scanner;
public class KthShortestExecution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//read inputs
		int num_ele = sc.nextInt();
        int kth = sc.nextInt();
		int[] exec_mem = new int[num_ele];
		for(int i=0;i<num_ele; i++) {
			exec_mem[i] = sc.nextInt();
		}
		//sorting of array
		for(int i=0;i<num_ele-1;i++) {
			for(int j=i+1;j<num_ele;j++) {
				if(exec_mem[i]>exec_mem[j]) {
					int temp = exec_mem[i];
					exec_mem[i] = exec_mem[j];
					exec_mem[j] = temp;
				}
			}
		}
        System.out.print(exec_mem[kth-1]);
    }
}