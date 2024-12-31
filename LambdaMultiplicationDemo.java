package com.nt;

interface C{
	void m1(int a,int b);
}

public class LambdaMultiplicationDemo {

	public static void main(String [] args) {
		
		C c=(a,b)->System.out.println(a*b);
		c.m1(10, 10);
		c.m1(20, 2);
		c.m1(30, 3);
	}
}
