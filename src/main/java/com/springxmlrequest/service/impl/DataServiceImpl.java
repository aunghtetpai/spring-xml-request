package com.springxmlrequest.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springxmlrequest.api.request.RequestObject;
import com.springxmlrequest.service.DataService;
import com.springxmlrequest.util.XmlUtils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService {

	@Override
	public Object getData() {
		var data = new RequestObject("Thi Saint", "199");
		var result = XmlUtils.convertToXml(data);

		log.info("Request Body " + result);

		return HttpStatus.OK.name();
	}
}
