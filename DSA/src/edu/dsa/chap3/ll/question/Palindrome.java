package edu.dsa.chap3.ll.question;

public class Palindrome {
	
	Node rabbit=null,tortoise=null;
	Node head1=null, head2=null;
	
	private void splilstList(Node head){
		boolean flag=true;
		rabbit=tortoise=head;
		while(rabbit.getNext()!=null){
			if(flag){
				rabbit=rabbit.getNext();
				flag=false;
			}else{
				rabbit=rabbit.getNext();
				tortoise=tortoise.getNext();
				flag=true;
			}
		}
		head1=head;
		head2=tortoise.getNext();
		tortoise.setNext(null);
		
		
	}
	
	private Node reverseSLL(){
		Node temp=null,nxtnode=null;
		System.out.println(head2.toString());
		while(head2 !=null){
			nxtnode=head2.getNext();
			head2.setNext(temp);
			temp=head2;
			head2=nxtnode;
		}
		System.out.println(temp.toString());
		return temp;
		
	}
	
	private int getSize(Node head){
		int cntr =1;
		Node temp=head;
		while(temp.getNext()!=null){
			temp=temp.getNext();
			cntr++;
		}
		
		return cntr;
		
	}
	
	
	private boolean checkPalindrome(Node head){
		//int size =getSize(head);
		splilstList(head);
		head2=reverseSLL();
		 while(head2!=null){
			 System.out.println("head1.getData() "+head1.getData() +" head2.getData()"+head2.getData());
			 if(!(""+head1.getData()).equalsIgnoreCase(""+head2.getData())){
				 return false;
			 }
			 head1=head1.getNext();
			 head2=head2.getNext();
		 }
		
		
		return true;
	}
	
	public void isPalindrome(Node head){
		
		if(checkPalindrome(head)){
			System.out.println("List is Palindrome");
		}else{
			System.out.println("List is not Palindrome");
		}
		
		joinList(head);
	}

	private void joinList(Node head) {
		// TODO Auto-generated method stub
		Node temp=head;
		 while(temp.getNext()!=null){
			 temp=temp.getNext();
		 }
		 temp.setNext(reverseSLL());
		
		
	}

}
