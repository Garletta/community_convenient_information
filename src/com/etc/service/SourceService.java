
package com.etc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etc.mapper.SourceMapper;
import com.etc.pojo.Source;

@Service
@Transactional // 事物
public class SourceService {
	
	// 注入mapper
	@Autowired
	private SourceMapper sourceMapper;
	
	/**
	 * 新增资源
	 * @param source
	 */
	public void addSource(Source source) {
		sourceMapper.addSource(source);
	}
	
	/**
	 * 通过资源编号删除资源信息
	 * @param sourceId
	 */
	public void deleteSourceById(int sourceId) {
		sourceMapper.deleteSourceById(sourceId);
	}
	
	/**
	 * 通过资源编号修改资源信息
	 * @param sourceId
	 */
	public void updateSourceById(Source source) {
		sourceMapper.updateSourceById(source);
	}
	
	/**
	 * 查看全部资源信息
	 * @return
	 */
	public List<Source> queryAllSources() {
		return sourceMapper.queryAllSources();
	}
	
	/**
	 * 通过资源编号查看资源信息
	 * @param sourceId
	 * @return
	 */
	public List<Source> querySourceById(Integer sourceId) {
		return sourceMapper.querySourceById(sourceId);
	}
	
	/**
	 * 通过资源名查看资源信息
	 * @param sourceName
	 * @return
	 */
	public List<Source> querySourceByName(String sourceName) {
		return sourceMapper.querySourceByName(sourceName);
	}

}
