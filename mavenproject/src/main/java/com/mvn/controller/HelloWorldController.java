package com.mvn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvn.entity.HelloWorld;

/**
 * Servlet implementation class HelloWorldController
 */
@WebServlet("/action/hello.do")
public class HelloWorldController extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
    private HelloWorld hello=new HelloWorld();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldController() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  PrintWriter out=response.getWriter();
	        out.print("<H1>"+hello.print()+"<H1>");

		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
