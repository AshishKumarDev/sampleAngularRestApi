package org.rest.services.restTest.books.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
	private int errorId;
	private String errorMessage;
	private String documentation;
	
	public ErrorMessage() {
		
	}
	
	public ErrorMessage(int errorId,String errorMessage,String documentation) {
		this.errorId=errorId;
		this.errorMessage=errorMessage;
		this.documentation=documentation;
	}
	
	
	public int getErrorId() {
		return errorId;
	
	}
	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getDocumentation() {
		return documentation;
	}
	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	

}
