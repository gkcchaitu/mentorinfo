package com.epam.mentor.service;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.epam.mentor.bean.MentorBean;
import com.epam.mentor.util.DBUtil;

class MentorServiceTest {

	static MentorService ms;
	@BeforeAll
	static void instantiation()
	{
		ms = new MentorService();
	}
	
	@Test
	void test() throws ParseException, SQLException {
		String s="12-11-2019";
		SimpleDateFormat sdf=new SimpleDateFormat("MM-DD-YYYY");
		Date d=sdf.parse(s);
		MentorBean mb = new MentorBean();
		mb.setName("chaitu");
		mb.setEmail(null);
		mb.setMaxNoOfMentees(5); 
		mb.setMentorEndDate(d);
		mb.setMentorStartDate(d);
		mb.setStatus("Active");
		mb.setTechnologyStream("cse");
		assertEquals("success",ms.addMentor(mb));
	}
	
	
	
	
}
