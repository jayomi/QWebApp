package com.allianz.qportalapp.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.allianz.qportalapp.model.FormField;
import com.allianz.qportalapp.model.FormType;

public class FormTypeImpl {
	
	FormDBService dbservice=new FormDBService(); 
	Connection conn = null; 
	Statement stmt=null;
	
	 public void addformType(int formId, String formName,String status ){
			
		 FormType formType=new FormType(formId, formName,status);
		 //FormField form=new FormField(fieldID, fieldType, fieldLabel);
		 try {			
				
				System.out.println("inside form service service.....");				
				conn=dbservice.setConnection();
				stmt=conn.createStatement();
				formType.setFormId(formId);
				formType.setFormName(formName);
				formType.setFormStatus(status);				
				String query="INSERT INTO qportal.main_form(form_id,form_name,form_status) VALUES ('"+formId+"','"+formName+"','"+status+"')";
				
				//stmt.executeUpdate(query);
				stmt.execute(query);
				/*while(rs.next()){
					student.setId(id);
					student.setName(name);
					student.setAge(age);				
				}*/
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//return formType;			
	 } 
}
