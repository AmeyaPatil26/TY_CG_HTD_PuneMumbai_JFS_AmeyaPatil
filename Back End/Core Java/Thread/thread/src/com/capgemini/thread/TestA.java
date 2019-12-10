package com.capgemini.thread;

public class TestA {
	public static void main(String[] args) {
		
		Pen p=new Pen();
		System.out.println("Main Started..");
		p.start();
		
		Pen t=new Pen();
		t.start();
		
		try {
		
			p.join(); //main thread wait until the p thread join
			
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main ended..");
	}

}
