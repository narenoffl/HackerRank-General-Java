// // Wipro Elite Drive Problem 2 - Sept 1

// // A company wishes to modify the technique by which tasks in the processing queue are executed. 
// // There are N processes with unique IDs from 0 to N-1. Each of these tasks has its own execution time. 
// // The company wishes to implement a new algorithm for processing tasks. For this purpose they have identified a value K. By the new algorithm, 
// // the processor will first process the task that has the Kth shortest execution time.

// // Write an algorithm to find the Kth shortest execution time.

// //Input 
// 7 5
// 9 -3 8 -6 -7 18 10
	
// Output	
// 9

// Explanation : The sorted list of execution times is [-7, -6, -3, 8, 9, 10, 18]
// So, the 5th smallest execution time is 9

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
