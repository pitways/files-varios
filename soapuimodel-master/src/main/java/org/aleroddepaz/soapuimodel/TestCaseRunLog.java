//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.27 at 05:36:21 PM CEST 
//


package org.aleroddepaz.soapuimodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testCaseRunLogTestStep" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="timeTaken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="httpStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="contentLength" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dnsTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="connectTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="timeToFirstByte" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="readTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="totalTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="endpoint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="httpMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="port" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="testCase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timeTaken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "testCaseRunLogTestStep"
})
@XmlRootElement(name = "testCaseRunLog")
public class TestCaseRunLog {

    @XmlElement(required = true)
    protected List<TestCaseRunLog.TestCaseRunLogTestStep> testCaseRunLogTestStep;
    @XmlAttribute(name = "testCase")
    protected String testCase;
    @XmlAttribute(name = "timeTaken")
    protected String timeTaken;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "timeStamp")
    protected String timeStamp;

    /**
     * Gets the value of the testCaseRunLogTestStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testCaseRunLogTestStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestCaseRunLogTestStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestCaseRunLog.TestCaseRunLogTestStep }
     * 
     * 
     */
    public List<TestCaseRunLog.TestCaseRunLogTestStep> getTestCaseRunLogTestStep() {
        if (testCaseRunLogTestStep == null) {
            testCaseRunLogTestStep = new ArrayList<TestCaseRunLog.TestCaseRunLogTestStep>();
        }
        return this.testCaseRunLogTestStep;
    }

    /**
     * Gets the value of the testCase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestCase() {
        return testCase;
    }

    /**
     * Sets the value of the testCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestCase(String value) {
        this.testCase = value;
    }

    /**
     * Gets the value of the timeTaken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeTaken() {
        return timeTaken;
    }

    /**
     * Sets the value of the timeTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeTaken(String value) {
        this.timeTaken = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="timeTaken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="httpStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="contentLength" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="dnsTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="connectTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="timeToFirstByte" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="readTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="totalTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="endpoint" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="httpMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="port" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "message",
        "errorMessage"
    })
    public static class TestCaseRunLogTestStep {

        protected List<String> message;
        @XmlElement(required = true)
        protected String errorMessage;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "timeTaken")
        protected String timeTaken;
        @XmlAttribute(name = "status")
        protected String status;
        @XmlAttribute(name = "timestamp")
        protected String timestamp;
        @XmlAttribute(name = "httpStatus")
        protected String httpStatus;
        @XmlAttribute(name = "contentLength")
        protected String contentLength;
        @XmlAttribute(name = "dnsTime")
        protected String dnsTime;
        @XmlAttribute(name = "connectTime")
        protected String connectTime;
        @XmlAttribute(name = "timeToFirstByte")
        protected String timeToFirstByte;
        @XmlAttribute(name = "readTime")
        protected String readTime;
        @XmlAttribute(name = "totalTime")
        protected String totalTime;
        @XmlAttribute(name = "endpoint")
        protected String endpoint;
        @XmlAttribute(name = "httpMethod")
        protected String httpMethod;
        @XmlAttribute(name = "ipAddress")
        protected String ipAddress;
        @XmlAttribute(name = "port")
        protected Integer port;

        /**
         * Gets the value of the message property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the message property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMessage() {
            if (message == null) {
                message = new ArrayList<String>();
            }
            return this.message;
        }

        /**
         * Gets the value of the errorMessage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorMessage() {
            return errorMessage;
        }

        /**
         * Sets the value of the errorMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorMessage(String value) {
            this.errorMessage = value;
        }

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
         * Gets the value of the timeTaken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeTaken() {
            return timeTaken;
        }

        /**
         * Sets the value of the timeTaken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeTaken(String value) {
            this.timeTaken = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimestamp(String value) {
            this.timestamp = value;
        }

        /**
         * Gets the value of the httpStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHttpStatus() {
            return httpStatus;
        }

        /**
         * Sets the value of the httpStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHttpStatus(String value) {
            this.httpStatus = value;
        }

        /**
         * Gets the value of the contentLength property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContentLength() {
            return contentLength;
        }

        /**
         * Sets the value of the contentLength property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContentLength(String value) {
            this.contentLength = value;
        }

        /**
         * Gets the value of the dnsTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDnsTime() {
            return dnsTime;
        }

        /**
         * Sets the value of the dnsTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDnsTime(String value) {
            this.dnsTime = value;
        }

        /**
         * Gets the value of the connectTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConnectTime() {
            return connectTime;
        }

        /**
         * Sets the value of the connectTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConnectTime(String value) {
            this.connectTime = value;
        }

        /**
         * Gets the value of the timeToFirstByte property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeToFirstByte() {
            return timeToFirstByte;
        }

        /**
         * Sets the value of the timeToFirstByte property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeToFirstByte(String value) {
            this.timeToFirstByte = value;
        }

        /**
         * Gets the value of the readTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReadTime() {
            return readTime;
        }

        /**
         * Sets the value of the readTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReadTime(String value) {
            this.readTime = value;
        }

        /**
         * Gets the value of the totalTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalTime() {
            return totalTime;
        }

        /**
         * Sets the value of the totalTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalTime(String value) {
            this.totalTime = value;
        }

        /**
         * Gets the value of the endpoint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndpoint() {
            return endpoint;
        }

        /**
         * Sets the value of the endpoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndpoint(String value) {
            this.endpoint = value;
        }

        /**
         * Gets the value of the httpMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHttpMethod() {
            return httpMethod;
        }

        /**
         * Sets the value of the httpMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHttpMethod(String value) {
            this.httpMethod = value;
        }

        /**
         * Gets the value of the ipAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIpAddress() {
            return ipAddress;
        }

        /**
         * Sets the value of the ipAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIpAddress(String value) {
            this.ipAddress = value;
        }

        /**
         * Gets the value of the port property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPort() {
            return port;
        }

        /**
         * Sets the value of the port property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPort(Integer value) {
            this.port = value;
        }

    }

}
