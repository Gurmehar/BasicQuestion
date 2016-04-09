package edu.dsa.chap3.ll.question;



public class CheckCircle {
	
	public boolean checkCircular(Node head){
		
		Node tortorise =head;
		Node rabbit=(head.getNext()).getNext();
		
		while(tortorise !=null && rabbit!=null){
			
			if(tortorise==rabbit){
				return true;
			}
			tortorise=tortorise.getNext();
			rabbit=(rabbit.getNext()).getNext();
		}
		
		return false;
	}
	
	
	public Node findHead(Node node){
		
		boolean flag=false;
		Node tortorise =node;
		Node rabbit=node;
		
		while(tortorise.getNext() !=null && (rabbit.getNext()).getNext()!=null){
			tortorise=tortorise.getNext();
			rabbit=(rabbit.getNext()).getNext();
			if(tortorise==rabbit){
				flag=true;
				break;
			}
			
		}
		
		if(flag){
			rabbit=rabbit.getNext();
			 while(tortorise!=rabbit){
				  rabbit=rabbit.getNext();
			 }
		}
		return tortorise;
	}
	
	
	public Node insertInSorted(Node head,Node node2Insert){
		
		if(head==null){
			return node2Insert;
		}
		Node temp=null,curNode=head;
		while(curNode.getNext()!=null && curNode.getData()<node2Insert.getData()){
			temp=curNode;
			curNode=curNode.getNext();
			
		}
		node2Insert.setNext(curNode);
		temp.setNext(node2Insert);
		
		return head;
	}
	
	/*reverseSLL*/
	/**
	 * reverse OF Link List
	 * @param head
	 * @return
	 */
	public Node reverseSLL(Node head){
		Node temp=null,nxtNode=null;
		while(head!=null){
			nxtNode=head.getNext();
			head.setNext(temp);			
			temp=head;
			System.out.println("head pointing to  :: "+head.getData());
			head=nxtNode;
			
		}
		
		System.out.println(temp.toString());
		return temp;
	}
	
	
	
	/*mergingPoint*/
	/**
	 * find merging point of two list
	 * @param headL1
	 * @param headL2
	 * @return
	 */
	public Node mergingPoint(Node headL1,Node headL2){
		
		int list1Size=0,list2Size=0,diff=0;
		Node temp1=headL1,temp2=headL2;
		while(temp1.getNext()!=null){
			list1Size++;
			temp1=temp1.getNext();
		}
		
		while(temp2.getNext()!=null){
			list2Size++;
			temp2=temp2.getNext();
		}
		
		if(list1Size<list2Size){
			temp1=headL2;
			temp2=headL1;
			diff=list2Size-list1Size;
		}else{
			temp1=headL1;
			temp2=headL2;
	
			diff=list1Size-list2Size;
		}
		
		for(int i=1;i<=diff;i++){
			temp1=temp1.getNext();
		}
		
		while(temp1.getNext()!=null && temp2.getNext()!=null){
			
			if(temp1==temp2){
				return temp1;
			}
			temp1=temp1.getNext();
			temp2=temp2.getNext();
			
		}
		return null;
	}
	
	//find middle of SLL
	
	public Node getMid(Node head){
		
		Node temp=head;
		int size=0;
		if(head==null){
			return null;
		}
		while(temp!=null){
			size++;
			temp=temp.getNext();
		}
		System.out.println("size is : "+size);
		temp=head;
		
		for(int i=1;i<size/2;i++){
			temp=temp.getNext();
			
		}
		System.out.println(temp.getData());
		return temp;
	}
	
	//find middle with single scan-- use 2 ptr ,rabbit and tortoise
	public void getMidValue(Node head){
		Node rabbit=head,tortoise=head;
		boolean flag=true;
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
		System.out.println(tortoise.getData());
	}
	
	//display elements in reverse order--using recursions
	
	public void printSSLInReverse(Node head){
		if(head==null){
			return;
		}
		printSSLInReverse(head.getNext());
		System.out.println(head.getData());
		
		
	}
	
	//check if list is even or odd -- use rabbit
	public void checkEvenOdd(Node head){
		Node rabbit =head ;
		while(rabbit!=null && rabbit.getNext()!=null){
			rabbit=rabbit.getNext().getNext();
		}
		if(rabbit==null){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
		
		
	}
	
	/*reversePairSLL*/
	/**
	 * @param head
	 * @return
	 */
	public Node reversePairSLL(Node head){
		Node temp ;
		if(head==null || head.getNext()==null ){
			return head;
		}else{
			temp=head.getNext();
			head.setNext(temp.getNext());
			temp.setNext(head);
			head=temp;
			(head.getNext()).setNext(reversePairSLL(head.getNext().getNext()));
			return head;
			
		}
		
	}
	
	public void spiltCLL(Node head){
		Node rabbit=head,tortoise=head;
		Node head1=null, head2=null;
		
		while(rabbit.getNext()!=head && (rabbit.getNext()).getNext()!=head){
			rabbit=(rabbit.getNext()).getNext();
			tortoise=tortoise.getNext();
		}
		
		if((rabbit.getNext()).getNext()==head){
			rabbit=rabbit.getNext();
		}
		
		head1=head;
		if(head.getNext()!=head){
			head2=tortoise.getNext();	
		}
		rabbit.setNext(tortoise.getNext());
		tortoise.setNext(head);
		
		System.out.println("Rabbit:- "+ rabbit.getData()+"\n rabbit.next "+(rabbit.getNext()).getData());
		System.out.println("Tortoise:- "+tortoise.getData());
		
		
		
		
	}
	
	
	public void getJosephusPosition(int N,int M){
		
		Node p,q;
		p=new Node();
		p.setData(1);
		
		q=p;
		 for(int i=2;i<=N;i++){
		    Node z= new Node();
		    p.setNext(z);
		    z.setData(i);
		    p=p.getNext();
		 }
		 p.setNext(q);
		 
		  for(int count=1;count<N;count++){
			  
			  for(int i=0;i<M-1;i++){
				  p=p.getNext();
			  }
			  System.out.println("At Count- : "+count+" Elemenating --:"+ p.getNext().getData());
			  p.setNext(p.getNext().getNext());
		  }
		  System.out.println(p.getData());
		 
	}
	
	

}
