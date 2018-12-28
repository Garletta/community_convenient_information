package com.etc.pojo;

public class Community {

	private int residentID;			//������
	private String residentName;	//��������
	private String residentAddress;	//����סַ��Ԫ
	private long residentTelephone;	//������ϵ��ʽ
	
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
