package com.se.springbootdemocrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chuyenbay")
public class ChuyenBay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String MaCB;
	@Column(name="Gadi")
	private String GaDi;
	private String GaDen;
	private int DoDai;
	private String GioDi;
	private String GioDen;
	private String ChiPhi;
	public String getMaCB() {
		return MaCB;
	}
	public void setMaCB(String maCB) {
		MaCB = maCB;
	}
	public String getGaDi() {
		return GaDi;
	}
	public void setGaDi(String gaDi) {
		GaDi = gaDi;
	}
	public String getGaDen() {
		return GaDen;
	}
	public void setGaDen(String gaDen) {
		GaDen = gaDen;
	}
	public int getDoDai() {
		return DoDai;
	}
	public void setDoDai(int doDai) {
		DoDai = doDai;
	}
	public String getGioDi() {
		return GioDi;
	}
	public void setGioDi(String gioDi) {
		GioDi = gioDi;
	}
	public String getGioDen() {
		return GioDen;
	}
	public void setGioDen(String gioDen) {
		GioDen = gioDen;
	}
	public String getChiPhi() {
		return ChiPhi;
	}
	public void setChiPhi(String chiPhi) {
		ChiPhi = chiPhi;
	}
	public ChuyenBay(String maCB, String gaDi, String gaDen, int doDai, String gioDi, String gioDen, String chiPhi) {
		super();
		MaCB = maCB;
		GaDi = gaDi;
		GaDen = gaDen;
		DoDai = doDai;
		GioDi = gioDi;
		GioDen = gioDen;
		ChiPhi = chiPhi;
	}
	public ChuyenBay() {
		super();
	}
	@Override
	public String toString() {
		return "ChuyenBay [MaCB=" + MaCB + ", GaDi=" + GaDi + ", GaDen=" + GaDen + ", DoDai=" + DoDai + ", GioDi="
				+ GioDi + ", GioDen=" + GioDen + ", ChiPhi=" + ChiPhi + "]";
	}
	
	
	
}
