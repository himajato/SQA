package com.sqa.test.junit;
import com.sqa.controller.*;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Generated;

import org.junit.Assert;
import org.junit.Test;

import com.sqa.model.MonHoc;
import com.sqa.util.DBConnection;

@Generated(value = "org.junit-tools-1.1.0")
public class MonHocDAOTest {

	private MonHocDAO createTestSubject() {
		return new MonHocDAO();
	}

	//Trường hợp svId và kihocId hợp lệ
	@Test
	public void testCacMonHoc() throws Exception {
		String svId = "1";
		String kihocId = "1";
		ArrayList<MonHoc> expectedList = MonHocDAO.cacMonHoc("1", "1");
		
		ArrayList<MonHoc> result = MonHocDAO.cacMonHoc("1", "1");
		// default test	
		assertEquals(expectedList.size(),result.size());
	}
	//Trường hợp svId không hợp lệ
	@Test
	public void testCacMonHoc1() throws Exception {
		String svId = "0";
		String kihocId = "1";
		ArrayList<MonHoc> expectedList = new ArrayList<>();
		Connection con = DBConnection.createConnection();
		PreparedStatement prepare = con.prepareStatement("select * from monhoc where SinhVienId =? and KiHocId = ?");
		prepare.setString(1, "0");
		prepare.setString(2, "1");
		ResultSet rs = prepare.executeQuery();
		while(rs.next()) {
			MonHoc m = new MonHoc();
			m.setId(rs.getString(1));
			m.setMaMonHoc(rs.getString(3));
			m.setTenMonHoc(rs.getString(4));
			m.setSoTinChi(rs.getInt(5));
			m.setDiemCC(rs.getFloat(6));
			m.setDiemKt(rs.getFloat(7));
			m.setDiemTh(rs.getFloat(8));
			m.setDiemBt(rs.getFloat(9));
			m.setDiemThi(rs.getFloat(10));
			m.setDiemThiL2(rs.getFloat(11));
			m.setPtCC(rs.getInt(12));
			m.setPtKT(rs.getInt(13));
			m.setPtTH(rs.getInt(14));
			m.setPtBT(rs.getInt(15));
			m.setPtThi(rs.getInt(16));
			m.setDiemTB(rs.getFloat(17));
			m.setKq(rs.getString(18));
			expectedList.add(m);
		}
		
		// default test
		ArrayList<MonHoc> result = MonHocDAO.cacMonHoc(svId, kihocId);
		Assert.assertArrayEquals(expectedList.toArray(), result.toArray());
	}
	//Trường hợp kihocId không hợp lệ
		@Test
		public void testCacMonHoc2() throws Exception {
			String svId = "1";
			String kihocId = "0";
			ArrayList<MonHoc> expectedList = new ArrayList<>();
			Connection con = DBConnection.createConnection();
			PreparedStatement prepare = con.prepareStatement("select * from monhoc where SinhVienId =? and KiHocId = ?");
			prepare.setString(1, "1");
			prepare.setString(2, "0");
			ResultSet rs = prepare.executeQuery();
			while(rs.next()) {
				MonHoc m = new MonHoc();
				m.setId(rs.getString(1));
				m.setMaMonHoc(rs.getString(3));
				m.setTenMonHoc(rs.getString(4));
				m.setSoTinChi(rs.getInt(5));
				m.setDiemCC(rs.getFloat(6));
				m.setDiemKt(rs.getFloat(7));
				m.setDiemTh(rs.getFloat(8));
				m.setDiemBt(rs.getFloat(9));
				m.setDiemThi(rs.getFloat(10));
				m.setDiemThiL2(rs.getFloat(11));
				m.setPtCC(rs.getInt(12));
				m.setPtKT(rs.getInt(13));
				m.setPtTH(rs.getInt(14));
				m.setPtBT(rs.getInt(15));
				m.setPtThi(rs.getInt(16));
				m.setDiemTB(rs.getFloat(17));
				m.setKq(rs.getString(18));
				expectedList.add(m);
			}
			
			// default test
			ArrayList<MonHoc> result = MonHocDAO.cacMonHoc(svId, kihocId);
			Assert.assertArrayEquals(expectedList.toArray(), result.toArray());
		}
	
