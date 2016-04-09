package edu.dsa.queue.chap5.exception;

public class EmptyQueueException extends Exception {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 6359835037153853971L;

	public EmptyQueueException(String message) {
		super(message);
		System.out.println(message);
		// TODO Auto-generated constructor stub
	}


	
}
