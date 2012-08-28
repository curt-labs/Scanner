
package com.polk.vindecoder;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for getPriceAndSpecDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPriceAndSpecDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VinResponse" type="{http://webservice.vindecoder.polk.com/}VinResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class GetPriceAndSpecDataResponse {

    protected List<VinResponse> vinResponse;

    /**
     * Gets the value of the vinResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vinResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVinResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VinResponse }
     * 
     * 
     */
    public List<VinResponse> getVinResponse() {
        if (vinResponse == null) {
            vinResponse = new ArrayList<VinResponse>();
        }
        return this.vinResponse;
    }

}