		//Trường hợp svId không hợp lệ
		@Test
		public void testCacMonHoc3() throws Exception {
			String svId = "0";
			String kihocId = "0";
			ArrayList<MonHoc> expectedList = new ArrayList<>();
			Connection con = DBConnection.createConnection();
			PreparedStatement prepare = con.prepareStatement("select * from monhoc where SinhVienId =? and KiHocId = ?");
			prepare.setString(1, "0");
			prepare.setString(2, "0");
			ResultSet rs = prepare.executeQuery();
			while(rs.next()) {
				MonHoc m = new MonHoc();
				m.setId(rs.getString(1));
				m.setMaMonHoc(rs.getString(3));
				m.setTenMonHoc(rs.getString(4));
				m.setSoTinChi(rs.getInt(5));
				m.setDiemCC(rs.getFloat(6));
				m.setDiemKt(rs.getFloat(7));
				m.setDiemTh(rs.getFloat(8));
				m.setDiemBt(rs.getFloat(9));
				m.setDiemThi(rs.getFloat(10));
				m.setDiemThiL2(rs.getFloat(11));
				m.setPtCC(rs.getInt(12));
				m.setPtKT(rs.getInt(13));
				m.setPtTH(rs.getInt(14));
				m.setPtBT(rs.getInt(15));
				m.setPtThi(rs.getInt(16));
				m.setDiemTB(rs.getFloat(17));
				m.setKq(rs.getString(18));
				expectedList.add(m);
			}
			
			// default test
			ArrayList<MonHoc> result = MonHocDAO.cacMonHoc(svId, kihocId);
			Assert.assertArrayEquals(expectedList.toArray(), result.toArray());
		}
	//Trường hợp id sinh viên hợp lệ và kì học id hợp lệ
	@Test
	public void testTongTinChi() throws Exception {
		String svId = "1";
		String kihocId = "1";
		int result;
		int expected = 15;
		// default test
		result = MonHocDAO.tongTinChi(svId, kihocId);
		assertEquals(expected, result);
	}

	//Trường hợp id sinh viên không hợp lệ
	@Test
	public void testTongTinChi1() throws Exception {
		String svId = "0";
		String kihocId = "1";
		int result;
		int expected = 0;
		// default test
		result = MonHocDAO.tongTinChi(svId, kihocId);
		assertEquals(expected, result);
	}
	
	//Trường hợp id kì học không hợp lệ
	@Test
		public void testTongTinChi2() throws Exception {
			String svId = "1";
			String kihocId = "0";
			int result;
			int expected = 0;
			// default test
			result = MonHocDAO.tongTinChi(svId, kihocId);
			assertEquals(expected, result);
		}
	//Trường hợp id kì học và id sinh viên không hợp lệ
	@Test
		public void testTongTinChi3() throws Exception {
			String svId = "0";
			String kihocId = "0";
			int result;
			int expected = 0;
			// default test
			result = MonHocDAO.tongTinChi(svId, kihocId);
			assertEquals(expected, result);
		}
	
	//Trường hợp id sinh viên và id kì học hợp lệ
	@Test
	public void testTongDiemTB() throws Exception {
		String svId = "1";
		String kihocId = "1";
		float result;
		float expected = (float) 91.25;
		// default test
		result = MonHocDAO.tongDiemTB(svId, kihocId);
		assertEquals(expected, result);
	}
	
	//Trường hợp id sinh viên không hợp lệ
		@Test
		public void testTongDiemTB1() throws Exception {
			String svId = "0";
			String kihocId = "1";
			float result;
			float expected = 0;
			// default test
			result = MonHocDAO.tongDiemTB(svId, kihocId);
			assertEquals(expected, result);
		}
	//Trường hợp id kì học không hợp lệ
	@Test
		public void testTongDiemTB2() throws Exception {
			String svId = "1";
			String kihocId = "0";
			float result;
			float expected = 0;
			// default test
			result = MonHocDAO.tongDiemTB(svId, kihocId);
			assertEquals(expected, result);
		}
	//Trường hợp id sinh viên và id kì học không hợp lệ
		@Test
		public void testTongDiemTB3() throws Exception {
			String svId = "0";
			String kihocId = "0";
			float result;
			float expected = 0;
			// default test
			result = MonHocDAO.tongDiemTB(svId, kihocId);
			assertEquals(expected, result);
		}
	//Trường hợp tín chỉ khác 0 và tổng điểm tb khác 0
	@Test
	public void testDiemTB() throws Exception {
		int tc = 2;
		float tongDiemTB = 10;
		float result;
		float expected = 5;
		// default test
		result = MonHocDAO.diemTB(tc, tongDiemTB);
		assertEquals(expected, result);
	}
	//Trường hợp tín chỉ bằng 0 và tổng điểm tb khác 0
	@Test
	public void testDiemTB1() throws Exception {
			int tc = 0;
			float tongDiemTB = 10;
			float result;
			float expected = 0;
			// default test
			result = MonHocDAO.diemTB(tc, tongDiemTB);
			assertEquals(expected, result);
		}
	//Trường hợp tín chỉ bằng 0 và tổng điểm tb khác 0
	@Test
	public void testDiemTB2() throws Exception {
				int tc = 2;
				float tongDiemTB = 0;
				float result;
				float expected = 0;
				// default test
				result = MonHocDAO.diemTB(tc, tongDiemTB);
				assertEquals(expected, result);
			}
}