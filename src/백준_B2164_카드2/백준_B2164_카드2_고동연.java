package 백준_B2164_카드2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준_B2164_카드2_고동연 {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			q.offer(i);
		}
			
		while(q.size()!=1) {
			q.poll();
			int s=q.poll();
			q.offer(s);
		}
		System.out.println(q.peek());
		
		}
		
	}


