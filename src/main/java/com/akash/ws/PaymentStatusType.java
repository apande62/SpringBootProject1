
package com.akash.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAID"/>
 *     &lt;enumeration value="NOT_PAID"/>
 *     &lt;enumeration value="FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatusType")
@XmlEnum
public enum PaymentStatusType {

    PAID,
    NOT_PAID,
    FAILED;

    public String value() {
        return name();
    }

    public static PaymentStatusType fromValue(String v) {
        return valueOf(v);
    }

}
