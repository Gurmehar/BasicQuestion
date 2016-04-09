package edu.dsa.queue.chap5;

import java.util.Stack;

import edu.dsa.queue.chap5.exception.EmptyQueueException;

public class QueueOn2Stack {
	
	
	Stack <Integer> stack1 = new Stack<Integer>() ;
	Stack <Integer> stack2 = new Stack<Integer>() ;
	
	
	
	
	
	public void enQueue(int data){
		this.stack1.push(data);
	}
	
	public int deQueue(){
		if(!this.stack2.isEmpty()){
			return this.stack2.pop();
		}else{
			while(!this.stack1.isEmpty()){
				this.stack2.push(this.stack1.pop());
			}
			return this.stack2.pop();
		}
	}

	
	public boolean isEmpty(){
		if(this.stack2.isEmpty()){
			while(!this.stack1.isEmpty()){
				this.stack2.push(this.stack1.pop());
			}
		}
		return this.stack2.isEmpty();
	}
}
