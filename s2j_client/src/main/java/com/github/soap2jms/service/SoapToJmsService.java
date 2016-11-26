
package com.github.soap2jms.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "soapToJmsService", targetNamespace = "http://soap2jms.github.com/service", wsdlLocation = "file:/usr/local/prj/misc/soap2jms/s2j_common/src/main/resources/queueReader.wsdl")
public class SoapToJmsService extends Service {

	private final static QName SOAPTOJMSSERVICE_QNAME = new QName("http://soap2jms.github.com/service",
			"soapToJmsService");


	public SoapToJmsService(final String wsdlLocation) throws MalformedURLException {
		super(new URL(wsdlLocation), SOAPTOJMSSERVICE_QNAME);
	} 
	
	public SoapToJmsService(final URL wsdlLocation) {
		super(wsdlLocation, SOAPTOJMSSERVICE_QNAME);
	}

	public SoapToJmsService(final URL wsdlLocation, final QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public SoapToJmsService(final URL wsdlLocation, final QName serviceName, final WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	public SoapToJmsService(final URL wsdlLocation, final WebServiceFeature... features) {
		super(wsdlLocation, SOAPTOJMSSERVICE_QNAME, features);
	}

	/**
	 * 
	 * @return returns ReaderSoap2Jms
	 */
	@WebEndpoint(name = "readerSOAP")
	public ReaderSoap2Jms getReaderSOAP() {
		return super.getPort(new QName("http://soap2jms.github.com/service", "readerSOAP"), ReaderSoap2Jms.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns ReaderSoap2Jms
	 */
	@WebEndpoint(name = "readerSOAP")
	public ReaderSoap2Jms getReaderSOAP(final WebServiceFeature... features) {
		return super.getPort(new QName("http://soap2jms.github.com/service", "readerSOAP"), ReaderSoap2Jms.class,
				features);
	}

	/**
	 * 
	 * @return returns SenderSoap2Jms
	 */
	@WebEndpoint(name = "senderSOAP")
	public SenderSoap2Jms getSenderSOAP() {
		return super.getPort(new QName("http://soap2jms.github.com/service", "senderSOAP"), SenderSoap2Jms.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns SenderSoap2Jms
	 */
	@WebEndpoint(name = "senderSOAP")
	public SenderSoap2Jms getSenderSOAP(final WebServiceFeature... features) {
		return super.getPort(new QName("http://soap2jms.github.com/service", "senderSOAP"), SenderSoap2Jms.class,
				features);
	}

}
