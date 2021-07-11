package com.shejimoshi.proxy;

import java.rmi.RemoteException;
import java.util.HashSet;
import java.util.Set;

public class ShowDynamicProxy {

	public static void main(String[] args) throws RemoteException {
		Set s = new HashSet();
		s = (Set) ImpatientProxy.newInstance(s);
		s.add(new BadApple("Lemon"));
		System.out.println("The set contains " + s.size() + " things.");

		Rocket b = new CopyOfRocketImpl2(2, 1);
		b = (Rocket) ImpatientProxy.newInstance(b);
		b.boost(10);
		System.out.println("The set contains " + b.getApogee() + " things.");
	}
}
