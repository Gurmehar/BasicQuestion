package edu.dsa.stack.chap4;

public class StackNode {
	
	private String value;
	private StackNode nextNode;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public StackNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(StackNode nextNode) {
		this.nextNode = nextNode;
	}
	
	
	public StackNode push(StackNode head,StackNode element){
		
		if(element==null){
			return head;
		}
		
		element.setNextNode(head);
		
		return element;
	}
	
	
	public StackNode pop(StackNode head){
		
		if(head==null){
			System.out.println("Error Empty Stack");
			return null;
		}
		
		StackNode temp=head;
		
		System.out.println(temp.getValue());
		head=head.getNextNode();
		
		return temp;
		
		
	}
	
	public void peek(StackNode head){
		if(head==null){
			System.out.println("Error Empty Stack");
			return;
		}
		System.out.println(head.getValue());
	}
	
	public boolean isEmpty(StackNode head){
		if(head==null){
			return true;
		}
		return false;
	}
	
	public void deleteStack(StackNode head){
		head=null;
	}
	

}
