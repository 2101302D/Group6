package com.dvops.maven.eclipse;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;



/**
 * Servlet implementation class keyboards_servlet
 */
@WebServlet("/keyboards_servlet")


public class keyboards_servlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public keyboards_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		try {
			listKeyboard(request, response);
		}
		catch(SQLException ex) {
			
			throw new ServletException(ex);
			
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
	private static final String SELECT_ALL_KEYBOARD = "select * from keyboard";
	/*private String jdbcURL = "jdbc:mysql://localhost:3307/keyboards";
	private String jdbcUsername = "root";
	private String jdbcPassword = "tG078386";*/
	
	
	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/keyboards", "root", "password");
		}	
		catch (SQLException e) {
			e.printStackTrace();
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
			return connection;
	}
	
	private void listKeyboard(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException
			{
			String id = "0";
			List <keyboard> keyboard = new ArrayList <>();
			try (Connection connection = getConnection();
			// Step 5.1: Create a statement using connection object
			PreparedStatement preparedStatement =
			connection.prepareStatement(SELECT_ALL_KEYBOARD);) {
			// Step 5.2: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 5.3: Process the ResultSet object.
			while (rs.next()) {
			id = rs.getString("id");
			String name = rs.getString("name");
			String switches = rs.getString("switch");
			String size = rs.getString("size");
			String backlight = rs.getString("backlight");
			String passthrough = rs.getString("passthrough");
			String keycaps = rs.getString("keycaps");
			Number price = rs.getInt("price");
			Number rating = rs.getInt("rating");
			String image = rs.getString("image");
			keyboard.add(new keyboard(id, name, switches, size, backlight, passthrough, keycaps, price, rating, image));
			}
			} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
			request.setAttribute("listKeyboard", keyboard);
			request.getRequestDispatcher("/keyboard.jsp").forward(request, response);
			}


}
