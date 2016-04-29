<%@page import="com.allianz.qportalapp.controller.FormSegmentImple"%>
<%@page import="com.allianz.qportalapp.model.FormSegment"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.allianz.qportalapp.model.FormType" %>
<%@page import="com.allianz.qportalapp.controller.FormTypeImpl"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>list-down forms</title>
<link rel="stylesheet" href="css/bootstrap.css" type="text/css">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">


</head>
<body>
	<%
		List<FormType> formList=new ArrayList<FormType>();
		FormTypeImpl formTypeImpl=new FormTypeImpl();
		formList=formTypeImpl.getFormList();
		
	%>
	<%
		List<FormSegment> formSegmentList=new ArrayList<FormSegment>();
		FormSegmentImple formSegmentImple=new FormSegmentImple();
	%>
	
	<%for(int i=0;i<formList.size();i++){ %>
	
	<div class="row">
		<div class="container">
			<div class="table-responsive">
				<table class="table">
					<tr>
						<th>Form ID</th>
						<th>Form Name</th>
						<th>Form Description</th>
						<th>Department</th>
					</tr>
		
	
					
						<div class="short">
						<tr><td><%=formList.get(i).getFormId() %></td>
						<td><%=formList.get(i).getFormName() %></td>
						<td><%=formList.get(i).getFormDescription()%></td>
						<td><%=formList.get(i).getDepartment()%></td>
						<td><input type="submit" value="Go"/></td>
						</tr>
						</div>
						<tr>
							<%
								formSegmentList=formSegmentImple.getFormSegmentByFormId(%><%formList.get(i).getFormId()%><%);															
							%>
							<div class="section">
								<table class="table">
									<tr>
										<th>ID</th>
										<th>Label</th>
										<th>Description</th>										
									</tr>
									
									<%for(int j=0;j<formSegmentList.size();j++){ %>
									<tr>
										<td><%=formSegmentList.get(j).getSegmentId() %></td>
										<td><%=formSegmentList.get(j).getSegmentLabel() %></td>
										<td><%=formSegmentList.get(j).getSegmentDescription() %></td>
									</tr>
									<%} %>
								</table>
							</div>
						</tr>
					<%} %>
				</table>
			</div>
			
		</div>
	</div>
	
	<script type="text/javascript">
$(document).ready(function () {
    $('.section').hide();
    $('th').click(function () {
        $(this).toggleClass("open");
        $(this).next().toggle();
    }); });//end toggle
</script>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	
</body>
</html>