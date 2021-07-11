package com.shejimoshi.singleton;

/**
 * 单例模式的三个要点：1.某个类只能有一个实例，2.他必须自行创建这个实例，3.他必须自行向整个系统提供这个实例
 * 1.请问如何避免其他开发人员在使用我们的类时创建多个新的实例？
 * 答：构造函数私有化，类自己创建实例，使用同步，使用饿汉模式，或者枚举类
 * 2.请问为什么有时候需要使用滞后初始化，而不是在字段声明的时候初始化单例对象
 * 答：如果初始化实例很消耗资源，则应该使用滞后初始化。
 * <p>
 * 3.单例模式七种写法
 */


public class Singleton {

	private static Singleton singleton;

	private Singleton() {

	}

	/**
	 * 单例模式七种写法：1.懒汉，线程不安全
	 */
	public static Singleton getSingleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	/**
	 * 单例模式七种写法：2.懒汉，线程安全
	 */
	public static synchronized Singleton getSingleton2() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	/**
	 * 单例模式七种写法：3.饿汉
	 */
	private static Singleton singleton3 = new Singleton();

	public static Singleton getFacotory3() {
		return singleton3;
	}

	/**
	 * 单例模式七种写法：4.饿汉,变种
	 */
	private static Singleton singleton4 = null;

	static {
		singleton4 = new Singleton();
	}

	public static Singleton getFacotory4() {
		return singleton4;
	}

	/**
	 * 单例模式七种写法：5.静态内部类
	 */
	private static class Singleton5 {
		private static final Singleton singleton5 = new Singleton();

		public static final Singleton getFactor5() {
			return Singleton5.singleton5;
		}
	}

	/**
	 * 单例模式七种写法：6.枚举
	 */
	public enum Singleton6 {
		INATANCE,
		singleton7,
		singleton6 {
			public String getType() {
				return "I will not tell you";
			}
		};

		public String getType() {
			return "I will  tell you";
		}
	}

	/**
	 * 单例模式七种写法：7.双重锁
	 */
	private volatile static Singleton singleton7;

	public static Singleton getSingleton7() {
		if (singleton7 == null) {
			synchronized (Singleton.class) {
				if (singleton7 == null) {
					singleton7 = new Singleton();
				}
			}
		}
		return singleton7;
	}

	public static void main(String[] args) {
		System.out.println(Singleton6.singleton7.getType());
		System.out.println(Singleton6.singleton6.getType());
		System.out.println(Singleton6.INATANCE == Singleton6.INATANCE);
	}
}
