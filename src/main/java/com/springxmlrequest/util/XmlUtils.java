package com.springxmlrequest.util;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XmlUtils {

	public static String convertToXml(Object obj) {

		String xmlFormat = null;

		try {

			JAXBContext context = JAXBContext.newInstance(obj.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			StringWriter stringWriter = new StringWriter();
			marshaller.marshal(obj, stringWriter);

			xmlFormat = stringWriter.toString();

		} catch (JAXBException e) {
			log.error("Parse XML Error :" + e.getMessage());
		}

		return xmlFormat;
	}
}
