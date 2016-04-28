package com.allianz.qportalapp.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.allianz.qportalapp.model.FormField;


public class DataSetFeildTypeImpl{
	
	
	FormDBService dbservice=new FormDBService(); 
	Connection conn = null; 
	Statement stmt=null;
	
	
	public List<FormField> getForm(){		
					
			List<FormField> formList=new ArrayList<FormField>();
			try {
				
				conn=dbservice.setConnection();
				stmt=conn.createStatement();
				//String query="select * from form";
				String query="SELECT field_id,field_type,field_label,required FROM qportal.field_form;";
				ResultSet rs=stmt.executeQuery(query);
				
				
				while(rs.next()){
					
					int formID=rs.getInt("field_id");
					String formType=rs.getString("field_type");
					String formLabel=rs.getString("field_label");
					Boolean required=rs.getBoolean("required");
					
					FormField form=new FormField(formID, formType, formLabel,required);
					formList.add(form);									
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			return formList;				
		
	}
	 public FormField addform(int fieldID,String fieldType,String fieldLabel){
		
		 //Form form=new Form(field_id, field_type,field_label,required);
		 FormField form=new FormField(fieldID, fieldType, fieldLabel);
		 try {			
				
				System.out.println("inside form service service.....");
				//System.out.println(form_id+".........."+form_type+"........"+form_label);
				conn=dbservice.setConnection();
				stmt=conn.createStatement();
				form.setFieldID(fieldID);
				form.setFieldType(fieldType);
				form.setFieldLabel(fieldLabel);
				form.isRequired();				
				String query="INSERT INTO qportal.field_form(field_id,field_type,field_label) VALUES ('"+fieldID+"','"+fieldType+"','"+fieldLabel+"')";
				
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
			return form;			
		 
		
		 
	 }
	
}
