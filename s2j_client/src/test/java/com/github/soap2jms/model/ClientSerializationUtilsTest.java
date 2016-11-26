package com.github.soap2jms.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import javax.activation.DataHandler;

import org.junit.Test;

import com.github.soap2jms.common.ByteArrayDataSource;
import com.github.soap2jms.common.JMSMessageClassEnum;
import com.github.soap2jms.common.ws.RetrieveMessageResponseType;
import com.github.soap2jms.common.ws.StatusCode;
import com.github.soap2jms.common.ws.WsJmsMessage;
import com.github.soap2jms.common.ws.WsJmsMessageAndStatus;
import com.github.soap2jms.model.ClientSerializationUtils;

public class ClientSerializationUtilsTest {

	@Test
	public void testClientSerializationUtils() throws Exception {
		List<WsJmsMessageAndStatus> messagesIn = new ArrayList<WsJmsMessageAndStatus>();
		DataHandler body = new DataHandler(new ByteArrayDataSource("test".getBytes(),"text/html"));
		WsJmsMessage s2jMessage = new WsJmsMessage("correlationId", 1, 0, null, // headers
				"messageId", JMSMessageClassEnum.TEXT.name(), 1, // priority
				true, 1000L, // timestamp
				"type", body);
		StatusCode messageStatus = new StatusCode("OK", null);
		messagesIn.add(new WsJmsMessageAndStatus(s2jMessage, messageStatus));
		RetrieveMessageResponseType wsdlResponse = new RetrieveMessageResponseType(messagesIn, false);
		S2JMessage[] messages = ClientSerializationUtils.convertMessages(wsdlResponse);
		assertNotNull("Result is not null", messages);
		assertEquals("Messages deserialized", 1, messages.length);
		S2JMessage message = messages[0];
		assertEquals("Message class", S2JTextMessage.class, message.getClass());
		assertEquals("Message body", "test", ((S2JTextMessage) message).getText());
	}

}
