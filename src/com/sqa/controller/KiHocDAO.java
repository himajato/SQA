package com.sqa.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sqa.util.DBConnection;

public class KiHocDAO {
	public static String getId(String makihoc) throws SQLException {
		String kiHocId = "";
		Connection con = DBConnection.createConnection();
		PreparedStatement prepare = con.prepareStatement("select Id from kihoc where MaKiHoc = ?");
		prepare.setString(1, makihoc);
		ResultSet rs = prepare.executeQuery();
		while(rs.next()) {
			kiHocId = rs.getString("Id");
			
		}
		return kiHocId;
	}
}
