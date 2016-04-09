package edu.dsa.queue.chap5;

import java.util.Stack;

import edu.dsa.queue.chap5.exception.EmptyQueueException;

public class QueuetoStack {
	
	public void queueinStack(QueueONLL queue) throws EmptyQueueException{
		Stack <Object> stack = new Stack<Object>();
		if(queue.isEmpty()){
			throw new EmptyQueueException("Queue Empty");
		}else{
			while(!queue.isEmpty()){
				stack.push(queue.deQueue());
			}
			while(!stack.isEmpty()){
				queue.enQueue((int)stack.pop());
			}
			while(!queue.isEmpty()){
				stack.push(queue.deQueue());
			}
		}
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}

}
