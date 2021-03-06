
package com.github.soap2jms.common.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queueName" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxItems" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "clientIdentifier", "queueName", "filter", "maxItems" })
@XmlRootElement(name = "retrieveMessages")
public class RetrieveMessages {

	@XmlElement(required = true)
	protected String clientIdentifier;
	@XmlElement(required = true)
	protected String filter;
	protected int maxItems;
	@XmlElement(required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String queueName;

	/**
	 * Gets the value of the clientIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClientIdentifier() {
		return this.clientIdentifier;
	}

	/**
	 * Gets the value of the filter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFilter() {
		return this.filter;
	}

	/**
	 * Gets the value of the maxItems property.
	 * 
	 */
	public int getMaxItems() {
		return this.maxItems;
	}

	/**
	 * Gets the value of the queueName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQueueName() {
		return this.queueName;
	}

	/**
	 * Sets the value of the clientIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClientIdentifier(final String value) {
		this.clientIdentifier = value;
	}

	/**
	 * Sets the value of the filter property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFilter(final String value) {
		this.filter = value;
	}

	/**
	 * Sets the value of the maxItems property.
	 * 
	 */
	public void setMaxItems(final int value) {
		this.maxItems = value;
	}

	/**
	 * Sets the value of the queueName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQueueName(final String value) {
		this.queueName = value;
	}

}
