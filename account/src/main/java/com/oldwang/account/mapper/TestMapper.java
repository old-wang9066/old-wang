package com.oldwang.account.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.oldwang.account.entity.IncomeDTO;

@Mapper
public interface TestMapper {
	public IncomeDTO queryIncomeList();
}
