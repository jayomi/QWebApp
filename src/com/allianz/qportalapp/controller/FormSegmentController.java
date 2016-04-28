package com.allianz.qportalapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		String segmentlabelName=request.getParameter("segmentlabelName");
		String segmentlabelDescription=request.getParameter("segmentlabelDescription");
		//String select=request.getParameter("select");
		//request.setAttribute("FormLabel", labelName);
		//writer.write(formName);	
		String addSegment=request.getParameter("addSegment");
		
		if(addSegment!=null){
			request.setAttribute("segment_labelName", segmentlabelName);
			request.setAttribute("segment_labelDescription", segmentlabelDescription);
			
			requestDispatcher=request.getRequestDispatcher("second.jsp");
			requestDispatcher.forward(request, response);	
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
