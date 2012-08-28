
package com.polk.vindecoder;



/**
 * <p>Java class for vinPrefixData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vinPrefixData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bodyStyleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bodyStyleDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doorCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="engineCarburetionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="engineCarburetionTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="engineCylinderCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="engineDisplacementCubicCentimeters" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="engineDisplacementCubicInches" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="engineFuelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="engineFuelDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionalTrim1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionalTrim1Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionalTrim2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionalTrim2Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionalTrim3Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionalTrim3Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionalTrim4Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionalTrim4Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plantCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restraintTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restraintTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transmissionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transmissionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trimCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trimDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="truckGrossVehicleWeightRatingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="truckGrossVehicleWeightRatingDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vinPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wheelsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="wheelsDrivenCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class VinPrefixData {

    protected String bodyStyleCode;
    protected String bodyStyleDesc;
    protected Integer doorCount;
    protected String engineCarburetionTypeCode;
    protected String engineCarburetionTypeDesc;
    protected String engineCylinderCount;
    protected Integer engineDisplacementCubicCentimeters;
    protected Integer engineDisplacementCubicInches;
    protected String engineFuelCode;
    protected String engineFuelDesc;
    protected String modelPattern;
    protected String optionalTrim1Code;
    protected String optionalTrim1Desc;
    protected String optionalTrim2Code;
    protected String optionalTrim2Desc;
    protected String optionalTrim3Code;
    protected String optionalTrim3Desc;
    protected String optionalTrim4Code;
    protected String optionalTrim4Desc;
    protected String plantCode;
    protected String restraintTypeCode;
    protected String restraintTypeDesc;
    protected String transmissionCode;
    protected String transmissionDesc;
    protected String trimCode;
    protected String trimDesc;
    protected String truckGrossVehicleWeightRatingCode;
    protected String truckGrossVehicleWeightRatingDesc;
    protected String vehicleTypeCode;
    protected String vinPrefix;
    protected Integer wheelsCount;
    protected Integer wheelsDrivenCount;

    /**
     * Gets the value of the bodyStyleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyStyleCode() {
        return bodyStyleCode;
    }

    /**
     * Sets the value of the bodyStyleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyStyleCode(String value) {
        this.bodyStyleCode = value;
    }

    /**
     * Gets the value of the bodyStyleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyStyleDesc() {
        return bodyStyleDesc;
    }

    /**
     * Sets the value of the bodyStyleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyStyleDesc(String value) {
        this.bodyStyleDesc = value;
    }

    /**
     * Gets the value of the doorCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoorCount() {
        return doorCount;
    }

    /**
     * Sets the value of the doorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoorCount(Integer value) {
        this.doorCount = value;
    }

    /**
     * Gets the value of the engineCarburetionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineCarburetionTypeCode() {
        return engineCarburetionTypeCode;
    }

    /**
     * Sets the value of the engineCarburetionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineCarburetionTypeCode(String value) {
        this.engineCarburetionTypeCode = value;
    }

    /**
     * Gets the value of the engineCarburetionTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineCarburetionTypeDesc() {
        return engineCarburetionTypeDesc;
    }

    /**
     * Sets the value of the engineCarburetionTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineCarburetionTypeDesc(String value) {
        this.engineCarburetionTypeDesc = value;
    }

    /**
     * Gets the value of the engineCylinderCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineCylinderCount() {
        return engineCylinderCount;
    }

    /**
     * Sets the value of the engineCylinderCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineCylinderCount(String value) {
        this.engineCylinderCount = value;
    }

    /**
     * Gets the value of the engineDisplacementCubicCentimeters property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEngineDisplacementCubicCentimeters() {
        return engineDisplacementCubicCentimeters;
    }

    /**
     * Sets the value of the engineDisplacementCubicCentimeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEngineDisplacementCubicCentimeters(Integer value) {
        this.engineDisplacementCubicCentimeters = value;
    }

    /**
     * Gets the value of the engineDisplacementCubicInches property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEngineDisplacementCubicInches() {
        return engineDisplacementCubicInches;
    }

    /**
     * Sets the value of the engineDisplacementCubicInches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEngineDisplacementCubicInches(Integer value) {
        this.engineDisplacementCubicInches = value;
    }

    /**
     * Gets the value of the engineFuelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineFuelCode() {
        return engineFuelCode;
    }

    /**
     * Sets the value of the engineFuelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineFuelCode(String value) {
        this.engineFuelCode = value;
    }

    /**
     * Gets the value of the engineFuelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineFuelDesc() {
        return engineFuelDesc;
    }

    /**
     * Sets the value of the engineFuelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineFuelDesc(String value) {
        this.engineFuelDesc = value;
    }

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
     * Gets the value of the optionalTrim1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalTrim1Code() {
        return optionalTrim1Code;
    }

    /**
     * Sets the value of the optionalTrim1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalTrim1Code(String value) {
        this.optionalTrim1Code = value;
    }

    /**
     * Gets the value of the optionalTrim1Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalTrim1Desc() {
        return optionalTrim1Desc;
    }

    /**
     * Sets the value of the optionalTrim1Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalTrim1Desc(String value) {
        this.optionalTrim1Desc = value;
    }

    /**
     * Gets the value of the optionalTrim2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalTrim2Code() {
        return optionalTrim2Code;
    }

    /**
     * Sets the value of the optionalTrim2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalTrim2Code(String value) {
        this.optionalTrim2Code = value;
    }

    /**
     * Gets the value of the optionalTrim2Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalTrim2Desc() {
        return optionalTrim2Desc;
    }

    /**
     * Sets the value of the optionalTrim2Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalTrim2Desc(String value) {
        this.optionalTrim2Desc = value;
    }

    /**
     * Gets the value of the optionalTrim3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalTrim3Code() {
        return optionalTrim3Code;
    }

    /**
     * Sets the value of the optionalTrim3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalTrim3Code(String value) {
        this.optionalTrim3Code = value;
    }

    /**
     * Gets the value of the optionalTrim3Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalTrim3Desc() {
        return optionalTrim3Desc;
    }

    /**
     * Sets the value of the optionalTrim3Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalTrim3Desc(String value) {
        this.optionalTrim3Desc = value;
    }

    /**
     * Gets the value of the optionalTrim4Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalTrim4Code() {
        return optionalTrim4Code;
    }

    /**
     * Sets the value of the optionalTrim4Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalTrim4Code(String value) {
        this.optionalTrim4Code = value;
    }

    /**
     * Gets the value of the optionalTrim4Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalTrim4Desc() {
        return optionalTrim4Desc;
    }

    /**
     * Sets the value of the optionalTrim4Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalTrim4Desc(String value) {
        this.optionalTrim4Desc = value;
    }

    /**
     * Gets the value of the plantCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantCode() {
        return plantCode;
    }

    /**
     * Sets the value of the plantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantCode(String value) {
        this.plantCode = value;
    }

    /**
     * Gets the value of the restraintTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestraintTypeCode() {
        return restraintTypeCode;
    }

    /**
     * Sets the value of the restraintTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestraintTypeCode(String value) {
        this.restraintTypeCode = value;
    }

    /**
     * Gets the value of the restraintTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestraintTypeDesc() {
        return restraintTypeDesc;
    }

    /**
     * Sets the value of the restraintTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestraintTypeDesc(String value) {
        this.restraintTypeDesc = value;
    }

    /**
     * Gets the value of the transmissionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionCode() {
        return transmissionCode;
    }

    /**
     * Sets the value of the transmissionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionCode(String value) {
        this.transmissionCode = value;
    }

    /**
     * Gets the value of the transmissionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionDesc() {
        return transmissionDesc;
    }

    /**
     * Sets the value of the transmissionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionDesc(String value) {
        this.transmissionDesc = value;
    }

    /**
     * Gets the value of the trimCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrimCode() {
        return trimCode;
    }

    /**
     * Sets the value of the trimCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrimCode(String value) {
        this.trimCode = value;
    }

    /**
     * Gets the value of the trimDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrimDesc() {
        return trimDesc;
    }

    /**
     * Sets the value of the trimDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrimDesc(String value) {
        this.trimDesc = value;
    }

    /**
     * Gets the value of the truckGrossVehicleWeightRatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruckGrossVehicleWeightRatingCode() {
        return truckGrossVehicleWeightRatingCode;
    }

    /**
     * Sets the value of the truckGrossVehicleWeightRatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruckGrossVehicleWeightRatingCode(String value) {
        this.truckGrossVehicleWeightRatingCode = value;
    }

    /**
     * Gets the value of the truckGrossVehicleWeightRatingDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruckGrossVehicleWeightRatingDesc() {
        return truckGrossVehicleWeightRatingDesc;
    }

    /**
     * Sets the value of the truckGrossVehicleWeightRatingDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruckGrossVehicleWeightRatingDesc(String value) {
        this.truckGrossVehicleWeightRatingDesc = value;
    }

    /**
     * Gets the value of the vehicleTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleTypeCode() {
        return vehicleTypeCode;
    }

    /**
     * Sets the value of the vehicleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleTypeCode(String value) {
        this.vehicleTypeCode = value;
    }

    /**
     * Gets the value of the vinPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVinPrefix() {
        return vinPrefix;
    }

    /**
     * Sets the value of the vinPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVinPrefix(String value) {
        this.vinPrefix = value;
    }

    /**
     * Gets the value of the wheelsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWheelsCount() {
        return wheelsCount;
    }

    /**
     * Sets the value of the wheelsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWheelsCount(Integer value) {
        this.wheelsCount = value;
    }

    /**
     * Gets the value of the wheelsDrivenCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWheelsDrivenCount() {
        return wheelsDrivenCount;
    }

    /**
     * Sets the value of the wheelsDrivenCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWheelsDrivenCount(Integer value) {
        this.wheelsDrivenCount = value;
    }

}
