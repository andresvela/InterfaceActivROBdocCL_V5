package com.bdoc.interfaces.webservice.interfaces;

public class DocumentGenerationImplProxy implements com.bdoc.interfaces.webservice.interfaces.DocumentGenerationImpl {
  private String _endpoint = null;
  private com.bdoc.interfaces.webservice.interfaces.DocumentGenerationImpl documentGenerationImpl = null;
  
  public DocumentGenerationImplProxy() {
    _initDocumentGenerationImplProxy();
  }
  
  public DocumentGenerationImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initDocumentGenerationImplProxy();
  }
  
  private void _initDocumentGenerationImplProxy() {
    try {
      documentGenerationImpl = (new com.bdoc.interfaces.webservice.interfaces.DocumentGenerationImplServiceLocator()).getDocumentGenerationImpl();
      if (documentGenerationImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)documentGenerationImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)documentGenerationImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (documentGenerationImpl != null)
      ((javax.xml.rpc.Stub)documentGenerationImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bdoc.interfaces.webservice.interfaces.DocumentGenerationImpl getDocumentGenerationImpl() {
    if (documentGenerationImpl == null)
      _initDocumentGenerationImplProxy();
    return documentGenerationImpl;
  }
  
  public com.bdoc.interfaces.webservice.interfaces.WebServiceRetour generate(byte[] xmlFlow) throws java.rmi.RemoteException{
    if (documentGenerationImpl == null)
      _initDocumentGenerationImplProxy();
    return documentGenerationImpl.generate(xmlFlow);
  }
  
  public com.bdoc.interfaces.webservice.interfaces.WebServiceRetour getDocument(java.lang.String numeroEdition) throws java.rmi.RemoteException{
    if (documentGenerationImpl == null)
      _initDocumentGenerationImplProxy();
    return documentGenerationImpl.getDocument(numeroEdition);
  }
  
  public com.bdoc.interfaces.webservice.interfaces.WebServiceRetour getRessourcesList(java.lang.String bdocWebProfileName) throws java.rmi.RemoteException{
    if (documentGenerationImpl == null)
      _initDocumentGenerationImplProxy();
    return documentGenerationImpl.getRessourcesList(bdocWebProfileName);
  }
  
  public com.bdoc.interfaces.webservice.interfaces.WebServiceRetour generateBatch(byte[] xmlFlow) throws java.rmi.RemoteException{
    if (documentGenerationImpl == null)
      _initDocumentGenerationImplProxy();
    return documentGenerationImpl.generateBatch(xmlFlow);
  }
  
  public com.bdoc.interfaces.webservice.interfaces.WebServiceRetour getDocumentMultiIndex(java.lang.String[] indexList) throws java.rmi.RemoteException{
    if (documentGenerationImpl == null)
      _initDocumentGenerationImplProxy();
    return documentGenerationImpl.getDocumentMultiIndex(indexList);
  }
  
  
}