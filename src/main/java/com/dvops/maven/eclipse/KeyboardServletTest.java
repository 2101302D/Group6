package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.mock.*;
import org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class KeyboardServletTest {
	  @Mock
	    Connection connection;
	    @Mock
	    PreparedStatement preparedStatement;
	    @Mock
	    ResultSet resultSet;

	    @Test
	    public void testSQLConnection() throws Exception {
	        // mock the SQL connection

	    }
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	void testServlet() throws ServletException, IOException {
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void testDoPostHttpServletRequestHttpServletResponse() {
	}

	@Test
	void testGetConnection() throws SQLException {
	
	}

	@Test
	void testDoGetHttpServletRequestHttpServletResponse1() throws ServletException, IOException {
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		keyboards_servlet servlet = new keyboards_servlet();
		
		servlet.doGet(request, response);
	}

}
