package ExamQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ExamQueue {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();//큐<>안에 저장할 데이터타입 integer
		//linkedlist 안에는 큐에서 정의한 기능이 포함.
		//get add와 같은 변수는 linkedlist에는 존재하지만 접근할 수없어 사용못함.
		q.offer(100);
		q.offer(200);
		q.offer(300);
		q.offer(400);
		q.offer(500);
		int front=q.poll();
		System.out.println("poll="+front);
		System.out.println("queue="+q);
		System.out.println("peek="+q.peek());//맨 앞값 출력
		
		while(!q.isEmpty()) {
			q.poll();
			System.out.println(q);
		}
	}

}
