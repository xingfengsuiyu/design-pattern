package com.shejimoshi.proxy;

import java.rmi.Remote;

public interface Rocket extends Remote {

	void boost(double factor);

	double getApogee();

	double getPrice();
}
