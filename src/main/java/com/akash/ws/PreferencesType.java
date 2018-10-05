
package com.akash.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is used for add, delete and update address
 * 				response
 * 			
 * 
 * <p>Java class for PreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preference" type="{http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00}NamedValueType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferencesType", namespace = "http://optumrx.unitedhealthgroup.com/AO/PatientPreferenceAO/v3_00", propOrder = {
    "preference"
})
public class PreferencesType {

    @XmlElement(required = true)
    protected List<NamedValueType> preference;

    /**
     * Gets the value of the preference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedValueType }
     * 
     * 
     */
    public List<NamedValueType> getPreference() {
        if (preference == null) {
            preference = new ArrayList<NamedValueType>();
        }
        return this.preference;
    }

}
