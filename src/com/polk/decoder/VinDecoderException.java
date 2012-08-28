
/**
 * VinDecoderException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.polk.decoder;

public class VinDecoderException extends java.lang.Exception{

    private static final long serialVersionUID = 1346092391907L;
    
    private VinDecoderServiceStub.VindecoderFaultBeanE faultMessage;

    
        public VinDecoderException() {
            super("VinDecoderException");
        }

        public VinDecoderException(java.lang.String s) {
           super(s);
        }

        public VinDecoderException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public VinDecoderException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(VinDecoderServiceStub.VindecoderFaultBeanE msg){
       faultMessage = msg;
    }
    
    public VinDecoderServiceStub.VindecoderFaultBeanE getFaultMessage(){
       return faultMessage;
    }
}
    