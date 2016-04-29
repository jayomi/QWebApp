package com.allianz.qportalapp.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="form")
public class FormField {

	private int fieldID;
	private int formID;
	private int segmentID;
	private String fieldName;
	private String fieldType;
	
	public FormField(int fieldID, int formID, int segmentID, String fieldName,
			String fieldType) {
		
		super();
		this.fieldID = fieldID;
		this.formID = formID;
		this.segmentID = segmentID;
		this.fieldName = fieldName;
		this.fieldType = fieldType;
	}

	public int getFieldID() {
		return fieldID;
	}

	public void setFieldID(int fieldID) {
		this.fieldID = fieldID;
	}

	public int getFormID() {
		return formID;
	}

	public void setFormID(int formID) {
		this.formID = formID;
	}

	public int getSegmentID() {
		return segmentID;
	}

	public void setSegmentID(int segmentID) {
		this.segmentID = segmentID;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}	
	
	
	
}
