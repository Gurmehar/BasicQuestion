package edu.dsa.chap3.ll.question;



public class Test {

	public static void main(String[] args) {
		Node one = new Node();
			 one.setData(1);
						
		Node two = new Node();
			 two.setData(2);
			 two.setNext(null);	
			 one.setNext(two);
		Node three = new Node();
			three.setData(3);
			three.setNext(null);
			two.setNext(three);
		Node four = new Node();
			 four.setData(4);
			// four.setNext(null);
			 three.setNext(four);
			 Node five = new Node();
			 five.setData(5);
			 four.setNext(five);		 
			 
			 
			 CheckCircle cc= new CheckCircle();
			 //cc.printSSLInReverse(one);
			 //cc.getMid(one);
			// cc.reverseSLL(one);
			/*four.setNext(one);
			Node temp=cc.findHead(one);
			System.out.println(temp.getData());*/
			// cc.getMidValue(one);
			// cc.checkEvenOdd(one);
			/* one= cc.reversePairSLL(one);
			 System.out.println(one.toString());*/
/*			 five.setNext(one);
			 cc.spiltCLL(one);*/
			 
			/* Palindrome pd =new Palindrome();
			 pd.isPalindrome(one) ;
			 System.out.println( one.toString());*/
			 
			// five.setNext(one);
			 //cc.getJosephusPosition(11, 3);
			 
			 ModularNode mn= new ModularNode();
			 System.out.println((mn.getFractionalNode(one, 2)).toString());
			 
			 
			 
			 
	}
	
}
