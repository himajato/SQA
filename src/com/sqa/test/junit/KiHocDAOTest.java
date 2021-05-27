package com.sqa.test.junit;
import com.sqa.controller.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class KiHocDAOTest {

	private KiHocDAO createTestSubject() {
		return new KiHocDAO();
	}

	//Trường hợp mã kì học hợp lệ
	@Test
	public void testGetId1() throws Exception {
		String makihoc = "20182";
		String result ;
		String expected = "1";
		// default test
		result = KiHocDAO.getId(makihoc);
		assertEquals(expected, result);
	}
	
	//Trường hợp mã kì học không hợp lệ
	@Test
	public void testGetId2() throws Exception {
		String makihoc = "20183";
		String result ;
		String expected = "";
		// default test
		result = KiHocDAO.getId(makihoc);
		assertEquals(expected, result);
	}
	
}