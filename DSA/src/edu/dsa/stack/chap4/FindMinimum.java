package edu.dsa.stack.chap4;

import java.util.Stack;

public class FindMinimum {

	Stack<Integer> values= new Stack<Integer>();
	Stack<Integer> min = new Stack<Integer>();
	
	public void addElement(int i){
		if(values.isEmpty()){
			values.push(i);
			min.push(i);
		}else if(values.peek()>i){
			values.push(i);	
			min.push(i);
		}else{
			values.push(i);
		}
	}
	
	public void  getValAndMin(){
		while(!values.isEmpty()){
			if(values.peek()>min.peek()){
				System.out.println( "Value :"+values.pop()+" Min :"+min.peek());
			}else{
				System.out.println( "Value :"+values.pop()+" Min :"+min.pop());
			}
		}
		
	}
	
}
