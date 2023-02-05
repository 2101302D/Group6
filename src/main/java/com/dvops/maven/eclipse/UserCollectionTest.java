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
	private final int USER_COLLECTION_SIZE = 3;
	
	@BeforeEach
	void setUp() throws Exception {
		uc = new UserCollection();
		u1 = new User("yes","yes","yes@gmail.com");
		u2 = new User("no","no","no@gmail.com");
		u3 = new User("yesnt","yesnt","yesnt@gmail.com");
		
		uc.addUser(u1);
		uc.addUser(u2);
		uc.addUser(u3);
	}
	@Test
	void testAddUser(){
		uc.addUser(u1);
        List<User> testUc = uc.getUser();
	}
	@Test
	void testGetUser() {
		List<User> testUc = uc.getUser();
	}
	@Test
	void testGetByName() {
		User testUc = uc.getByName("yes");
	}
	@Test
	void testUpdateUser() {
		uc.addUser(u3);
		uc.updateUser("Change", "Change", "change@email.com");
		List<User> testuc = uc.getUser();
	}
	@Test
	void testDeleteUser() {
		uc.addUser(u3);
		List<User> beforeUc = uc.getUser();
		uc.deleteUser("yes");
		List<User> afterUc = uc.getUser();
	}
}
