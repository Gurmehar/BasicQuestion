package edu.dsa.stack.chap4;

import java.util.Stack;

public class FindingSpan {
	
	/**
	 * Complexity order(n square)
	 * @param inputArray
	 * @return
	 */
	public int[] findingSpan(int [] inputArray){
		int []spans= new int[inputArray.length];
		for(int i=0; i<inputArray.length;i++){
			int span=1;
			int j=i-1;
			while(j>=0 && inputArray[j]<=inputArray[j+1]){
				span++;
				j--;
			}
			spans[i]=span;
		}
		return spans;
		
	}
	
	
	public int[] findingSpanUsingStack(int []inputArray){
		int []spans= new int[inputArray.length];
		Stack<Integer> stack =new Stack<Integer>();
		int p=0;
		for(int i=0;i<inputArray.length;i++){
			
			
			while(!stack.isEmpty() && inputArray[i]>inputArray[(int)stack.peek()]){
				stack.pop();
			}
			if(stack.isEmpty()){
				p=-1;
			}else{
				p=(int)stack.peek();
			}
			
			spans[i]=i-p;
			stack.push(i);
			
		}
		
		return spans;
		
	}

}
