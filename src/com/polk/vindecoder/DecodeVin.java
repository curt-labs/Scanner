
package com.polk.vindecoder;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for decodeVin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="decodeVin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VinRequest" type="{http://webservice.vindecoder.polk.com/}VinRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequestedFields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class DecodeVin {


    protected List<VinRequest> vinRequest;
    protected String requestedFields;

    /**
     * Gets the value of the vinRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vinRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVinRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VinRequest }
     * 
     * 
     */
    public List<VinRequest> getVinRequest() {
        if (vinRequest == null) {
            vinRequest = new ArrayList<VinRequest>();
        }
        return this.vinRequest;
    }

    /**
     * Gets the value of the requestedFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedFields() {
        return requestedFields;
    }

    /**
     * Sets the value of the requestedFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedFields(String value) {
        this.requestedFields = value;
    }

}
