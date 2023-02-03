package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

class KeyboardServletTest {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private RequestDispatcher requestDispatcher;
	private keyboards_servlet servlet;

	@BeforeEach
	void setUp() throws Exception {
		servlet = new keyboards_servlet();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDoGetHttpServletRequestHttpServletResponse() throws IOException {
		request = Mockito.mock(HttpServletRequest.class);
		response = Mockito.mock(HttpServletResponse.class);
		requestDispatcher = Mockito.mock(RequestDispatcher.class);
		
		Mockito.when(request.getRequestDispatcher("keyboard.jsp")).thenReturn(requestDispatcher);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		
		Mockito.when(response.getWriter()).thenReturn(printWriter);
		String testResult = stringWriter.toString();
		assertNotNull(testResult);
	
	}

	@Test
	void testGetConnection() {
		Connection connection = servlet.getConnection();
		assertNotNull(connection);
	}

	@Test
	void testListKeyboard() throws SQLException, IOException, ServletException {
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		servlet = new keyboards_servlet();
		requestDispatcher = Mockito.mock(RequestDispatcher.class);
		
		Mockito.when(request.getRequestDispatcher("keyboard.jsp")).thenReturn(requestDispatcher);
		servlet.listKeyboard(request, response);
	}

}
