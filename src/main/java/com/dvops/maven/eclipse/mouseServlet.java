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
 * Servlet implementation class HelloServlet
 */
@WebServlet("/mouseServlet")
public class mouseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mouseServlet() {
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
        String n = request.getParameter("Name");
        String c = request.getParameter("Connection");
        String b = request.getParameter("Buttons");
        String d = request.getParameter("DPI");
        String w = request.getParameter("Weight");
        String s = request.getParameter("Size");
        String P = request.getParameter("Price");
        String r = request.getParameter("Rating");
        String I = request.getParameter("Image");
        String D = request.getParameter("Description");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/userdetails", "root", "password");

        PreparedStatement ps = con.prepareStatement("INSERT INTO devops_backend.mouse VALUES(?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, n);
        ps.setString(2, c);
        ps.setString(3, b);
        ps.setString(4, d);
        ps.setString(5, w);
        ps.setString(6, s);
        ps.setString(7, P);
        ps.setString(8, r);
        ps.setString(9, I);
        ps.setString(10, D);
        int i = ps.executeUpdate();
        if (i > 0){
            PrintWriter writer = response.getWriter();
            writer.println("<h1>" + "You have successfully registered an account!" + "</h1>");
            writer.close();
            }
        }
        catch (Exception exception) {
            System.out.println(exception);
            out.close();
            }
            doGet(request, response);
    }

}
