
package com.polk.vindecoder;

import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.polk.vindecoder.webservice.clientgen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory {

    private final static QName _GetPriceAndSpecData_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getPriceAndSpecData");
    private final static QName _GetRvDataResponse_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getRvDataResponse");
    private final static QName _GetPriceAndSpecDataResponse_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getPriceAndSpecDataResponse");
    private final static QName _DecodeVinResponse_QNAME = new QName("http://webservice.vindecoder.polk.com/", "decodeVinResponse");
    private final static QName _VindecoderFaultBean_QNAME = new QName("http://webservice.vindecoder.polk.com/", "VindecoderFaultBean");
    private final static QName _GetYears_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getYears");
    private final static QName _GetModelsResponse_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getModelsResponse");
    private final static QName _GetVinData_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getVinData");
    private final static QName _GetModels_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getModels");
    private final static QName _GetVinPrefixes_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getVinPrefixes");
    private final static QName _GetVinPrefixesResponse_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getVinPrefixesResponse");
    private final static QName _DecodeVin_QNAME = new QName("http://webservice.vindecoder.polk.com/", "decodeVin");
    private final static QName _GetVehicleTypes_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getVehicleTypes");
    private final static QName _GetYearsResponse_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getYearsResponse");
    private final static QName _GetVinDataResponse_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getVinDataResponse");
    private final static QName _GetMakes_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getMakes");
    private final static QName _GetVehicleTypesResponse_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getVehicleTypesResponse");
    private final static QName _GetRvData_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getRvData");
    private final static QName _GetMakesResponse_QNAME = new QName("http://webservice.vindecoder.polk.com/", "getMakesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.polk.vindecoder.webservice.clientgen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OptionalFields }
     * 
     */
    public OptionalFields createOptionalFields() {
        return new OptionalFields();
    }

    /**
     * Create an instance of {@link DecodeVin }
     * 
     */
    public DecodeVin createDecodeVin() {
        return new DecodeVin();
    }

    /**
     * Create an instance of {@link PSRequest }
     * 
     */
    public PSRequest createPSRequest() {
        return new PSRequest();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link GetVehicleTypesResponse }
     * 
     */
    public GetVehicleTypesResponse createGetVehicleTypesResponse() {
        return new GetVehicleTypesResponse();
    }

    /**
     * Create an instance of {@link GetModelsResponse }
     * 
     */
    public GetModelsResponse createGetModelsResponse() {
        return new GetModelsResponse();
    }

    /**
     * Create an instance of {@link GetPriceAndSpecData }
     * 
     */
    public GetPriceAndSpecData createGetPriceAndSpecData() {
        return new GetPriceAndSpecData();
    }

    /**
     * Create an instance of {@link GetYearsResponse }
     * 
     */
    public GetYearsResponse createGetYearsResponse() {
        return new GetYearsResponse();
    }

    /**
     * Create an instance of {@link VinPrefixData }
     * 
     */
    public VinPrefixData createVinPrefixData() {
        return new VinPrefixData();
    }

    /**
     * Create an instance of {@link VinResponse }
     * 
     */
    public VinResponse createVinResponse() {
        return new VinResponse();
    }

    /**
     * Create an instance of {@link GetRvData }
     * 
     */
    public GetRvData createGetRvData() {
        return new GetRvData();
    }

    /**
     * Create an instance of {@link VindecoderFaultBean }
     * 
     */
    public VindecoderFaultBean createVindecoderFaultBean() {
        return new VindecoderFaultBean();
    }

    /**
     * Create an instance of {@link GetVinDataResponse }
     * 
     */
    public GetVinDataResponse createGetVinDataResponse() {
        return new GetVinDataResponse();
    }

    /**
     * Create an instance of {@link GetMakesResponse }
     * 
     */
    public GetMakesResponse createGetMakesResponse() {
        return new GetMakesResponse();
    }

    /**
     * Create an instance of {@link GetRvDataResponse }
     * 
     */
    public GetRvDataResponse createGetRvDataResponse() {
        return new GetRvDataResponse();
    }

    /**
     * Create an instance of {@link GetVinPrefixesResponse }
     * 
     */
    public GetVinPrefixesResponse createGetVinPrefixesResponse() {
        return new GetVinPrefixesResponse();
    }

    /**
     * Create an instance of {@link GetVinData }
     * 
     */
    public GetVinData createGetVinData() {
        return new GetVinData();
    }

    /**
     * Create an instance of {@link Model }
     * 
     */
    public Model createModel() {
        return new Model();
    }

    /**
     * Create an instance of {@link GetYears }
     * 
     */
    public GetYears createGetYears() {
        return new GetYears();
    }

    /**
     * Create an instance of {@link Make }
     * 
     */
    public Make createMake() {
        return new Make();
    }

    /**
     * Create an instance of {@link GetVinPrefixes }
     * 
     */
    public GetVinPrefixes createGetVinPrefixes() {
        return new GetVinPrefixes();
    }

    /**
     * Create an instance of {@link GetVehicleTypes }
     * 
     */
    public GetVehicleTypes createGetVehicleTypes() {
        return new GetVehicleTypes();
    }

    /**
     * Create an instance of {@link GetMakes }
     * 
     */
    public GetMakes createGetMakes() {
        return new GetMakes();
    }

    /**
     * Create an instance of {@link GetPriceAndSpecDataResponse }
     * 
     */
    public GetPriceAndSpecDataResponse createGetPriceAndSpecDataResponse() {
        return new GetPriceAndSpecDataResponse();
    }

    /**
     * Create an instance of {@link VinRequest }
     * 
     */
    public VinRequest createVinRequest() {
        return new VinRequest();
    }

    /**
     * Create an instance of {@link DecodeVinResponse }
     * 
     */
    public DecodeVinResponse createDecodeVinResponse() {
        return new DecodeVinResponse();
    }

    /**
     * Create an instance of {@link GetModels }
     * 
     */
    public GetModels createGetModels() {
        return new GetModels();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceAndSpecData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vindecoder.polk.com/", name = "getPriceAndSpecData")
    public JAXBElement<GetPriceAndSpecData> createGetPriceAndSpecData(GetPriceAndSpecData value) {
        return new JAXBElement<GetPriceAndSpecData>(_GetPriceAndSpecData_QNAME, GetPriceAndSpecData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRvDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vindecoder.polk.com/", name = "getRvDataResponse")
    public JAXBElement<GetRvDataResponse> createGetRvDataResponse(GetRvDataResponse value) {
        return new JAXBElement<GetRvDataResponse>(_GetRvDataResponse_QNAME, GetRvDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceAndSpecDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vindecoder.polk.com/", name = "getPriceAndSpecDataResponse")
    public JAXBElement<GetPriceAndSpecDataResponse> createGetPriceAndSpecDataResponse(GetPriceAndSpecDataResponse value) {
        return new JAXBElement<GetPriceAndSpecDataResponse>(_GetPriceAndSpecDataResponse_QNAME, GetPriceAndSpecDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecodeVinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vindecoder.polk.com/", name = "decodeVinResponse")
    public JAXBElement<DecodeVinResponse> createDecodeVinResponse(DecodeVinResponse value) {
        return new JAXBElement<DecodeVinResponse>(_DecodeVinResponse_QNAME, DecodeVinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VindecoderFaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vindecoder.polk.com/", name = "VindecoderFaultBean")
    public JAXBElement<VindecoderFaultBean> createVindecoderFaultBean(VindecoderFaultBean value) {
        return new JAXBElement<VindecoderFaultBean>(_VindecoderFaultBean_QNAME, VindecoderFaultBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetYears }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vindecoder.polk.com/", name = "getYears")
    public JAXBElement<GetYears> createGetYears(GetYears value) {
        return new JAXBElement<GetYears>(_GetYears_QNAME, GetYears.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vindecoder.polk.com/", name = "getModelsResponse")
    public JAXBElement<GetModelsResponse> createGetModelsResponse(GetModelsResponse value) {
        return new JAXBElement<GetModelsResponse>(_GetModelsResponse_QNAME, GetModelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVinData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vindecoder.polk.com/", name = "getVinData")
    public JAXBElement<GetVinData> createGetVinData(GetVinData value) {
        return new JAXBElement<GetVinData>(_GetVinData_QNAME, GetVinData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModels }{@code >}}
     * 
     */
    public JAXBElement<GetModels> createGetModels(GetModels value) {
        return new JAXBElement<GetModels>(_GetModels_QNAME, GetModels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVinPrefixes }{@code >}}
     * 
     */
    public JAXBElement<GetVinPrefixes> createGetVinPrefixes(GetVinPrefixes value) {
        return new JAXBElement<GetVinPrefixes>(_GetVinPrefixes_QNAME, GetVinPrefixes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVinPrefixesResponse }{@code >}}
     * 
     */
    public JAXBElement<GetVinPrefixesResponse> createGetVinPrefixesResponse(GetVinPrefixesResponse value) {
        return new JAXBElement<GetVinPrefixesResponse>(_GetVinPrefixesResponse_QNAME, GetVinPrefixesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecodeVin }{@code >}}
     * 
     */
    public JAXBElement<DecodeVin> createDecodeVin(DecodeVin value) {
        return new JAXBElement<DecodeVin>(_DecodeVin_QNAME, DecodeVin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleTypes }{@code >}}
     * 
     */
    public JAXBElement<GetVehicleTypes> createGetVehicleTypes(GetVehicleTypes value) {
        return new JAXBElement<GetVehicleTypes>(_GetVehicleTypes_QNAME, GetVehicleTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetYearsResponse }{@code >}}
     * 
     */
    public JAXBElement<GetYearsResponse> createGetYearsResponse(GetYearsResponse value) {
        return new JAXBElement<GetYearsResponse>(_GetYearsResponse_QNAME, GetYearsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVinDataResponse }{@code >}}
     * 
     */
    public JAXBElement<GetVinDataResponse> createGetVinDataResponse(GetVinDataResponse value) {
        return new JAXBElement<GetVinDataResponse>(_GetVinDataResponse_QNAME, GetVinDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMakes }{@code >}}
     * 
     */
    public JAXBElement<GetMakes> createGetMakes(GetMakes value) {
        return new JAXBElement<GetMakes>(_GetMakes_QNAME, GetMakes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleTypesResponse }{@code >}}
     * 
     */
    public JAXBElement<GetVehicleTypesResponse> createGetVehicleTypesResponse(GetVehicleTypesResponse value) {
        return new JAXBElement<GetVehicleTypesResponse>(_GetVehicleTypesResponse_QNAME, GetVehicleTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRvData }{@code >}}
     * 
     */
    public JAXBElement<GetRvData> createGetRvData(GetRvData value) {
        return new JAXBElement<GetRvData>(_GetRvData_QNAME, GetRvData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMakesResponse }{@code >}}
     * 
     */
    public JAXBElement<GetMakesResponse> createGetMakesResponse(GetMakesResponse value) {
        return new JAXBElement<GetMakesResponse>(_GetMakesResponse_QNAME, GetMakesResponse.class, null, value);
    }

}
