package edu.dsa.stack.chap4;

public class ThreeStackOnArray {

	private int []dataArray;
	private int size,topOne,toptwo,topthree,baseThree;
	
	public ThreeStackOnArray(int size){
		if(size<3) throw new StackOverflowError("Below MiniumSize ,More than 3 Allowed");
		this.dataArray=new int[size];
		this.topOne=-1;
		this.toptwo=size;
		this.baseThree=size/3;
		this.topthree=this.baseThree;
	}
	
	public void push(int stackId,int element){
		
		switch(stackId){
		case 1:
			if(this.topOne+1 == this.baseThree){
				if(stack3isRightShiftable()){
					shiftStack3ToRight();
					this.dataArray[++this.topOne]=element;
				}else{
					throw new StackOverflowError("Stack1 is Full");
				}
			}else{
				this.dataArray[++this.topOne]=element;
			}
			break;
		case 2:
			if(this.toptwo-1==this.topthree){
				if(stack3IsLeftShiftable()){
					shiftStack3ToLeft();
					this.dataArray[--this.toptwo]=element;
				}else{
					throw new StackOverflowError("Stack2 is Full");
				}
			}else{
				this.dataArray[--this.toptwo]=element;
			}
			break;
		case 3:
			if(this.toptwo-1==this.topthree){
				if(stack3IsLeftShiftable()){
					shiftStack3ToLeft();
					this.dataArray[++this.topthree]=element;
				}else{
					throw new StackOverflowError("Stack3 is Full");
				}
			}else{
				this.dataArray[++this.topthree]=element;
			}
			break;
		}
		
	}
	

	private void shiftStack3ToLeft() {
		for(int i=this.baseThree-1;i<this.topthree-1;i++){
			this.dataArray[i]=this.dataArray[i+1];
		}
		this.baseThree--;
	}

	private boolean stack3IsLeftShiftable() {
		if(this.topOne+1>this.baseThree){
			return true;
		}
		return false;
	}

	private void shiftStack3ToRight() {
		for(int i=this.topthree+1;i>=this.baseThree+1;i--){
			this.dataArray[i]=this.dataArray[i-1];
		}
		this.dataArray[this.baseThree++]=-1;
		this.topthree++;
	}

	private boolean stack3isRightShiftable() {
		if(this.topthree+1<this.toptwo){
			return true;
		}
		return false;
	}
	
	
	
	public int pop(int stackId){
		switch(stackId){
		case 1:
			if(this.topOne==-1){
				throw new StackOverflowError("Stack 1 Empty");
			}
			return  this.dataArray[--this.topOne];
		case 2:
			if(this.toptwo==this.size){
				throw new StackOverflowError("Stack 2 Empty");
			}
			return  this.dataArray[++this.toptwo];
		case 3:
			if(this.topthree==this.size){
				throw new StackOverflowError("Stack 3 Empty");
			}
			return  this.dataArray[--this.topthree];
		default:
			throw new StackOverflowError("No Stack Defined");	
		}
	}
	
	public int peek(int stackId){
		switch(stackId){
		case 1:
			if(this.topOne==-1){
				throw new StackOverflowError("Stack 1 Empty");
			}
			return  this.dataArray[this.topOne];
		case 2:
			if(this.toptwo==this.size){
				throw new StackOverflowError("Stack 2 Empty");
			}
			return  this.dataArray[this.toptwo];
		case 3:
			if(this.topthree==this.size){
				throw new StackOverflowError("Stack 3 Empty");
			}
			return  this.dataArray[this.topthree];
		default:
			throw new StackOverflowError("No Stack Defined");	
		}
	}
	

}
