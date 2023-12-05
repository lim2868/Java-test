package sec04_stackandqueue.ex01_stackmethod;

import java.util.Stack;

public class StackMethod {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println();
		System.out.println(stack.search(7));
		System.out.println(stack.search(3));
		System.out.println(stack.search(5));
		System.out.println(stack.search(2));
		System.out.println(stack.search(9));
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();
		System.out.println(stack.empty());
		
		/* push() - 데이터값을 넣는것
		 * peek() - 맨위에 값을 읽는것
		 * search() - 해당값이 몇번째 위치에 있는지 알려주는 것 없는거는 -1로 뜸
		 * pop() - 위에서부터 하나씩 데이터를 꺼내는 것(꺼낸 데이터는 없어짐)
		 * empty() - 데이터가 없으면 true 데이터가 있으면 false
		 */
	}
}