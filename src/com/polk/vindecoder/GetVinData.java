
package com.polk.vindecoder;



/**
 * <p>Java class for getVinData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVinData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModelPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedFields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class GetVinData {

    protected String modelPattern;
    protected String requestedFields;

    /**
     * Gets the value of the modelPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelPattern() {
        return modelPattern;
    }

    /**
     * Sets the value of the modelPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelPattern(String value) {
        this.modelPattern = value;
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
