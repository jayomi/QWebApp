package com.allianz.qportalapp.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="form")
public class FormField {

	private int fieldID;
<<<<<<< HEAD
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
=======
	private String fieldType;
	private String fieldLabel;
	private boolean required;
	private int displayOrder;
	
	public FormField() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public FormField(int fieldID, String fieldType, String fieldLabel,
			boolean required) {
		super();
		this.fieldID = fieldID;
		this.fieldType = fieldType;
		this.fieldLabel = fieldLabel;
		this.required = required;
		//this.displayOrder = displayOrder;
	}
	public FormField(int fieldID, String fieldType, String fieldLabel) {
		super();
		this.fieldID = fieldID;
		this.fieldType = fieldType;
		this.fieldLabel = fieldLabel;
		//this.required = required;
		//this.displayOrder = displayOrder;
	}
	public FormField(String fieldType, String fieldLabel,
			boolean required) {
		this.fieldID = fieldID;
		this.fieldType = fieldType;
		this.fieldLabel = fieldLabel;
		this.required = required;
		//this.displayOrder = displayOrder;
		
>>>>>>> 595348647e7085811f2bc01f113214561359cf67
	}

	public int getFieldID() {
		return fieldID;
	}

	public void setFieldID(int fieldID) {
		this.fieldID = fieldID;
	}

<<<<<<< HEAD
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
=======
	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getFieldLabel() {
		return fieldLabel;
	}

	public void setFieldLabel(String fieldLabel) {
		this.fieldLabel = fieldLabel;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public int getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}
	
	
>>>>>>> 595348647e7085811f2bc01f113214561359cf67
	
	
	
}
