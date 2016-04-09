package edu.dsa.stack.chap4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileAlreadyExistsException;

import edu.dsa.chap2.TestParent;

public class TestChild extends TestParent  implements Serializable{
	
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;



	static{
		System.out.println("Child Static..");
	}
	
	public TestChild(){
		super("Name");
		System.out.println("Child Cons");
	}
	
	@Override
	public void getData() throws FileAlreadyExistsException{
		System.out.println("Child With No exception");
		
	}
	 
	

	public static void main(String[] args) throws FileNotFoundException, FileAlreadyExistsException {
		TestChild tc = new TestChild();
		tc.getData();
		
		
	}
}
