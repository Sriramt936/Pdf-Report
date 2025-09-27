package com.serviceapi.model.primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "sample")
@Data

public class Sample {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inx_no")
    private int inx_no;
	@Column(name = "ServiceMode")
	private String serviceMode;
	@Column(name = "ServiceMode2")
	private String serviceMode2;
	@Column(name = "servicename")
	private String servicename;
	public int getInx_no() {
		return inx_no;
	}
	public void setInx_no(int inx_no) {
		this.inx_no = inx_no;
	}
	public String getServiceMode() {
		return serviceMode;
	}
	public void setServiceMode(String serviceMode) {
		this.serviceMode = serviceMode;
	}
	public String getServiceMode2() {
		return serviceMode2;
	}
	public void setServiceMode2(String serviceMode2) {
		this.serviceMode2 = serviceMode2;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	@Override
	public String toString() {
		return "Sample [inx_no=" + inx_no + ", serviceMode=" + serviceMode + ", serviceMode2=" + serviceMode2
				+ ", servicename=" + servicename + "]";
	}

}
