
package com.amazonaws.fps.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescriptorPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescriptorPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SoftDescriptorType" type="{http://fps.amazonaws.com/doc/2010-08-28/}SoftDescriptorType" minOccurs="0"/>
 *         &lt;element name="CSOwner" type="{http://fps.amazonaws.com/doc/2010-08-28/}CSOwner" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * Generated by AWS Code Generator
 * <p/>
 * Mon May 30 08:10:15 GMT+00:00 2011
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptorPolicy", propOrder = {
    "softDescriptorType",
    "csOwner"
})
public class DescriptorPolicy {

    @XmlElement(name = "SoftDescriptorType")
    protected SoftDescriptorType softDescriptorType;
    @XmlElement(name = "CSOwner")
    protected CSOwner csOwner;

    /**
     * Default constructor
     * 
     */
    public DescriptorPolicy() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public DescriptorPolicy(final SoftDescriptorType softDescriptorType, final CSOwner csOwner) {
        this.softDescriptorType = softDescriptorType;
        this.csOwner = csOwner;
    }

    /**
     * Gets the value of the softDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link SoftDescriptorType }
     *     
     */
    public SoftDescriptorType getSoftDescriptorType() {
        return softDescriptorType;
    }

    /**
     * Sets the value of the softDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftDescriptorType }
     *     
     */
    public void setSoftDescriptorType(SoftDescriptorType value) {
        this.softDescriptorType = value;
    }

    public boolean isSetSoftDescriptorType() {
        return (this.softDescriptorType!= null);
    }

    /**
     * Gets the value of the csOwner property.
     * 
     * @return
     *     possible object is
     *     {@link CSOwner }
     *     
     */
    public CSOwner getCSOwner() {
        return csOwner;
    }

    /**
     * Sets the value of the csOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSOwner }
     *     
     */
    public void setCSOwner(CSOwner value) {
        this.csOwner = value;
    }

    public boolean isSetCSOwner() {
        return (this.csOwner!= null);
    }

    /**
     * Sets the value of the SoftDescriptorType property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public DescriptorPolicy withSoftDescriptorType(SoftDescriptorType value) {
        setSoftDescriptorType(value);
        return this;
    }

    /**
     * Sets the value of the CSOwner property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public DescriptorPolicy withCSOwner(CSOwner value) {
        setCSOwner(value);
        return this;
    }
    

    /**
     * 
     * XML fragment representation of this object
     * 
     * @return XML fragment for this object. Name for outer
     * tag expected to be set by calling method. This fragment
     * returns inner properties representation only
     */
    protected String toXMLFragment() {
        StringBuffer xml = new StringBuffer();
        if (isSetSoftDescriptorType()) {
            xml.append("<SoftDescriptorType>");
            xml.append(getSoftDescriptorType().value());
            xml.append("</SoftDescriptorType>");
        }
        if (isSetCSOwner()) {
            xml.append("<CSOwner>");
            xml.append(getCSOwner().value());
            xml.append("</CSOwner>");
        }
        return xml.toString();
    }

    /**
     * 
     * Escape XML special characters
     */
    private String escapeXML(String string) {
        StringBuffer sb = new StringBuffer();
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '&':
                sb.append("&amp;");
                break;
            case '<':
                sb.append("&lt;");
                break;
            case '>':
                sb.append("&gt;");
                break;
            case '\'':
                sb.append("&#039;");
                break;
            case '"':
                sb.append("&quot;");
                break;
            default:
                sb.append(c);
            }
        }
        return sb.toString();
    }



    /**
     *
     * JSON fragment representation of this object
     *
     * @return JSON fragment for this object. Name for outer
     * object expected to be set by calling method. This fragment
     * returns inner properties representation only
     *
     */
    protected String toJSONFragment() {
        StringBuffer json = new StringBuffer();
        boolean first = true;
        if (isSetSoftDescriptorType()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("SoftDescriptorType"));
            json.append(" : ");
            json.append(quoteJSON(getSoftDescriptorType().value()));
            first = false;
        }
        if (isSetCSOwner()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("CSOwner"));
            json.append(" : ");
            json.append(quoteJSON(getCSOwner().value()));
            first = false;
        }
        return json.toString();
    }

    /**
     *
     * Quote JSON string
     */
    private String quoteJSON(String string) {
        StringBuffer sb = new StringBuffer();
        sb.append("\"");
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '/':
                sb.append("\\/");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            default:
                if (c <  ' ') {
                    sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                } else {
                sb.append(c);
            }
        }
        }
        sb.append("\"");
        return sb.toString();
    }


}
