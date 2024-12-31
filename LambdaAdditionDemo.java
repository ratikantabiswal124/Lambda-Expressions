package com.nt;

interface B{
	
	void m1(int x ,int y);
}


public class LambdaAdditionDemo {

	public static void main(String[] args) {

		B b=(x,y)->System.out.println(x+y);
		b.m1(10,20);
		b.m1(30, 40);
		b.m1(50, 60);
	}

}
