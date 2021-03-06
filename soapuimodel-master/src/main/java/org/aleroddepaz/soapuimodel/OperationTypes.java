//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.27 at 05:36:21 PM CEST 
//


package org.aleroddepaz.soapuimodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="One-Way"/>
 *     &lt;enumeration value="Request-Response"/>
 *     &lt;enumeration value="Notification"/>
 *     &lt;enumeration value="Solicit-Response"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationTypes")
@XmlEnum
public enum OperationTypes {

    @XmlEnumValue("One-Way")
    ONE_WAY("One-Way"),
    @XmlEnumValue("Request-Response")
    REQUEST_RESPONSE("Request-Response"),
    @XmlEnumValue("Notification")
    NOTIFICATION("Notification"),
    @XmlEnumValue("Solicit-Response")
    SOLICIT_RESPONSE("Solicit-Response");
    private final String value;

    OperationTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationTypes fromValue(String v) {
        for (OperationTypes c: OperationTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
