package edu.dsa.stack.chap4;

public class StackOnArray {
	
	private int[] dataArray;
	private int size,topOne,topTwo;
	
	public StackOnArray(int size) {
		if(size<2) throw new StackOverflowError("Invalid Size");
		this.dataArray = new int[size];
		this.size = size;
		this.topOne = -1;
		this.topTwo = size;
	}
	
	
	public void push(int stackId, int element){
		if(this.topOne+1==this.topTwo) throw new StackOverflowError("Array Is Full");
		switch(stackId){
		case 1:
		
			this.topOne++;
			this.dataArray[this.topOne]=element;
			break;
		case 2:
			
			this.topTwo--;
			this.dataArray[this.topTwo]=element;
			break;
		}
		
	}
	
	public int pop(int stackId){
		switch(stackId){
		case 1:
			if(this.topOne<=-1)throw new StackOverflowError("No elements in Stack");
			
			return this.dataArray[this.topOne--];
			
		case 2:
			if(this.topOne==this.size)throw new StackOverflowError("No elements in Stack");
			
			return this.dataArray[this.topTwo++];
		default:
			return -1;
		}
	}
		
	public int peek(int stackId){	
		switch(stackId){
		case 1:
			if(this.topOne<=-1)throw new StackOverflowError("No elements in Stack");
			return this.dataArray[this.topOne];
			
		case 2:
			if(this.topOne==this.size)throw new StackOverflowError("No elements in Stack");
			return this.dataArray[this.topTwo];
		default:
			return -1;
		}
	}
	
	public boolean isEmpty(int stackId){
		switch(stackId){
		case 1:
			return(this.topOne<=-1);
			
		case 2:
			return(this.topOne==this.size);
		default:
			return true;
		}
	}
	

}
