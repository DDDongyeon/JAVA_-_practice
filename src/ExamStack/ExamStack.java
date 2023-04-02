package ExamStack;

import java.util.Stack;

public class ExamStack {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		System.out.println(st);
		Integer top=st.pop();//스택 맨위 값 반환 후 삭제
		System.out.println("top="+top);
		System.out.println("Stack="+st);
		System.out.println("peek="+st.peek());//스택 맨위 값 반환
		
		while(!st.isEmpty()) {//isEmpty가 true가 아닐 때까지 //비어있지 않을때까지
			st.pop();
			System.out.println(st);
		}
		
	}

}
