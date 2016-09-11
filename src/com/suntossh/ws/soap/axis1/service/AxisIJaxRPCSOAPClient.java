/*
 * 
 */
package com.suntossh.ws.soap.axis1.service;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.rmi.RemoteException;

public class AxisIJaxRPCSOAPClient {

	/**
	 * @param args
	 * @throws URISyntaxException
	 * @throws MalformedURLException
	 * @throws RemoteException
	 */
	public static void main(String[] args) throws URISyntaxException, MalformedURLException, RemoteException {

		java.net.URL endpointUrl = new URL("http://localhost:8080/soapserviceaxis1/services/CalculatorService");
		org.apache.axis.client.Service service = new org.apache.axis.client.Service();
		CalculatorServiceSoapBindingStub stub = new CalculatorServiceSoapBindingStub(endpointUrl, service);
		System.out.println(stub.testService("Suntossh"));
		System.out.println(stub.add(10, 20));
		System.out.println(stub.sub(7, 5));

	}

}
