
package com.akash.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Reusable type used to transmit filter data.
 * 			
 * 
 * <p>Java class for FilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="startsWith" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endsWith" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contains" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="equals" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterType", propOrder = {
    "startsWith",
    "endsWith",
    "contains",
    "equals"
})
public class FilterType {

    protected String startsWith;
    protected String endsWith;
    protected String contains;
    protected String equals;

    /**
     * Gets the value of the startsWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartsWith() {
        return startsWith;
    }

    /**
     * Sets the value of the startsWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartsWith(String value) {
        this.startsWith = value;
    }

    /**
     * Gets the value of the endsWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndsWith() {
        return endsWith;
    }

    /**
     * Sets the value of the endsWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndsWith(String value) {
        this.endsWith = value;
    }

    /**
     * Gets the value of the contains property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContains() {
        return contains;
    }

    /**
     * Sets the value of the contains property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContains(String value) {
        this.contains = value;
    }

    /**
     * Gets the value of the equals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquals() {
        return equals;
    }

    /**
     * Sets the value of the equals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquals(String value) {
        this.equals = value;
    }

}
