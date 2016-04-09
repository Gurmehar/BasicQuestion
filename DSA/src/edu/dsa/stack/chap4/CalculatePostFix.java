package edu.dsa.stack.chap4;

import java.util.ArrayList;
import java.util.Stack;

public class CalculatePostFix {
	
	static ArrayList<Character> oprlist= new ArrayList<Character>();
	Stack<Integer> stack = new Stack<Integer>();
	static{
		oprlist.add('+');
		oprlist.add('-');
		oprlist.add('*');
		oprlist.add('/');
	}
	
	public int calculatePostFix(String str){
		int sum =0;
		boolean flag=true;
		if(str!=null){
			for(char ch :str.toCharArray()){
				if(oprlist.contains(ch)){
				
						stack.push(performOpr(stack.pop(),stack.pop(),ch));
						
					
				}else{
					stack.push( Character.getNumericValue(ch));
				}
			}
			
		}
		return stack.pop();
		
	}

	private int performOpr(Integer pop, Integer pop2, char ch) {
		// TODO Auto-generated method stub
		System.out.println("val1 : "+pop +" val2 :"+pop2 +" Operation :"+ch);
		switch(ch){
		case '+':
			return pop+pop2;
		case '/':
			  return pop2/pop;
		case '*':
			return pop2*pop;
		case '-':
			return pop2-pop;
		case '%':
			return pop2%pop;
		}
		return 0;
	}

}
