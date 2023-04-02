package 백준_B12891_DNA비밀번호;

import java.util.Iterator;
import java.util.Scanner;

public class 백준_B12891_DNA비밀번호_고동연 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int s=sc.nextInt();
		int p=sc.nextInt();
		String dna=sc.next();
		int ans=0;//정답 횟수
		int[] acgt=new int[4];//ACGT 요구 횟수
		for (int i = 0; i < acgt.length; i++) {
			acgt[i]=sc.nextInt();
		}
		
		int start=0;//부문자열 시작 위치
		int end=p-1;//끝 위치
		int[] count=new int[4];//검색된 ACGT의 횟수, 상태
		for (int i = 0; i < p; i++) {
			if(dna.charAt(i)=='A') count[0]++;
			else if(dna.charAt(i)=='C') count[1]++;
			else if(dna.charAt(i)=='G') count[2]++;
			else if(dna.charAt(i)=='T') count[3]++;
		}
		
		boolean isans=true;//검색된 결과가 필요갯수를 만족하는지?
		for (int i = 0; i < count.length; i++) {
			if(count[i]<acgt[i]) isans=false;
		}
		if(isans==true) ans++;//4개 숫자가 모두 최소 횟수를 만족하면 정답 횟수 증가
		
		while(true) {//무한 반복, 탈출조건은 내부에서 정의
			isans=true;
			char before=dna.charAt(start);//삭제할 문자
			
			if(before=='A') count[0]--;
			else if(before=='C') count[1]--;
			else if(before=='G') count[2]--;
			else if(before=='T') count[3]--;
			
			//이동
			start++;
			end++;
			
			if(end==dna.length()) break;
			
			char after=dna.charAt(end);//추가할 문자
			
			if(after=='A') count[0]++;
			else if(after=='C') count[1]++;
			else if(after=='G') count[2]++;
			else if(after=='T') count[3]++;
			
			for (int i = 0; i < count.length; i++) {
				if(count[i]<acgt[i]) isans=false;
			}
			if(isans==true) ans++;//4개 숫자가 모두 최소 횟수를 만족하면 정답 횟수 증가
			
		}//end while
		System.out.println(ans);
	}

}
