
package com.polk.vindecoder;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for getMakesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMakesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Make" type="{http://webservice.vindecoder.polk.com/}make" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class GetMakesResponse {

    protected List<Make> make;

    /**
     * Gets the value of the make property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the make property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMake().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Make }
     * 
     * 
     */
    public List<Make> getMake() {
        if (make == null) {
            make = new ArrayList<Make>();
        }
        return this.make;
    }

}
