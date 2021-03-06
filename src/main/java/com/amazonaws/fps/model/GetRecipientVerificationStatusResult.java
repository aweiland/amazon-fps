
package com.amazonaws.fps.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="RecipientVerificationStatus" type="{http://fps.amazonaws.com/doc/2010-08-28/}RecipientVerificationStatus" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "recipientVerificationStatus"
})
@XmlRootElement(name = "GetRecipientVerificationStatusResult")
public class GetRecipientVerificationStatusResult {

    @XmlElement(name = "RecipientVerificationStatus")
    protected RecipientVerificationStatus recipientVerificationStatus;

    /**
     * Default constructor
     * 
     */
    public GetRecipientVerificationStatusResult() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public GetRecipientVerificationStatusResult(final RecipientVerificationStatus recipientVerificationStatus) {
        this.recipientVerificationStatus = recipientVerificationStatus;
    }

    /**
     * Gets the value of the recipientVerificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientVerificationStatus }
     *     
     */
    public RecipientVerificationStatus getRecipientVerificationStatus() {
        return recipientVerificationStatus;
    }

    /**
     * Sets the value of the recipientVerificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientVerificationStatus }
     *     
     */
    public void setRecipientVerificationStatus(RecipientVerificationStatus value) {
        this.recipientVerificationStatus = value;
    }

    public boolean isSetRecipientVerificationStatus() {
        return (this.recipientVerificationStatus!= null);
    }

    /**
     * Sets the value of the RecipientVerificationStatus property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetRecipientVerificationStatusResult withRecipientVerificationStatus(RecipientVerificationStatus value) {
        setRecipientVerificationStatus(value);
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
        if (isSetRecipientVerificationStatus()) {
            xml.append("<RecipientVerificationStatus>");
            xml.append(getRecipientVerificationStatus().value());
            xml.append("</RecipientVerificationStatus>");
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
        if (isSetRecipientVerificationStatus()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("RecipientVerificationStatus"));
            json.append(" : ");
            json.append(quoteJSON(getRecipientVerificationStatus().value()));
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
