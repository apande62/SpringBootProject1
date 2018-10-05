
package com.akash.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is used for add, delete and update address response
 * 			
 * 
 * <p>Java class for PreferenceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferenceResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseHeader" type="{http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00}HeaderType"/>
 *         &lt;element name="patientId" type="{http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00}Id"/>
 *         &lt;element name="status" type="{http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00}Status"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferenceResponseType", namespace = "http://optumrx.unitedhealthgroup.com/AO/PatientPreferenceAO/v3_00", propOrder = {
    "responseHeader",
    "patientId",
    "status"
})
public class PreferenceResponseType {

    @XmlElement(required = true)
    protected HeaderType responseHeader;
    @XmlElement(required = true)
    protected String patientId;
    @XmlElement(required = true)
    protected Status status;

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setResponseHeader(HeaderType value) {
        this.responseHeader = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

}
