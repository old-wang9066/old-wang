package com.oldwang.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oldwang.account.entity.IncomeDTO;
import com.oldwang.account.mapper.TestMapper;

@RestController
public class HelloController {
	
	@Autowired
	private TestMapper testMapper;
	
	@RequestMapping("hello")
	public IncomeDTO hello () {
		return testMapper.queryIncomeList();
	}
}
