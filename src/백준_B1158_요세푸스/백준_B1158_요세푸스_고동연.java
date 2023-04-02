package 백준_B1158_요세푸스;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준_B1158_요세푸스_고동연 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		Queue<Integer> q=new LinkedList<>();
		
		for (int i = 1; i <=n; i++) {
			q.offer(i);
		}
		System.out.print("<");
		while(q.size()!=1) {
			for (int j = 1; j < k; j++) {
				q.offer(q.poll());
			}
			System.out.print(q.poll()+", ");
		}
		System.out.print(q.poll()+">");
		
	}

}
