package com.sqa.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sqa.util.DBConnection;

public class SinhVienDAO {
	public static String getId(String masv) throws SQLException {
		String svId = "";
		Connection con = DBConnection.createConnection();
		PreparedStatement prepare = con.prepareStatement("select Id from sinhvien where MaSV = ?");
		prepare.setString(1, masv);
		ResultSet rs = prepare.executeQuery();
		while(rs.next()) {
			svId = rs.getString("Id");
			
		}
		return svId;
	}
	
	public static String getHoTen(String masv) throws SQLException {
		String hoTen = "";
		Connection con = DBConnection.createConnection();
		PreparedStatement prepare = con.prepareStatement("select HoTen from sinhvien where MaSV = ?");
		prepare.setString(1, masv);
		ResultSet rs = prepare.executeQuery();
		while(rs.next()) {
			hoTen = rs.getString("HoTen");
			
		}
		return hoTen;
	}
	
	public static String getLopChuyenNganh(String masv) throws SQLException {
		String lop = "";
		Connection con = DBConnection.createConnection();
		PreparedStatement prepare = con.prepareStatement("select LopChuyenNganh from sinhvien where MaSV = ?");
		prepare.setString(1, masv);
		ResultSet rs = prepare.executeQuery();
		while(rs.next()) {
			lop = rs.getString("LopChuyenNganh");
		}
		return lop;
	}
	
	public static String getNganh(String masv) throws SQLException {
		String nganh = "";
		Connection con = DBConnection.createConnection();
		PreparedStatement prepare = con.prepareStatement("select Nganh from sinhvien where MaSV = ?");
		prepare.setString(1, masv);
		ResultSet rs = prepare.executeQuery();
		while(rs.next()) {
			nganh = rs.getString("Nganh");
		}
		return nganh;
	}
	
	public static String getKhoaHoc(String masv) throws SQLException {
		String khoaHoc = "";
		Connection con = DBConnection.createConnection();
		PreparedStatement prepare = con.prepareStatement("select KhoaHoc from sinhvien where MaSV = ?");
		prepare.setString(1, masv);
		ResultSet rs = prepare.executeQuery();
		while(rs.next()) {
			khoaHoc = rs.getString("KhoaHoc");
		}
		return khoaHoc;
	}
}
