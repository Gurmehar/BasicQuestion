package edu.dsa.stack.chap4;

import java.util.HashMap;
import java.util.Stack;

public class ConvertToPostFix {
	static HashMap<Character,Integer> precedenceMap= new HashMap<Character, Integer>();
	Stack<Character>opStack= new Stack<Character>();
	static{
			
			precedenceMap.put('+', 6);
			precedenceMap.put('-', 5);
			precedenceMap.put('*', 7);
			precedenceMap.put('/', 8);
			precedenceMap.put('(', 0);
			precedenceMap.put(')', 0);
			
	}
	
	public String convert(String str){
	
		char []infix= str.toCharArray();
		str="";
		for(char c:infix){
			System.out.println(" Adding Char "+c+" String is :"+str);
			if(c=='('){
				opStack.push(c);
			}
			else if(c==')'){
				str=popTillOpen(str,c);
				
			}else if(precedenceMap.containsKey(c)){
					
				if(!opStack.empty()){
					 if(precedenceMap.get(opStack.peek())>precedenceMap.get(c)){
						
						str=popAndAppend(str, c);
						
					}else if(precedenceMap.get(opStack.peek()) == precedenceMap.get(c)){
						str=str+opStack.pop();
						opStack.push(c);
					}
					else{
						opStack.push(c);
					}
					
				}else{
					opStack.push(c);
				}
			}else{
				str=str+c;
			}
		}
		
		while(!opStack.empty()){
			str=str+opStack.pop();
		}
		return str;
		
	}
	
	private String popTillOpen(String str, char c) {
		// TODO Auto-generated method stub
		while(opStack.peek()!='('){
			str=str+opStack.pop();
		}
		opStack.pop();//poping element '('
		
		return str;
	}

	public String popAndAppend(String str,char c){
		
		while(!opStack.empty() && (precedenceMap.get(opStack.peek())>=precedenceMap.get(c)) ){
			str=str+opStack.pop();
		}
		opStack.push(c);
		return str;
	}
	
	

}
