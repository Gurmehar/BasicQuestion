package edu.dsa.stack.chap4;

import java.util.HashMap;
import java.util.Stack;

public class Questions {
	static HashMap<Character,Integer> precedenceMap= new HashMap<Character, Integer>();
	static HashMap<Character,Character> symbolMap= new HashMap<Character, Character>();
	static{
		
		precedenceMap.put('+', 6);
		precedenceMap.put('-', 5);
		precedenceMap.put('*', 7);
		precedenceMap.put('/', 8);
		
		symbolMap.put('{', '}');
		symbolMap.put('[', ']');
		symbolMap.put('(', ')');
		
		
		
	}
	
	//convert string to prefix 
	public void prefix(String str){
		String finalStr="";
		 for(char x: str.toCharArray()){
			 System.out.println(x+" -: "+(int)x+" isOperator "+isOperator(x));
				 
			 }
		 }
	
	public boolean  isOperator(char c){
		
		if(((int)c) >=65 && ((int)c)<=90){
			return true;
		}else if(((int)c) >=97 && ((int)c)<=122){
			return true;
		}
		return false;
	}
	
	public boolean isBalanced(String str){
		
		Stack<Character> head= new Stack<Character>();
		
		for(char c:str.toCharArray()){
			if(isOpenSymbol(c)){
				head.push((Character)c);
				
			}else if(isClosedSymbol(c)){
				Character x= (Character) head.pop();
				if(c!=symbolMap.get(x)){
					System.out.println(x+" : "+c+" Not Balanced Equation "+str);
					return false;
				}
			}
		}
		
		System.out.println("  Balanced Equation "+str);
		return true;
		
		
	}

	private boolean isClosedSymbol(char c) {
		if(c=='}' || c==']' || c==')'){
			return true;
		}
		return false;
	}

	private boolean isOpenSymbol(char c) {
		if(c=='{' || c=='[' || c=='('){
			return true;
		}
		return false;
	}
	
	
	
	//convert string to postfix 

}
