
package com.amazonaws.fps.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubscriptionTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TransactionSerialNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TransactionAmount" type="{http://fps.amazonaws.com/doc/2010-08-28/}Amount"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionStatus" type="{http://fps.amazonaws.com/doc/2010-08-28/}TransactionStatus"/>
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
@XmlType(name = "SubscriptionTransaction", propOrder = {
    "transactionId",
    "transactionDate",
    "transactionSerialNumber",
    "transactionAmount",
    "description",
    "transactionStatus"
})
public class SubscriptionTransaction {

    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(name = "TransactionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "TransactionSerialNumber")
    protected int transactionSerialNumber;
    @XmlElement(name = "TransactionAmount", required = true)
    protected Amount transactionAmount;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "TransactionStatus", required = true)
    protected TransactionStatus transactionStatus;

    /**
     * Default constructor
     * 
     */
    public SubscriptionTransaction() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public SubscriptionTransaction(final String transactionId, final XMLGregorianCalendar transactionDate, final int transactionSerialNumber, final Amount transactionAmount, final String description, final TransactionStatus transactionStatus) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.transactionSerialNumber = transactionSerialNumber;
        this.transactionAmount = transactionAmount;
        this.description = description;
        this.transactionStatus = transactionStatus;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    public boolean isSetTransactionId() {
        return (this.transactionId!= null);
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    public boolean isSetTransactionDate() {
        return (this.transactionDate!= null);
    }

    /**
     * Gets the value of the transactionSerialNumber property.
     * 
     */
    public int getTransactionSerialNumber() {
        return transactionSerialNumber;
    }

    /**
     * Sets the value of the transactionSerialNumber property.
     * 
     */
    public void setTransactionSerialNumber(int value) {
        this.transactionSerialNumber = value;
    }

    public boolean isSetTransactionSerialNumber() {
        return true;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTransactionAmount(Amount value) {
        this.transactionAmount = value;
    }

    public boolean isSetTransactionAmount() {
        return (this.transactionAmount!= null);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus }
     *     
     */
    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus }
     *     
     */
    public void setTransactionStatus(TransactionStatus value) {
        this.transactionStatus = value;
    }

    public boolean isSetTransactionStatus() {
        return (this.transactionStatus!= null);
    }

    /**
     * Sets the value of the TransactionId property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public SubscriptionTransaction withTransactionId(String value) {
        setTransactionId(value);
        return this;
    }

    /**
     * Sets the value of the TransactionDate property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public SubscriptionTransaction withTransactionDate(XMLGregorianCalendar value) {
        setTransactionDate(value);
        return this;
    }

    /**
     * Sets the value of the TransactionSerialNumber property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public SubscriptionTransaction withTransactionSerialNumber(int value) {
        setTransactionSerialNumber(value);
        return this;
    }

    /**
     * Sets the value of the TransactionAmount property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public SubscriptionTransaction withTransactionAmount(Amount value) {
        setTransactionAmount(value);
        return this;
    }

    /**
     * Sets the value of the Description property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public SubscriptionTransaction withDescription(String value) {
        setDescription(value);
        return this;
    }

    /**
     * Sets the value of the TransactionStatus property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public SubscriptionTransaction withTransactionStatus(TransactionStatus value) {
        setTransactionStatus(value);
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
        if (isSetTransactionId()) {
            xml.append("<TransactionId>");
            xml.append(escapeXML(getTransactionId()));
            xml.append("</TransactionId>");
        }
        if (isSetTransactionDate()) {
            xml.append("<TransactionDate>");
            xml.append(getTransactionDate() + "");
            xml.append("</TransactionDate>");
        }
        if (isSetTransactionSerialNumber()) {
            xml.append("<TransactionSerialNumber>");
            xml.append(getTransactionSerialNumber() + "");
            xml.append("</TransactionSerialNumber>");
        }
        if (isSetTransactionAmount()) {
            Amount  transactionAmount = getTransactionAmount();
            xml.append("<TransactionAmount>");
            xml.append(transactionAmount.toXMLFragment());
            xml.append("</TransactionAmount>");
        } 
        if (isSetDescription()) {
            xml.append("<Description>");
            xml.append(escapeXML(getDescription()));
            xml.append("</Description>");
        }
        if (isSetTransactionStatus()) {
            xml.append("<TransactionStatus>");
            xml.append(getTransactionStatus().value());
            xml.append("</TransactionStatus>");
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
        if (isSetTransactionId()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("TransactionId"));
            json.append(" : ");
            json.append(quoteJSON(getTransactionId()));
            first = false;
        }
        if (isSetTransactionDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("TransactionDate"));
            json.append(" : ");
            json.append(quoteJSON(getTransactionDate() + ""));
            first = false;
        }
        if (isSetTransactionSerialNumber()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("TransactionSerialNumber"));
            json.append(" : ");
            json.append(quoteJSON(getTransactionSerialNumber() + ""));
            first = false;
        }
        if (isSetTransactionAmount()) {
            if (!first) json.append(", ");
            json.append("\"TransactionAmount\" : {");
            Amount  transactionAmount = getTransactionAmount();


            json.append(transactionAmount.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetDescription()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Description"));
            json.append(" : ");
            json.append(quoteJSON(getDescription()));
            first = false;
        }
        if (isSetTransactionStatus()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("TransactionStatus"));
            json.append(" : ");
            json.append(quoteJSON(getTransactionStatus().value()));
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