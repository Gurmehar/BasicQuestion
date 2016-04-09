package edu.dsa.stack.chap4;

import java.util.Stack;

public class Palindrome {
	
	Stack<Character> stack = new Stack<Character>() ;
	
	public boolean isPalidrome(String str){
		
		for(char ch:str.toCharArray()){
			if(ch=='X'){
				str=str.substring(str.indexOf(ch)+1, str.length());
				break;
				
			}
			stack.push(ch);
		}
		
		while(!stack.isEmpty()){
			for(char ch:str.toCharArray()){
				if(ch!=stack.pop()){
					return false;
				}
			}
		}
		
		return true;
	}

}
