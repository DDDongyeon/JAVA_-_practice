package 백준_B11660_구간합구하기5;

import java.util.Scanner;

public class 백준_B11660_구간합구하기5_고동연 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		int[][] arr=new int[N+1][N+1];
		
		for (int i = 1; i < N+1; i++) {
			for (int j = 1; j < N+1; j++) {
				arr[i][j]=sc.nextInt();
			    arr[i][j]=arr[i][j-1]+arr[i-1][j]-arr[i-1][j-1]+arr[i][j];
			}
		}
		
		for (int i = 0; i < M; i++) {
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			System.out.println(arr[x2][y2]-arr[x1-1][y2]-arr[x2][y1-1]+arr[x1-1][y1-1]);
		};
	}

}
