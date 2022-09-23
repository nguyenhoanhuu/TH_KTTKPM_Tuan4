package com.se.springbootdemocrud.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maNV", updatable = false, nullable = false)
	private String maNV;
	private String ten;
	private int luong;
//	@OneToMany(fetch = FetchType.LAZY,mappedBy = "chungnhan")
//	private  Set<ChungNhan> listChungNhan = new HashSet<>();
}
