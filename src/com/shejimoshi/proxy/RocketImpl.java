package com.shejimoshi.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RocketImpl extends UnicastRemoteObject implements Rocket {

	protected double price;
	protected double apogee;

	protected RocketImpl(double price, double apogee) throws RemoteException {
		this.price = price;
		this.apogee = apogee;
	}


	@Override
	public void boost(double factor) {
		// TODO Auto-generated method stub
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

}
