package com.nt;

interface D{
	void m1(int a,int b);
}

public class LambdaDivisionDemo {

	public static void main(String[] args) {
		
		D d=(a,b)->System.out.println(a/b);
		d.m1(100, 2);
		d.m1(500, 3);
	}
}
