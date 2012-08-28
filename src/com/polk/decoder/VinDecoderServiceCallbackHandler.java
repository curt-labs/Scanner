
/**
 * VinDecoderServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.polk.decoder;

    /**
     *  VinDecoderServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class VinDecoderServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public VinDecoderServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public VinDecoderServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getYears method
            * override this method for handling normal response from getYears operation
            */
           public void receiveResultgetYears(
                    VinDecoderServiceStub.GetYearsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYears operation
           */
            public void receiveErrorgetYears(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getModels method
            * override this method for handling normal response from getModels operation
            */
           public void receiveResultgetModels(
                    VinDecoderServiceStub.GetModelsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getModels operation
           */
            public void receiveErrorgetModels(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMakes method
            * override this method for handling normal response from getMakes operation
            */
           public void receiveResultgetMakes(
                    VinDecoderServiceStub.GetMakesResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMakes operation
           */
            public void receiveErrorgetMakes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for decodeVin method
            * override this method for handling normal response from decodeVin operation
            */
           public void receiveResultdecodeVin(
                    VinDecoderServiceStub.DecodeVinResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from decodeVin operation
           */
            public void receiveErrordecodeVin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getVehicleTypes method
            * override this method for handling normal response from getVehicleTypes operation
            */
           public void receiveResultgetVehicleTypes(
                    VinDecoderServiceStub.GetVehicleTypesResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getVehicleTypes operation
           */
            public void receiveErrorgetVehicleTypes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getVinPrefixes method
            * override this method for handling normal response from getVinPrefixes operation
            */
           public void receiveResultgetVinPrefixes(
                    VinDecoderServiceStub.GetVinPrefixesResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getVinPrefixes operation
           */
            public void receiveErrorgetVinPrefixes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRvData method
            * override this method for handling normal response from getRvData operation
            */
           public void receiveResultgetRvData(
                    VinDecoderServiceStub.GetRvDataResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRvData operation
           */
            public void receiveErrorgetRvData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getVinData method
            * override this method for handling normal response from getVinData operation
            */
           public void receiveResultgetVinData(
                    VinDecoderServiceStub.GetVinDataResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getVinData operation
           */
            public void receiveErrorgetVinData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPriceAndSpecData method
            * override this method for handling normal response from getPriceAndSpecData operation
            */
           public void receiveResultgetPriceAndSpecData(
                    VinDecoderServiceStub.GetPriceAndSpecDataResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPriceAndSpecData operation
           */
            public void receiveErrorgetPriceAndSpecData(java.lang.Exception e) {
            }
                


    }
    