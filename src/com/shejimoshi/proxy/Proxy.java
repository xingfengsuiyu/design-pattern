package com.shejimoshi.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.rmi.RemoteException;

/**
 * Proxy模式的意图在于为对象提供一个代理或者占位，来控制该对象的访问
 * <p>
 * 构建动态代理：需要截获接口的列表，类加载器，当捕获调用时希望执行的类
 * <p>
 * 在动态代理中包装某对象时，对被包装对象的调用会转发给动态代理对象的invoke()操作，invoke()方法会继续把这个调用转发给被包装对象。
 * <p>
 * 动态代理技术使你能够使用代理对象包装其他对象、截获对被包装对象的调用、在调用传递前和传递后增加其他操作等，这样可以比较随意的给任何对象
 * 增加可复用性的行为，从这点来讲与AOP非常相似。
 * <p>
 * 如果某对象的类可实现要截获的接口，可以使用动态代理包装该对象，增加自己的处理逻辑，以增强或替换被包装对象代码的功能。
 */
public class Proxy implements InvocationHandler {

	public static void main(String[] args) throws RemoteException {
		CopyOfRocketImpl2 obj = new CopyOfRocketImpl2(0, 0);
		Class[] classes = obj.getClass().getInterfaces();//为创建动态代理必须具有要截获的接口列表。
		for (int i = 0; i < classes.length; i++) {
			for (int j = 0; j < classes[i].getMethods().length; j++) {
				System.out.println(classes[i].getMethods()[j]);
			}
		}
		ClassLoader loader = obj.getClass().getClassLoader();//类加载器
		System.out.println(loader);

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)//代理对象必须实现InvocationHandler接口的类实例
			throws Throwable {
		method.invoke(CopyOfRocketImpl2.class, args);
		return null;
	}
}
