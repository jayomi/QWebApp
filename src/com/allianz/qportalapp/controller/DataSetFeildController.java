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
 * Servlet implementation class DataSerFeildTypeController
 */
@WebServlet("/DataSerFeildTypeController")
public class DataSetFeildController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher requestDispatcher=null;
    

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataSetFeildController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String formType=request.getParameter("formtype");
		//System.out.println("formType:........."+formType);
		writer.write(formType);
		
		if((formType.equalsIgnoreCase("GeneralInformation"))){ 
			
			requestDispatcher=request.getRequestDispatcher("creategeneralinformationform.jsp");
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
