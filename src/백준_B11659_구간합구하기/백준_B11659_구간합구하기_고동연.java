package 백준_B11659_구간합구하기;

import java.util.Scanner;

public class 백준_B11659_구간합구하기_고동연 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		int[] arr=new int[N+1];
		
		
		
		for (int x = 1; x < N+1; x++) {
			arr[x]=arr[x-1]+sc.nextInt();
		}
		
		for (int x = 0; x < M; x++) {
			int i=sc.nextInt();
			int j=sc.nextInt();
			System.out.println(arr[j]-arr[i-1]);
		}

}
}
