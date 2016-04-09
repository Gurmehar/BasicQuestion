package edu.dsa.stack.chap4;

import java.util.Stack;

public class ReverseStack {
	
	
	public static void revrseStack(Stack stack){
		
		if(stack.isEmpty()){
			return;
		}
		int temp=(int) stack.pop();
		
		revrseStack(stack);
		
		insertAtLast(stack,temp);
		
		
	}
	
	
	private static void insertAtLast(Stack stack, int data) {
		// TODO Auto-generated method stub
				
		if(stack.isEmpty()){
			stack.push(data);
			return;
		}
		int temp=(int) stack.pop();
		insertAtLast(stack,data);
		stack.push(temp);
		
		
		
		
		
	}


	public static void main(String[] args) {
		Stack stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		/*stack.push(4);
		stack.push(5);
		stack.push(6);*/
		
		revrseStack(stack);
		
		
		
	}

}
