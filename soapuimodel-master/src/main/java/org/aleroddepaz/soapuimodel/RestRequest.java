//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.27 at 05:36:21 PM CEST 
//


package org.aleroddepaz.soapuimodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://eviware.com/soapui/config}AbstractRequest">
 *       &lt;sequence>
 *         &lt;element name="parameters" type="{http://eviware.com/soapui/config}StringToStringMap"/>
 *         &lt;element name="parameterOrder" type="{http://eviware.com/soapui/config}StringList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="wadlId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fullPath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mediaType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="postQueryString" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="accept" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="multiValueDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestRequest", propOrder = {
    "parameters",
    "parameterOrder"
})
public class RestRequest
    extends AbstractRequest
{

    @XmlElement(required = true)
    protected StringToStringMap parameters;
    protected StringList parameterOrder;
    @XmlAttribute(name = "wadlId")
    protected String wadlId;
    @XmlAttribute(name = "fullPath")
    protected String fullPath;
    @XmlAttribute(name = "mediaType")
    protected String mediaType;
    @XmlAttribute(name = "postQueryString")
    protected Boolean postQueryString;
    @XmlAttribute(name = "accept")
    protected String accept;
    @XmlAttribute(name = "multiValueDelimiter")
    protected String multiValueDelimiter;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link StringToStringMap }
     *     
     */
    public StringToStringMap getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringToStringMap }
     *     
     */
    public void setParameters(StringToStringMap value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the parameterOrder property.
     * 
     * @return
     *     possible object is
     *     {@link StringList }
     *     
     */
    public StringList getParameterOrder() {
        return parameterOrder;
    }

    /**
     * Sets the value of the parameterOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringList }
     *     
     */
    public void setParameterOrder(StringList value) {
        this.parameterOrder = value;
    }

    /**
     * Gets the value of the wadlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWadlId() {
        return wadlId;
    }

    /**
     * Sets the value of the wadlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWadlId(String value) {
        this.wadlId = value;
    }

    /**
     * Gets the value of the fullPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPath() {
        return fullPath;
    }

    /**
     * Sets the value of the fullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPath(String value) {
        this.fullPath = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the postQueryString property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostQueryString() {
        return postQueryString;
    }

    /**
     * Sets the value of the postQueryString property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostQueryString(Boolean value) {
        this.postQueryString = value;
    }

    /**
     * Gets the value of the accept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccept() {
        return accept;
    }

    /**
     * Sets the value of the accept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccept(String value) {
        this.accept = value;
    }

    /**
     * Gets the value of the multiValueDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiValueDelimiter() {
        return multiValueDelimiter;
    }

    /**
     * Sets the value of the multiValueDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiValueDelimiter(String value) {
        this.multiValueDelimiter = value;
    }

}
