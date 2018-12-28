package com.etc.mapper;

import java.util.List;

import com.etc.pojo.Source;

public interface SourceMapper {
	
	/**
	 * 新增资源
	 * @param source
	 */
	public abstract void addSource(Source source);
	
	/**
	 * 通过资源Id删除资源
	 * @param sourceId
	 */
	public abstract void deleteSourceById(Integer sourceId);
	
	/**
	 * 通过资源Id更新资源
	 * @param sourceId
	 */
	public abstract void updateSourceById(Source source);
	
	/**
	 * 查询全部资源信息
	 * @return
	 */
	public abstract List<Source> queryAllSources();
	
	/**
	 * 通过资源号查询资源信息
	 * @return
	 */
	public abstract List<Source> querySourceById(Integer sourceId);
	
	/**
	 * 通过资源名查询资源
	 * @return
	 */
	public abstract List<Source> querySourceByName(String sourceName);
	
}
