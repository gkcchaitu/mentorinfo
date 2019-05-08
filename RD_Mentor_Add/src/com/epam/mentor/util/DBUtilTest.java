package com.epam.mentor.util;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

public class DBUtilTest {

	@Test
	void testGetConnection() {
		Connection con=DBUtil.getConnection();
		assertNotNull(con);
	}

}
