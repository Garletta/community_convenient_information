package com.etc.pojo;

public class Source {
	
	private int sourceId;		//社区资源号
	private String sourceName;	//资源名称
	private int fitNum;			//容纳人数
	private String openTime;	//开放时间
	
	public Source() {
		super();
	}

	public Source(int sourceId, String sourceName, int fitNum, String openTime) {
		super();
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.fitNum = fitNum;
		this.openTime = openTime;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public int getFitNum() {
		return fitNum;
	}

	public void setFitNum(int fitNum) {
		this.fitNum = fitNum;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	
}
