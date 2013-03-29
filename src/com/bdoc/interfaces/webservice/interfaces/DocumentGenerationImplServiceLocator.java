/**
 * DocumentGenerationImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bdoc.interfaces.webservice.interfaces;

public class DocumentGenerationImplServiceLocator extends org.apache.axis.client.Service implements com.bdoc.interfaces.webservice.interfaces.DocumentGenerationImplService {

    public DocumentGenerationImplServiceLocator() {
    }


    public DocumentGenerationImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DocumentGenerationImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DocumentGenerationImpl
    private java.lang.String DocumentGenerationImpl_address = "http://localhost:8080/InterfaceActivROBdoc/services/DocumentGenerationImpl";

    public java.lang.String getDocumentGenerationImplAddress() {
        return DocumentGenerationImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DocumentGenerationImplWSDDServiceName = "DocumentGenerationImpl";

    public java.lang.String getDocumentGenerationImplWSDDServiceName() {
        return DocumentGenerationImplWSDDServiceName;
    }

    public void setDocumentGenerationImplWSDDServiceName(java.lang.String name) {
        DocumentGenerationImplWSDDServiceName = name;
    }

    public com.bdoc.interfaces.webservice.interfaces.DocumentGenerationImpl getDocumentGenerationImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DocumentGenerationImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDocumentGenerationImpl(endpoint);
    }

    public com.bdoc.interfaces.webservice.interfaces.DocumentGenerationImpl getDocumentGenerationImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bdoc.interfaces.webservice.interfaces.DocumentGenerationImplSoapBindingStub _stub = new com.bdoc.interfaces.webservice.interfaces.DocumentGenerationImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getDocumentGenerationImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDocumentGenerationImplEndpointAddress(java.lang.String address) {
        DocumentGenerationImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bdoc.interfaces.webservice.interfaces.DocumentGenerationImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bdoc.interfaces.webservice.interfaces.DocumentGenerationImplSoapBindingStub _stub = new com.bdoc.interfaces.webservice.interfaces.DocumentGenerationImplSoapBindingStub(new java.net.URL(DocumentGenerationImpl_address), this);
                _stub.setPortName(getDocumentGenerationImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DocumentGenerationImpl".equals(inputPortName)) {
            return getDocumentGenerationImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://interfaces.webservice.interfaces.bdoc.com", "DocumentGenerationImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://interfaces.webservice.interfaces.bdoc.com", "DocumentGenerationImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DocumentGenerationImpl".equals(portName)) {
            setDocumentGenerationImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
