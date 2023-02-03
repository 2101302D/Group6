package com.dvops.maven.eclipse;
	

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n = request.getParameter("userName");
		String p = request.getParameter("password");
		String e = request.getParameter("email");
		try {	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://127.0.0.1:3306/?user=root", "root", "123");
			
		PreparedStatement ps = con.prepareStatement("insert into USER values(?,?,?)");
		ps.setString(1, n);
		ps.setString(2, p);
		ps.setString(3, e);
		int i = ps.executeUpdate();
		if (i > 0){
			/*PrintWriter writer = response.getWriter();
			writer.println("<h1>" + "You have successfully registered an account!" + "</h1>");
			writer.close();*/
			response.sendRedirect("http://localhost:8080/Group6/UserServlet/dashboard");
			}
		}
		catch (Exception exception) {
			System.out.println(exception);
			out.close();
			}
			doGet(request, response);
	}

}
