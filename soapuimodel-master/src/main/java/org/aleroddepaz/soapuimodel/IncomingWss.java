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
 * <p>Java class for IncomingWss complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncomingWss">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="decryptCrypto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signatureCrypto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="decryptPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomingWss", propOrder = {
    "name",
    "decryptCrypto",
    "signatureCrypto",
    "decryptPassword"
})
public class IncomingWss {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String decryptCrypto;
    @XmlElement(required = true)
    protected String signatureCrypto;
    @XmlElement(required = true)
    protected String decryptPassword;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the decryptCrypto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecryptCrypto() {
        return decryptCrypto;
    }

    /**
     * Sets the value of the decryptCrypto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecryptCrypto(String value) {
        this.decryptCrypto = value;
    }

    /**
     * Gets the value of the signatureCrypto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureCrypto() {
        return signatureCrypto;
    }

    /**
     * Sets the value of the signatureCrypto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureCrypto(String value) {
        this.signatureCrypto = value;
    }

    /**
     * Gets the value of the decryptPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecryptPassword() {
        return decryptPassword;
    }

    /**
     * Sets the value of the decryptPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecryptPassword(String value) {
        this.decryptPassword = value;
    }

}