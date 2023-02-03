package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserCollectionTest {
	
	private UserCollection uc;
	private User u1;
	private User u2;
	private User u3;

	@BeforeEach
	void setUp() throws Exception {
		uc = new UserCollection();
		u1 = new User("John Doh", "Password", "johndoh@email.com");
		u2 = new User("Mary Sue", "Password", "maysue@abc.com");
		u3= new User("Test", "Password", "test@email.com");
		
		uc.postUser(u1);
		uc.postUser(u2);
	}

	@Test
	void testGetUser() {
		List<User> testUc = uc.getUser();
	}

	@Test
	void testPostUser() {
		uc.postUser(u3);
		List<User> testUc = uc.getUser();
	}

	@Test
	void testGetByName() {
		User testUc = uc.getByName("John Doh");
	}

	@Test
	void testUpdateUser() {
		uc.postUser(u3);
		uc.updateUser("TestChange", "ChangePass", "change@email.com");
		List<User> testuc = uc.getUser();
	}

	@Test
	void testDeleteUser() {
		uc.postUser(u3);
		List<User> beforeUc = uc.getUser();
		uc.deleteUser("John Doh");
		List<User> afterUc = uc.getUser();
	}

}
