//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.27 at 05:36:21 PM CEST 
//


package org.aleroddepaz.soapuimodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FuzzerScan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FuzzerScan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maximal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuzzerScan", propOrder = {
    "minimal",
    "maximal",
    "numberOfRequest"
})
public class FuzzerScan {

    protected int minimal;
    protected int maximal;
    protected int numberOfRequest;

    /**
     * Gets the value of the minimal property.
     * 
     */
    public int getMinimal() {
        return minimal;
    }

    /**
     * Sets the value of the minimal property.
     * 
     */
    public void setMinimal(int value) {
        this.minimal = value;
    }

    /**
     * Gets the value of the maximal property.
     * 
     */
    public int getMaximal() {
        return maximal;
    }

    /**
     * Sets the value of the maximal property.
     * 
     */
    public void setMaximal(int value) {
        this.maximal = value;
    }

    /**
     * Gets the value of the numberOfRequest property.
     * 
     */
    public int getNumberOfRequest() {
        return numberOfRequest;
    }

    /**
     * Sets the value of the numberOfRequest property.
     * 
     */
    public void setNumberOfRequest(int value) {
        this.numberOfRequest = value;
    }

}