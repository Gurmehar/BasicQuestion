package edu.dsa.queue.chap5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import edu.dsa.queue.chap5.exception.EmptyQueueException;

public class Test {
 
	public static void main(String[] args) throws EmptyQueueException {
		QueueONLL queue= new QueueONLL();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		
		/*ReverseQueue rq = new ReverseQueue();
		queue=rq.reverse(queue);
		
		while(!queue.isEmpty()){
			System.out.println(queue.deQueue());
		}*/
		
		
		/*QueueOn2Stack qos=new QueueOn2Stack();
			qos.enQueue(0);
			qos.enQueue(1);
			qos.enQueue(2);
			qos.enQueue(3);
			
		System.out.println(qos.deQueue());*/
		
		/*QueuetoStack qos= new QueuetoStack();
		qos.queueinStack(queue);*/
		
		
		/*Stack <Integer>stack= new Stack<Integer>();
		stack.push(4);stack.push(4);
		stack.push(3);stack.push(2);
		stack.push(1);
		ConsectivePairs cp =new ConsectivePairs();
		System.out.println(cp.checkConsectivePairs(stack));*/
		
		Queue <Integer> iqueue= new LinkedList<Integer>();
		iqueue.add(1);iqueue.add(2);iqueue.add(3);iqueue.add(4);iqueue.add(5);iqueue.add(6);
		InterLeavingQueue ilq= new InterLeavingQueue();
			iqueue=ilq.checkInterLeavingQueue(iqueue);
			for(Integer i:iqueue){
				System.out.println(i);
			}
		
		
	}
}
