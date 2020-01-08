package com.oldwang.account.entity;

import java.io.Serializable;

/**
 * @Description: 
 * @author: wamgbo
 * @date: 2020年1月8日
 */
public class IncomeDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private Integer incomeMoney;
	
	private String incomeTime;
	
	private String incomeType;
	
	private String createTime;
	
	private String updateTime;
	
	private String remark;
	
	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getIncomeMoney() {
		return incomeMoney;
	}

	public void setIncomeMoney(Integer incomeMoney) {
		this.incomeMoney = incomeMoney;
	}

	public String getIncomeTime() {
		return incomeTime;
	}

	public void setIncomeTime(String incomeTime) {
		this.incomeTime = incomeTime;
	}

	public String getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUdpateTime() {
		return updateTime;
	}

	public void setUdpateTime(String udpateTime) {
		this.updateTime = udpateTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatue() {
		return status;
	}

	public void setStatue(String statue) {
		this.status = statue;
	}

	@Override
	public String toString() {
		return "IncomeDTO [id=" + id + ", incomeMoney=" + incomeMoney + ", incomeTime=" + incomeTime + ", incomeType="
				+ incomeType + ", createTime=" + createTime + ", udpateTime=" + updateTime + ", remark=" + remark
				+ ", statue=" + status + "]";
	}
	
}
