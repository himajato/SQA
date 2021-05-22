package com.sqa.model;

public class SinhVien {
	public int sinhVienId;
	public String tenSinhVien;
	
	public SinhVien(int sinhVienId,String tenSinhVien) {
		this.sinhVienId = sinhVienId;
		this.tenSinhVien = tenSinhVien;
	}
	
	public int getSinhVienId() {
		return sinhVienId;
	}
	public void setSinhVienId(int sinhVienId) {
		this.sinhVienId = sinhVienId;
	}
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	
}
