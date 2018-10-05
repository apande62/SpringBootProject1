
package com.akash.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalledByAndCalledForPatientDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalledByAndCalledForPatientDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calledByPatientId" type="{http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00}Id"/>
 *         &lt;element name="calledForPatientId" type="{http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00}Id"/>
 *         &lt;element name="accessLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalledByAndCalledForPatientDetailsType", propOrder = {
    "calledByPatientId",
    "calledForPatientId",
    "accessLevel"
})
public class CalledByAndCalledForPatientDetailsType {

    @XmlElement(required = true)
    protected String calledByPatientId;
    @XmlElement(required = true)
    protected String calledForPatientId;
    @XmlElement(required = true)
    protected String accessLevel;

    /**
     * Gets the value of the calledByPatientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledByPatientId() {
        return calledByPatientId;
    }

    /**
     * Sets the value of the calledByPatientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledByPatientId(String value) {
        this.calledByPatientId = value;
    }

    /**
     * Gets the value of the calledForPatientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledForPatientId() {
        return calledForPatientId;
    }

    /**
     * Sets the value of the calledForPatientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledForPatientId(String value) {
        this.calledForPatientId = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLevel(String value) {
        this.accessLevel = value;
    }

}
