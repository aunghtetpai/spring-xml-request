package com.springxmlrequest.api.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
public class RequestObject {

	private String name;
	private String phone;
}
