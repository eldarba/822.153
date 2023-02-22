package c.dataStructure;

import java.util.Stack;

public class Demo2Stack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);

		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
