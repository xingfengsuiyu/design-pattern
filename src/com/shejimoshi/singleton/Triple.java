package com.shejimoshi.singleton;

public class Triple {
	public static  Triple triple0 = new Triple();
	public static  Triple triple1 = new Triple();
	public static  Triple triple2 = new Triple();
	private Triple() {
		System.out.println("生成了一个实例");
	}
	public static Triple getInstance(int id) throws Exception{
		switch (id) {
			case  0 :
				return triple0 ;
			case 1:
				return triple1 ;
			case 2:
				return triple2 ;
		}
		return null;
	//	throw new Exception("找不到ID");
	}
}
