package edu.dsa.chap2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class TestParent {
	
	static
	{
		System.out.println("Parent Static");
	}
	
	public TestParent(String Test){
		System.out.println("Test  "+Test);
	}
	
	public TestParent(){
		
		
		System.out.println("Parent Class");
	}
	
	public void getData()  throws Exception{
		System.out.println("Parent F=Func Exception");
	}

}
