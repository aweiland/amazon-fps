
package com.amazonaws.fps.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutstandingPrepaidLiability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutstandingPrepaidLiability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutstandingBalance" type="{http://fps.amazonaws.com/doc/2010-08-28/}Amount"/>
 *         &lt;element name="PendingInBalance" type="{http://fps.amazonaws.com/doc/2010-08-28/}Amount" minOccurs="0"/>
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
@XmlType(name = "OutstandingPrepaidLiability", propOrder = {
    "outstandingBalance",
    "pendingInBalance"
})
public class OutstandingPrepaidLiability {

    @XmlElement(name = "OutstandingBalance", required = true)
    protected Amount outstandingBalance;
    @XmlElement(name = "PendingInBalance")
    protected Amount pendingInBalance;

    /**
     * Default constructor
     * 
     */
    public OutstandingPrepaidLiability() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public OutstandingPrepaidLiability(final Amount outstandingBalance, final Amount pendingInBalance) {
        this.outstandingBalance = outstandingBalance;
        this.pendingInBalance = pendingInBalance;
    }

    /**
     * Gets the value of the outstandingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOutstandingBalance() {
        return outstandingBalance;
    }

    /**
     * Sets the value of the outstandingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOutstandingBalance(Amount value) {
        this.outstandingBalance = value;
    }

    public boolean isSetOutstandingBalance() {
        return (this.outstandingBalance!= null);
    }

    /**
     * Gets the value of the pendingInBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPendingInBalance() {
        return pendingInBalance;
    }

    /**
     * Sets the value of the pendingInBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPendingInBalance(Amount value) {
        this.pendingInBalance = value;
    }

    public boolean isSetPendingInBalance() {
        return (this.pendingInBalance!= null);
    }

    /**
     * Sets the value of the OutstandingBalance property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public OutstandingPrepaidLiability withOutstandingBalance(Amount value) {
        setOutstandingBalance(value);
        return this;
    }

    /**
     * Sets the value of the PendingInBalance property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public OutstandingPrepaidLiability withPendingInBalance(Amount value) {
        setPendingInBalance(value);
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
        if (isSetOutstandingBalance()) {
            Amount  outstandingBalance = getOutstandingBalance();
            xml.append("<OutstandingBalance>");
            xml.append(outstandingBalance.toXMLFragment());
            xml.append("</OutstandingBalance>");
        } 
        if (isSetPendingInBalance()) {
            Amount  pendingInBalance = getPendingInBalance();
            xml.append("<PendingInBalance>");
            xml.append(pendingInBalance.toXMLFragment());
            xml.append("</PendingInBalance>");
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
        if (isSetOutstandingBalance()) {
            if (!first) json.append(", ");
            json.append("\"OutstandingBalance\" : {");
            Amount  outstandingBalance = getOutstandingBalance();


            json.append(outstandingBalance.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetPendingInBalance()) {
            if (!first) json.append(", ");
            json.append("\"PendingInBalance\" : {");
            Amount  pendingInBalance = getPendingInBalance();


            json.append(pendingInBalance.toJSONFragment());
            json.append("}");
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