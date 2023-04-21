package main;

import tests.Test;

public class Main {
	
	public static void main(String[] arg) throws InterruptedException {
		
		Test test = new Test();

		test.setUp();

		test.test();

	}
	
}
