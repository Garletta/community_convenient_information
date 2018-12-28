package com.etc.pojo;

public class Community {

	private int residentID;			//居民编号
	private String residentName;	//居民姓名
	private String residentAddress;	//居民住址单元
	private long residentTelephone;	//居民联系方式
	
	public Community() {
		super();
	}

	public Community(int residentID, String residentName, String residentAddress, long residentTelephone) {
		super();
		this.residentID = residentID;
		this.residentName = residentName;
		this.residentAddress = residentAddress;
		this.residentTelephone = residentTelephone;
	}

	public int getResidentID() {
		return residentID;
	}

	public void setResidentID(int residentID) {
		this.residentID = residentID;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getResidentAddress() {
		return residentAddress;
	}

	public void setResidentAddress(String residentAddress) {
		this.residentAddress = residentAddress;
	}

	public long getResidentTelephone() {
		return residentTelephone;
	}

	public void setResidentTelephone(long residentTelephone) {
		this.residentTelephone = residentTelephone;
	}
	
}
