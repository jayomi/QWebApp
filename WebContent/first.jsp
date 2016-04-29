<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Allianz</title>
<link rel="stylesheet" href="css/bootstrap.css" type="text/css">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script type="text/javascript">
var tr=0;
function createTabelSegment() {
	
	$("#datasegment1").clone(true).appendTo("#mainFormBody");
	
	
	}
function createTabelRow(){
	//$("#dataField1").clone(true).appendTo("#mainFormBody");
	tr++;
	$("#mainFormBody").append("<tr id=\""+tr+"\"><td><input id=\"\" value=\"LabelName\" name=\"\" type=\"text\"></td><td><select id=\"\" name=\"\" onchange=\"getSelectedValue(this.value)\"> <option value=\"textFeild\">Text Feild</option><option value=\"textArea\">TextArea</option><option value=\"dropDown\">Drop Down List</option><option value=\"checkBox\">Check Box</option> <option value=\"radioButton\">Radio Button</option></select></td><td><input type=\"button\" value=\"Add\"/></td><td><input type=\"button\" onclick=\"deleteTableRow("+tr+")\" value=\"Delete\"/></td> </tr>");
	
}

function deleteTableRow(tableID) {
	$("#"+tableID).remove();
	
}	
<<<<<<< HEAD
function deleteTableSegment(){
	var table = document.getElementById(tableID);
	var rowCount = table.rows.length;
	table.deleteRow();
}
=======
>>>>>>> 595348647e7085811f2bc01f113214561359cf67
</script>
</head>
<body>
	
	Form Name: ${form_Name}<br>
<<<<<<< HEAD
	Form ID: <%= session.getAttribute( "formIndex" ) %>
	
=======
	Form ID: ${form_Id}<br>
>>>>>>> 595348647e7085811f2bc01f113214561359cf67
	
	<table id="mainFormTable" class="table">
		<thead>Main table</thead>
		<tbody id="mainFormBody">
<<<<<<< HEAD
			
			<tr  id="datasegment1">
				<form action="FormSegmentController">
					
				<td><input id="segmenID" type="number" value="1" name="segmentID"/></td>
				<td><input id="segmentlabelName" type="text" value="LabelName" name="segmentlabelName"/></td>
				<td><input id="segmentlabelDescription" type="text" value="LabelDescription" name="segmentlabelDescription"/></td>
				<td><input type="submit" value="Add" name="addSegment"/></td>
				<td><input type="submit" value="Delete" name="deleteSegment"/></td>	
				
				</form> 				
=======
			<tr id="datasegment1">
				<td><h3>Hello Allianz</h3></td>
			</tr>
			<tr>
				<form action="FormSegmentController">
				<td><input id="segmentlabelName" type="text" value="LabelName" name="segmentlabelName"/></td>
				<td><input id="segmentlabelDescription" type="text" value="LabelDescription" name="segmentlabelDescription"/></td>
				<td><input type="submit" value="Add" name="addSegment"/></td>
				<td><input type="button" value="Delete" name="deleteSegment"/></td>	
				</form>				
>>>>>>> 595348647e7085811f2bc01f113214561359cf67
			</tr>
			<tr id="dataField1">
				<td><input id="labelName" type="text" value="LabelName" name="labelName"/></td>
				<td><select id="selectType" name="typeName"
						onchange="getSelectedValue(this.value)">
							<option value="textFeild">Text Feild</option>
							<option value="textArea">TextArea</option>
							<option value="dropDown">Drop Down List</option>
							<option value="checkBox">Check Box</option>
							<option value="radioButton">Radio Button</option>
					</select>
				</td>
				<td><input type="button" value="Add"/></td>
				<td><input type="button" value="Delete"/></td>
			</tr>				
			<tr><td></td></tr>
		</tbody>
	</table>

	<input type="submit" value="add row" onclick="createTabelRow()"/>
	<!--<input type="submit" value="delete row" onclick="deleteTableRow('mainFormTable')"/>-->
	<input type="button" value="Add Segment" onClick="createTabelSegment()"/>


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>