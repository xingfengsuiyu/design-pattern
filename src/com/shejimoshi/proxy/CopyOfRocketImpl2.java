package com.shejimoshi.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CopyOfRocketImpl2 implements Rocket, TestInterface {

	protected double price;
	protected double apogee;

	protected CopyOfRocketImpl2(double price, double apogee) throws RemoteException {
		this.price = price;
		this.apogee = apogee;
	}


	@Override
	public void boost(double factor) {
		apogee *= factor;
	}

	@Override
	public double getApogee() {
		// TODO Auto-generated method stub
		return apogee;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}


	@Override
	public void getString() {
		// TODO Auto-generated method stub

	}


	@Override
	public void getInt() {
		// TODO Auto-generated method stub

	}


	@Override
	public void getDouble() {
		// TODO Auto-generated method stub

	}

}
