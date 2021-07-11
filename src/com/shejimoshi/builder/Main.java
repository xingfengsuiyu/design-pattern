package com.shejimoshi.builder;

/**
 * @author zc
 * @create 2018-09-06 21:08
 **/
public class Main {
Object
	public static void main(String[] args) {
		StringBuilder s1	 = new StringBuilder("abc");
		StringBuilder s2 = new StringBuilder("def");
		change(s1,s2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

	private static void change(StringBuilder s1, StringBuilder s2) {
		s2 = s1;
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		s1 = new StringBuilder("new world");
		s2.append("new world");
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}
}
