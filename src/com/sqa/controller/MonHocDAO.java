package com.sqa.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sqa.model.MonHoc;
import com.sqa.util.DBConnection;

public class MonHocDAO {

	
	public static ArrayList<MonHoc> cacMonHoc(String svId,String kihocId) throws SQLException {
		ArrayList<MonHoc> monHocList = new ArrayList<>();
		Connection con = DBConnection.createConnection();
		PreparedStatement prepare = con.prepareStatement("select * from monhoc where SinhVienId =? and KiHocId = ?");
		prepare.setString(1, svId);
		prepare.setString(2, kihocId);
		ResultSet rs = prepare.executeQuery();
		while(rs.next()) {
			MonHoc m = new MonHoc();
			m.setId(rs.getString(1));
			m.setMaMonHoc(rs.getNString(3));
			m.setTenMonHoc(rs.getString(4));
			m.setSoTinChi(rs.getInt(5));
			m.setDiemCC(rs.getFloat(6));
			m.setDiemKt(rs.getFloat(7));
			m.setDiemTh(rs.getFloat(8));
			m.setDiemBt(rs.getFloat(9));
			m.setDiemThi(rs.getFloat(10));
			m.setDiemThi(rs.getFloat(11));
			m.setPtCC(rs.getInt(12));
			m.setPtKT(rs.getInt(13));
			m.setPtTH(rs.getInt(14));
			m.setPtBT(rs.getInt(15));
			m.setPtThi(rs.getInt(16));
			m.setDiemTB(rs.getFloat(17));
			m.setKq(rs.getString(18));
			monHocList.add(m);
		}
		
		return monHocList; 

	}
	
	public static int tonTinChi(String svId,String kihocId) throws SQLException {
		int tong = 0;
		Connection con = DBConnection.createConnection();
		PreparedStatement prpStm = con.prepareStatement("select * from monhoc where SinhVienId =? and KiHocId = ?");
		prpStm.setString(1, svId);
		prpStm.setString(2, kihocId);
		ResultSet rs = prpStm.executeQuery();
		while(rs.next()){
			tong = tong + rs.getInt("SoTinChi");
		}
		return tong;
		
	}
	
	public static float tongDiemTB(String svId,String kihocId) throws SQLException{
		float tongDiemTB = 0;
		Connection con = DBConnection.createConnection();
		PreparedStatement prpStm = con.prepareStatement("select * from monhoc where SinhVienId =? and KiHocId = ?");
		prpStm.setString(1, svId);
		prpStm.setString(2, kihocId);
		ResultSet rs = prpStm.executeQuery();
		while(rs.next()){
			tongDiemTB = tongDiemTB + rs.getFloat("DiemTB")*(float)(rs.getInt("SoTinChi"));
		}
		return tongDiemTB;
	}
	
	public static float diemTB(int tc,float tongDiemTB) {
		float diemTB = tongDiemTB / (float)tc;
		return diemTB;
	}
}
