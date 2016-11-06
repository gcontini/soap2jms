
package com.github.soap2jms.reader.common.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsJmsMessageAndStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsJmsMessageAndStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsJmsMessage" type="{http://soap2jms.github.com/reader/common/ws}wsJmsMessage"/>
 *         &lt;element name="messageStatus" type="{http://soap2jms.github.com/reader/common/ws}responseStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsJmsMessageAndStatus", propOrder = {
    "wsJmsMessage",
    "messageStatus"
})
public class WsJmsMessageAndStatus {

    @XmlElement(required = true)
    protected WsJmsMessage wsJmsMessage;
    @XmlElement(required = true)
    protected ResponseStatus messageStatus;

    public WsJmsMessageAndStatus() {

	}

	public WsJmsMessageAndStatus(WsJmsMessage wsJmsMessage, ResponseStatus messageStatus) {
		this.wsJmsMessage = wsJmsMessage;
		this.messageStatus = messageStatus;
	}

	/**
     * Gets the value of the wsJmsMessage property.
     * 
     * @return
     *     possible object is
     *     {@link WsJmsMessage }
     *     
     */
    public WsJmsMessage getWsJmsMessage() {
        return wsJmsMessage;
    }

    /**
     * Sets the value of the wsJmsMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsJmsMessage }
     *     
     */
    public void setWsJmsMessage(WsJmsMessage value) {
        this.wsJmsMessage = value;
    }

    /**
     * Gets the value of the messageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus }
     *     
     */
    public ResponseStatus getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus }
     *     
     */
    public void setMessageStatus(ResponseStatus value) {
        this.messageStatus = value;
    }

}