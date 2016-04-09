package edu.dsa.queue.chap5;

import java.util.Queue;
import java.util.Stack;

public class InterLeavingQueue {
	
	@SuppressWarnings("unchecked")
	public Queue checkInterLeavingQueue(Queue queue){
		
		if(queue.size()%2!=0){
			throw new IllegalArgumentException("Queue size Should be Even");
		}
		Stack<Integer>stack = new  Stack<Integer>();
		int halfsize=queue.size()/2;
		
		//Reverse first half of queue
		for(int i=0;i<halfsize;i++){
			stack.push((int)queue.remove());
		}
		while(!stack.isEmpty()){
			queue.add(stack.pop());
		}
			
		//Put first half elements in last	
		for(int i=0;i<halfsize;i++){
			queue.add(queue.remove());
		}
		//put first half elements in stack to maintain in order
		for(int i=0;i<halfsize;i++){
			stack.push((int)queue.remove());
		}
		
		//now put the elements in pairs
		while(!stack.isEmpty()){
			queue.add(stack.pop());
			queue.add(queue.remove());
		}
		
		return queue;
	}
	

}
