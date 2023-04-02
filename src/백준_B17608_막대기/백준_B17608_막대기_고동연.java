package 백준_B17608_막대기;

import java.util.Scanner;

public class 백준_B17608_막대기_고동연 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 
		 int[] h=new int[n];
		 for (int i = 0; i < n; i++) {
			h[i]=sc.nextInt();
		 }
		 int count=1;//마지막 막대기는 무조건 보이므로 1부터 시작
		 int max=h[h.length-1];
		 
		 for (int i = h.length-1; i >=0; i--) {
			if(h[i]>max) {
				//기준값 보다 큰 막대기를 만나면 기준값이 큰값으로 변경
				max=h[i];
				count++;
			}
		 }
		
		 System.out.println(count);
	}

}
