package edu.dsa.queue.chap5;

import java.util.Stack;

import edu.dsa.queue.chap5.exception.EmptyQueueException;

public class ReverseQueue {

	public QueueONLL reverse(QueueONLL queue) throws EmptyQueueException{
		Stack <Object> stack = new Stack<Object>();
		while(!queue.isEmpty()){
			stack.push(queue.deQueue());
		}
		while(!stack.isEmpty()){
			queue.enQueue((Integer)stack.pop());
		}
		
		return queue;
	}
	
}
