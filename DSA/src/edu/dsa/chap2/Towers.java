package edu.dsa.chap2;
import java.util.Stack;


public class Towers {
	
	private Stack <Object> source = new Stack<Object>();
	private Stack <Object> aux = new Stack<Object>();
	private Stack <Object> dest = new Stack<Object>();
	
	private char sRod,aRod,dRod;
	
	public Towers()	{
		//source.push(4);
		source.push("W");
		source.push(2.3f);
		source.push("X");
		source.push("Z");
		sRod='S';
		aRod='A';
		dRod='D';
	}
	
	public void hanoiAlgo(int len,char source,char dest,char aux){
		System.out.println(len);
		if(len==1){
			moveDisk(source,dest);
			return;
		}else{
			hanoiAlgo(len-1, source,aux,dest);
			moveDisk(source,dest);
			hanoiAlgo(len-1,aux,dest,source);
		}
	}
	
	
public void hanoiAlgoStack(int len,Stack source,Stack dest,Stack aux){
		
		if(len==1){
			moveStackDisk(len,source,dest);
			return;
		}else{
			hanoiAlgoStack(len-1, source,aux,dest);
			moveStackDisk(len,source,dest);
			hanoiAlgoStack(len-1,aux,dest,source);
		}
	}

private void moveStackDisk(int len,Stack source2, Stack dest2) {
	// TODO Auto-generated method stub
	System.out.println("length is "+len);
	System.out.println("Moving disk  from Tower -: "+source2.toString() + " to Tower "+ dest2.toString());
		dest2.push(source2.pop());
}

	private void moveDisk(char source2, char dest2) {
		// TODO Auto-generated method stub
		System.out.println("Moving disk  from Tower -: "+source2 + " to Tower "+ dest2);
	}
	
	public static void main(String[] args) {
		Towers t= new Towers();
		//t.hanoiAlgo(4, t.sRod, t.dRod, t.aRod);
		t.hanoiAlgoStack(t.source.size(), t.source, t.dest, t.aux);
		 while(!t.dest.empty()){
			 System.out.println(t.dest.pop());
		 }
		 
		//t.hanoiAlgo(3, t.sRod, t.dRod,t.aRod);
	}
	
	
	

}
