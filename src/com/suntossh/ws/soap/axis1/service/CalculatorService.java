/**
 * CalculatorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.suntossh.ws.soap.axis1.service;

public interface CalculatorService extends java.rmi.Remote {
    public int sub(int x, int y) throws java.rmi.RemoteException;
    public int add(int x, int y) throws java.rmi.RemoteException;
    public java.lang.String testService(java.lang.String yourName) throws java.rmi.RemoteException;
}
