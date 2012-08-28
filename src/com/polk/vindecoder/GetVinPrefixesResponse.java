
package com.polk.vindecoder;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for getVinPrefixesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVinPrefixesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VinPrefix" type="{http://webservice.vindecoder.polk.com/}vinPrefixData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class GetVinPrefixesResponse {

    protected List<VinPrefixData> vinPrefix;

    /**
     * Gets the value of the vinPrefix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vinPrefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVinPrefix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VinPrefixData }
     * 
     * 
     */
    public List<VinPrefixData> getVinPrefix() {
        if (vinPrefix == null) {
            vinPrefix = new ArrayList<VinPrefixData>();
        }
        return this.vinPrefix;
    }

}
