package edu.dsa.queue.chap5;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import edu.dsa.queue.chap5.exception.EmptyQueueException;

public class ConsectivePairs {

	@SuppressWarnings("unchecked")
	public boolean checkConsectivePairs(Stack stack)  {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean flag=true;
		if(stack.isEmpty()){
			throw new EmptyStackException();
		}
		/* These 2 Iterations are done in order to put the stack in reverse order*/
		while(!stack.isEmpty()){
			System.err.println("added in queue"+stack.peek());
			queue.add((int)stack.pop());
			
		}
		
		while(!queue.isEmpty()){
			stack.push(queue.remove());
			System.out.println(stack.peek());
		}
		
		
		
		while(!stack.isEmpty()){
			int n=(int)stack.pop();
			queue.add(n);
			if(!stack.isEmpty()){
				int m=(int)stack.pop();
				queue.add(m);
				if(Math.abs(n-m)!=1){
					flag=false;
					return false;
				}
			}
		}
		while(!queue.isEmpty()){
			stack.push(queue.remove());
		}
		
		return flag;
	}
	
}
