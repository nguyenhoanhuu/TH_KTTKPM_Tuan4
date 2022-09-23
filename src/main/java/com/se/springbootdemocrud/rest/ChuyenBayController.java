package com.se.springbootdemocrud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootdemocrud.dao.ChuyenBayDao;
import com.se.springbootdemocrud.entity.ChuyenBay;

@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayController {
	@Autowired
	private ChuyenBayDao chuyenBayDao;

	
	@GetMapping("/all")
	public List<ChuyenBay> findAll(){
		return chuyenBayDao.getDsChuyenBay();
	}
}
