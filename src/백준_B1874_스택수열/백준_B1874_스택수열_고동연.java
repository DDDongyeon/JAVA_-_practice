package 백준_B1874_스택수열;

import java.util.Scanner;
import java.util.Stack;

public class 백준_B1874_스택수열_고동연 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		Stack<Integer>st=new Stack<>();
		int[] arr=new int[n];
		
		for (int i = 0; i <n; i++) {
			arr[i]=sc.nextInt();
		}
		while(!st.isEmpty()) {
			int start=1;
			int cnt=0;
			
			if(arr[cnt]>start) {
			for (int j = start; j <= arr[cnt]; j++) {
			st.push(j);
			System.out.println("+");
			start++;
		}
			st.pop();
			arr[cnt]=st.peek();
			cnt++;
			System.out.println("-");
			
			}else if(arr[0]==start){
				
			}
		}
	}

}
