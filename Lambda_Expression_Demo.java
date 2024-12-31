package com.nt;

interface A{
	void m1();
}

public class Lambda_Expression_Demo{

	public static void main(String[] args) {
		A a=()->System.out.println("Hello Pookie..... ");
		a.m1();
	}
}
