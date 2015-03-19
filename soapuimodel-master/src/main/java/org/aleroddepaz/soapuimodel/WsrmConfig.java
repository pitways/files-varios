//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.27 at 05:36:21 PM CEST 
//


package org.aleroddepaz.soapuimodel;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsrmConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsrmConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="version" type="{http://eviware.com/soapui/config}WsrmVersionType" />
 *       &lt;attribute name="ackTo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sequenceExpires" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="offerEndpoint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsrmConfig")
public class WsrmConfig {

    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "ackTo")
    protected String ackTo;
    @XmlAttribute(name = "sequenceExpires")
    protected BigInteger sequenceExpires;
    @XmlAttribute(name = "offerEndpoint")
    protected String offerEndpoint;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the ackTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckTo() {
        return ackTo;
    }

    /**
     * Sets the value of the ackTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAckTo(String value) {
        this.ackTo = value;
    }

    /**
     * Gets the value of the sequenceExpires property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceExpires() {
        return sequenceExpires;
    }

    /**
     * Sets the value of the sequenceExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceExpires(BigInteger value) {
        this.sequenceExpires = value;
    }

    /**
     * Gets the value of the offerEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferEndpoint() {
        return offerEndpoint;
    }

    /**
     * Sets the value of the offerEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferEndpoint(String value) {
        this.offerEndpoint = value;
    }

}
