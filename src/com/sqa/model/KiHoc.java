package com.sqa.model;

import java.io.Serializable;

public class KiHoc implements Serializable {
	public int kihocId;
	public String maKihoc;
	public int getKihocId() {
		return kihocId;
	}
	public void setKihocId(int kihocId) {
		this.kihocId = kihocId;
	}
	public String getMaKihoc() {
		return maKihoc;
	}
	public void setMaKihoc(String maKihoc) {
		this.maKihoc = maKihoc;
	}
	public KiHoc() {
		
	}
	
	
}
