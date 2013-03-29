/**
 * DocumentGenerationImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bdoc.interfaces.webservice.interfaces;

public interface DocumentGenerationImpl extends java.rmi.Remote {
    public com.bdoc.interfaces.webservice.interfaces.WebServiceRetour generate(byte[] xmlFlow) throws java.rmi.RemoteException;
    public com.bdoc.interfaces.webservice.interfaces.WebServiceRetour getDocument(java.lang.String numeroEdition) throws java.rmi.RemoteException;
    public com.bdoc.interfaces.webservice.interfaces.WebServiceRetour getRessourcesList(java.lang.String bdocWebProfileName) throws java.rmi.RemoteException;
    public com.bdoc.interfaces.webservice.interfaces.WebServiceRetour generateBatch(byte[] xmlFlow) throws java.rmi.RemoteException;
    public com.bdoc.interfaces.webservice.interfaces.WebServiceRetour getDocumentMultiIndex(java.lang.String[] indexList) throws java.rmi.RemoteException;
}
