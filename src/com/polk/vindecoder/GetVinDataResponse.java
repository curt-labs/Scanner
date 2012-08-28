
package com.polk.vindecoder;



/**
 * <p>Java class for getVinDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVinDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VinResponse" type="{http://webservice.vindecoder.polk.com/}VinResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class GetVinDataResponse {

    protected VinResponse vinResponse;

    /**
     * Gets the value of the vinResponse property.
     * 
     * @return
     *     possible object is
     *     {@link VinResponse }
     *     
     */
    public VinResponse getVinResponse() {
        return vinResponse;
    }

    /**
     * Sets the value of the vinResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link VinResponse }
     *     
     */
    public void setVinResponse(VinResponse value) {
        this.vinResponse = value;
    }

}
