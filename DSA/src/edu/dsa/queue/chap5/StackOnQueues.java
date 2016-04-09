package edu.dsa.queue.chap5;

import java.util.LinkedList;
import java.util.Queue;



public class StackOnQueues {
	
	  Queue<Integer> queue;
	  Queue<Integer> queue2;
	  
	  public StackOnQueues(){
		  this.queue= new LinkedList<Integer>();
		  this.queue2= new LinkedList<Integer>();
	  }
	  
	  public void push(int data){
		  if(this.queue.isEmpty()){
			  this.queue2.add(data);
		  }else{
			  this.queue.add(data);
		  }
	  }
	  
	  public int pop(){
		  if(!this.queue.isEmpty()){
			  while(this.queue.isEmpty()){
				  this.queue2.add(this.queue.poll());
			  }
			  return this.queue2.poll();
		  }else{
			  while(this.queue2.isEmpty()){
				  this.queue.add(this.queue2.poll());
			  }
			  return this.queue.poll();
		  }
	  }

}
