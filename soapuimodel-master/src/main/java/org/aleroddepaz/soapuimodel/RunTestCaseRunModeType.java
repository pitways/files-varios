//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.27 at 05:36:21 PM CEST 
//


package org.aleroddepaz.soapuimodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunTestCaseRunModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RunTestCaseRunModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PARALLELL"/>
 *     &lt;enumeration value="SINGLETON_AND_WAIT"/>
 *     &lt;enumeration value="SINGLETON_AND_FAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RunTestCaseRunModeType")
@XmlEnum
public enum RunTestCaseRunModeType {

    PARALLELL,
    SINGLETON_AND_WAIT,
    SINGLETON_AND_FAIL;

    public String value() {
        return name();
    }

    public static RunTestCaseRunModeType fromValue(String v) {
        return valueOf(v);
    }

}
