package edu.dsa.stack.chap4;

import java.util.Stack;

public class StackAscending {
	
	
	public static Stack sort(Stack stack){
		Stack aux = new Stack();
		
		while(!stack.isEmpty()){
			int temp=(int) stack.pop();
			while(!aux.isEmpty() && (int)aux.peek()>temp){
				stack.push(aux.pop());
			}
			aux.push(temp);
		}
		return aux;
		
	}

}
