package com.sqa.test.junit;
import com.sqa.controller.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class SinhVienDAOTest {

	private SinhVienDAO createTestSubject() {
		return new SinhVienDAO();
	}

	//Trường hợp mã sinh viên hợp lệ
	@Test
	public void testGetNganh() throws Exception {
		String masv = "B17DCCN462";
		String result;
		String expected = "Công nghệ phần mềm";
		// default test 1
		result = SinhVienDAO.getNganh(masv);
		assertEquals(expected, result);
	}
	//Trường hợp mã sinh không viên hợp lệ
	@Test
	public void testGetNganh1() throws Exception {
		String masv = "B17DCCN4622";
		String result;
		String expected = "";
		// default test 1
		result = SinhVienDAO.getNganh(masv);
		assertEquals(expected, result);
	}

	//Trường hợp id sinh viên hợp lệ
	@Test
	public void testGetId() throws Exception {
		String masv = "B17DCCN462";
		String result;
		String expected = "1";
		// default test
		result = SinhVienDAO.getId(masv);
		assertEquals(expected, result);
		
	}

	//Trường hợp mã sinh viên không hợp lệ
	@Test
	public void testGetId1() throws Exception {
		String masv = "B17DCCO000";
		String result;
		String expected = "";
		// default test
		result = SinhVienDAO.getId(masv);
		assertEquals(expected, result);
		
	}
	//Trường hợp mã sinh viên hợp lệ
	@Test
	public void testGetHoTen() throws Exception {
		String masv = "B17DCCN729";
		String result;
		String expected = "Nguyễn Văn Nghĩa";
		// default test
		result = SinhVienDAO.getHoTen(masv);
		assertEquals(expected, result);
	}
	//Trường hợp mã sinh viên không hợp lệ
	@Test
	public void testGetHoTen1() throws Exception {
		String masv = "B17DCCN722";
		String result;
		String expected = "";
		// default test
		result = SinhVienDAO.getHoTen(masv);
		assertEquals(expected, result);
	}
	//Trường hợp mã sinh viên hợp lệ
	@Test
	public void testGetLopChuyenNganh() throws Exception {
		String masv = "B17DCCN481";
		String result;
		String expected = "CNPM01";
		// default test
		result = SinhVienDAO.getLopChuyenNganh(masv);
		assertEquals(expected, result);
	}

	//Trường hợp mã sinh viên không hợp lệ
	@Test
	public void testGetLopChuyenNganh1() throws Exception {
		String masv = "ABCDEF1234";
		String result;
		String expected = "";
		// default test
		result = SinhVienDAO.getLopChuyenNganh(masv);
		assertEquals(expected, result);
	}
	
	//Trường hợp mã sinh viên hợp lệ
	@Test
	public void testGetKhoaHoc() throws Exception {
		String masv = "B17DCCN471";
		String result;
		String expected = "2017-2022";
		// default test
		result = SinhVienDAO.getKhoaHoc(masv);
		assertEquals(expected, result);
	}
	//Trường hợp mã sinh viên không hợp lệ
	@Test
	public void testGetKhoaHoc1() throws Exception {
		String masv = "123456789";
		String result;
		String expected = "";
		// default test
		result = SinhVienDAO.getKhoaHoc(masv);
		assertEquals(expected, result);
	}
}