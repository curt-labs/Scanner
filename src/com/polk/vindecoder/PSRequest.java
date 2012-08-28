
package com.polk.vindecoder;



/**
 * <p>Java class for PSRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelPattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class PSRequest {

    protected String modelPattern;
    protected String trim;

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
     * Gets the value of the trim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrim() {
        return trim;
    }

    /**
     * Sets the value of the trim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrim(String value) {
        this.trim = value;
    }

}
