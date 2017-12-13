package com.soecode.lyf.dao;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.soecode.lyf.entity.Appointment;

import com.soecode.lyf.BaseTest;

public class AppointmentDaoTest extends BaseTest {

	@Autowired
	private AppointmentDao appointmentDao;

	@Test
	public void testInsertAppointment() throws Exception {
		long bookId = 10000;
		long studentId = 12345678910L;
		int insert = appointmentDao.insertAppointment(bookId, studentId);
		System.out.println("insert=" + insert);
		System.out.println("测试成功");
	}

	@Test
	public void testQueryByKeyWithBook() throws Exception {
		long bookId = 10000;
		long studentId = 12345678910L;
		Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
		System.out.println(appointment);
		//System.out.println(appointment.getBook());
	}

}
