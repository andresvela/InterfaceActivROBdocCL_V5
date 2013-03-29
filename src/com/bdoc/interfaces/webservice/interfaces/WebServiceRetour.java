/**
 * WebServiceRetour.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bdoc.interfaces.webservice.interfaces;

public class WebServiceRetour  implements java.io.Serializable {
    private byte[] byteBuffer;

    private int errorCode;

    private java.lang.String errorMessage;

    private int returnType;

    private java.lang.String stringBuffer;

    public WebServiceRetour() {
    }

    public WebServiceRetour(
           byte[] byteBuffer,
           int errorCode,
           java.lang.String errorMessage,
           int returnType,
           java.lang.String stringBuffer) {
           this.byteBuffer = byteBuffer;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.returnType = returnType;
           this.stringBuffer = stringBuffer;
    }


    /**
     * Gets the byteBuffer value for this WebServiceRetour.
     * 
     * @return byteBuffer
     */
    public byte[] getByteBuffer() {
        return byteBuffer;
    }


    /**
     * Sets the byteBuffer value for this WebServiceRetour.
     * 
     * @param byteBuffer
     */
    public void setByteBuffer(byte[] byteBuffer) {
        this.byteBuffer = byteBuffer;
    }


    /**
     * Gets the errorCode value for this WebServiceRetour.
     * 
     * @return errorCode
     */
    public int getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this WebServiceRetour.
     * 
     * @param errorCode
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this WebServiceRetour.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this WebServiceRetour.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the returnType value for this WebServiceRetour.
     * 
     * @return returnType
     */
    public int getReturnType() {
        return returnType;
    }


    /**
     * Sets the returnType value for this WebServiceRetour.
     * 
     * @param returnType
     */
    public void setReturnType(int returnType) {
        this.returnType = returnType;
    }


    /**
     * Gets the stringBuffer value for this WebServiceRetour.
     * 
     * @return stringBuffer
     */
    public java.lang.String getStringBuffer() {
        return stringBuffer;
    }


    /**
     * Sets the stringBuffer value for this WebServiceRetour.
     * 
     * @param stringBuffer
     */
    public void setStringBuffer(java.lang.String stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebServiceRetour)) return false;
        WebServiceRetour other = (WebServiceRetour) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.byteBuffer==null && other.getByteBuffer()==null) || 
             (this.byteBuffer!=null &&
              java.util.Arrays.equals(this.byteBuffer, other.getByteBuffer()))) &&
            this.errorCode == other.getErrorCode() &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            this.returnType == other.getReturnType() &&
            ((this.stringBuffer==null && other.getStringBuffer()==null) || 
             (this.stringBuffer!=null &&
              this.stringBuffer.equals(other.getStringBuffer())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getByteBuffer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getByteBuffer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getByteBuffer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getErrorCode();
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        _hashCode += getReturnType();
        if (getStringBuffer() != null) {
            _hashCode += getStringBuffer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebServiceRetour.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://interfaces.webservice.interfaces.bdoc.com", "WebServiceRetour"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byteBuffer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interfaces.webservice.interfaces.bdoc.com", "byteBuffer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interfaces.webservice.interfaces.bdoc.com", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interfaces.webservice.interfaces.bdoc.com", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interfaces.webservice.interfaces.bdoc.com", "returnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringBuffer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://interfaces.webservice.interfaces.bdoc.com", "stringBuffer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
