package edu.dsa.queue.chap5;

import edu.dsa.queue.chap5.exception.EmptyQueueException;

public class QueueONLL {
	
	
	Node front,rear;
	
	public QueueONLL() {
		// TODO Auto-generated constructor stub
		this.front=null;
		this.rear=null;
	}
	
	public boolean isEmpty(){
		return(front==null);
	}
	
	public void enQueue( int data){
		Node newNode = new Node(data);
		if(this.rear!=null){
			this.rear.setNext(newNode);
		}
		this.rear= newNode;
		if(this.front==null){
			this.front=this.rear;
		}
	}

	
	public  int deQueue() throws EmptyQueueException{
		Integer data=null;
		if(this.front==null){
			throw new EmptyQueueException("Queue Empty");
		}else{
			data= (Integer) this.front.getData();
			this.front=this.front.getNext();
			return data.intValue();
		}
		
	}
	
	
}
