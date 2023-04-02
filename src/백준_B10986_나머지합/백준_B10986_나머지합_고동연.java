package 백준_B10986_나머지합;

import java.util.Scanner;

public class 백준_B10986_나머지합_고동연 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		int[] arr=new int[N+1];
		int[] d=new int[N+1];
		for (int i = 1; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int count=0;
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				d[j]=d[j-1]+arr[j];
				if(d[j]%M==0) {
					count++;
				}
			}
			arr[i]=0;
		}//end for
		System.out.println(count);
	}
}
