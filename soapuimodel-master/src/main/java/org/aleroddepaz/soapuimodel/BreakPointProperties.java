//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.27 at 05:36:21 PM CEST 
//


package org.aleroddepaz.soapuimodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BreakPointProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BreakPointProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conditionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="condition" type="{http://eviware.com/soapui/config}Script"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakPointProperties", propOrder = {
    "conditionEnabled",
    "condition"
})
public class BreakPointProperties {

    protected boolean conditionEnabled;
    @XmlElement(required = true)
    protected Script condition;

    /**
     * Gets the value of the conditionEnabled property.
     * 
     */
    public boolean isConditionEnabled() {
        return conditionEnabled;
    }

    /**
     * Sets the value of the conditionEnabled property.
     * 
     */
    public void setConditionEnabled(boolean value) {
        this.conditionEnabled = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link Script }
     *     
     */
    public Script getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Script }
     *     
     */
    public void setCondition(Script value) {
        this.condition = value;
    }

}