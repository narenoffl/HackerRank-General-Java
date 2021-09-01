import java.util.Scanner;
public class OilFactory {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//read inputs
		int num_container = sc.nextInt();
		int[] container = new int[num_container];
		for(int i=0;i<num_container; i++) {
			container[i] = sc.nextInt();
		}
		//sorting of array
		for(int i=0;i<num_container-1;i++) {
			for(int j=i+1;j<num_container;j++) {
				if(container[i]>container[j]) {
					int temp = container[i];
					container[i] = container[j];
					container[j] = temp;
				}
			}
		}
		int mid = num_container/2; //variable to  store middle element
		int n = num_container-1; //to keep track of the last element
		
		for(int i=0; i<mid; i++) {
			System.out.println(container[n]+" "+container[i]); //prints last element(max container), first element(min container) in pair and so on until mid element
			n--;
		}
		//if number of containers are odd in number then print the middle element and "0"
		if(num_container%2 != 0) {
			System.out.println(container[mid]+" 0");
		}
	}
}