package com.allianz.qportalapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
<<<<<<< HEAD
import javax.servlet.http.HttpSession;
=======
>>>>>>> 595348647e7085811f2bc01f113214561359cf67

/**
 * Servlet implementation class FormSegmentController
 */
@WebServlet("/FormSegmentController")
public class FormSegmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher requestDispatcher=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormSegmentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		HttpSession session = request.getSession(true);	
=======
		// TODO Auto-generated method stub
>>>>>>> 595348647e7085811f2bc01f113214561359cf67
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		String segmentlabelName=request.getParameter("segmentlabelName");
		String segmentlabelDescription=request.getParameter("segmentlabelDescription");
		//String select=request.getParameter("select");
		//request.setAttribute("FormLabel", labelName);
		//writer.write(formName);	
		String addSegment=request.getParameter("addSegment");
<<<<<<< HEAD
		String deleteSegment=request.getParameter("deleteSegment");
		int segmentID=Integer.parseInt(request.getParameter("segmentID"));
		Object formID=session.getAttribute( "formIndex" );
		
		writer.write("inside segment controller, form index: "+formID);
		
		
		int maxSegmentID;
		if(addSegment!=null){
			int formIndex=(int) formID;
			request.setAttribute("segmentID", segmentID);
			request.setAttribute("segment_labelName", segmentlabelName);
			request.setAttribute("segment_labelDescription", segmentlabelDescription);
			FormSegmentImple formSegmentImple=new FormSegmentImple();
			formSegmentImple.addformSegment(formIndex, segmentID, segmentlabelName, segmentlabelDescription);
			//formSegmentImple.addformSegment(segmentID,segmentlabelName, segmentlabelDescription);
			requestDispatcher=request.getRequestDispatcher("second.jsp");
			requestDispatcher.forward(request, response);	
		}
		if(deleteSegment!=null){
			try{
				FormSegmentImple formSegmentImple=new FormSegmentImple();
				//maxSegmentID=formSegmentImple.getMaxSegmentID();
				//writer.write(maxSegmentID);
				formSegmentImple.deleteFormSegment(segmentID);
				writer.write("sucessfully deleted");
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
=======
		
		if(addSegment!=null){
			request.setAttribute("segment_labelName", segmentlabelName);
			request.setAttribute("segment_labelDescription", segmentlabelDescription);
			
			requestDispatcher=request.getRequestDispatcher("second.jsp");
			requestDispatcher.forward(request, response);	
		}
>>>>>>> 595348647e7085811f2bc01f113214561359cf67
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
