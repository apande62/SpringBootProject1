
package com.akash.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestHeader" type="{http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00}HeaderType"/>
 *         &lt;element name="patientId" type="{http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00}Id"/>
 *         &lt;element name="includeInactivePatients" type="{http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00}YesNoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestHeader",
    "patientId",
    "includeInactivePatients"
})
@XmlRootElement(name = "getPatientPreferenceRequest", namespace = "http://optumrx.unitedhealthgroup.com/AM/PatientPreferenceAM/v3_00")
public class GetPatientPreferenceRequest {

    @XmlElement(namespace = "http://optumrx.unitedhealthgroup.com/AM/PatientPreferenceAM/v3_00", required = true)
    protected HeaderType requestHeader;
    @XmlElement(namespace = "http://optumrx.unitedhealthgroup.com/AM/PatientPreferenceAM/v3_00", required = true)
    protected String patientId;
    @XmlElement(namespace = "http://optumrx.unitedhealthgroup.com/AM/PatientPreferenceAM/v3_00", defaultValue = "N")
    protected YesNoType includeInactivePatients;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setRequestHeader(HeaderType value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the patientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * Sets the value of the patientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientId(String value) {
        this.patientId = value;
    }

    /**
     * Gets the value of the includeInactivePatients property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getIncludeInactivePatients() {
        return includeInactivePatients;
    }

    /**
     * Sets the value of the includeInactivePatients property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setIncludeInactivePatients(YesNoType value) {
        this.includeInactivePatients = value;
    }

}
