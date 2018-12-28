
package com.etc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etc.mapper.SourceMapper;
import com.etc.pojo.Source;

@Service
@Transactional // ����
public class SourceService {
	
	// ע��mapper
	@Autowired
	private SourceMapper sourceMapper;
	
	/**
	 * ������Դ
	 * @param source
	 */
	public void addSource(Source source) {
		sourceMapper.addSource(source);
	}
	
	/**
	 * ͨ����Դ���ɾ����Դ��Ϣ
	 * @param sourceId
	 */
	public void deleteSourceById(int sourceId) {
		sourceMapper.deleteSourceById(sourceId);
	}
	
	/**
	 * ͨ����Դ����޸���Դ��Ϣ
	 * @param sourceId
	 */
	public void updateSourceById(Source source) {
		sourceMapper.updateSourceById(source);
	}
	
	/**
	 * �鿴ȫ����Դ��Ϣ
	 * @return
	 */
	public List<Source> queryAllSources() {
		return sourceMapper.queryAllSources();
	}
	
	/**
	 * ͨ����Դ��Ų鿴��Դ��Ϣ
	 * @param sourceId
	 * @return
	 */
	public List<Source> querySourceById(Integer sourceId) {
		return sourceMapper.querySourceById(sourceId);
	}
	
	/**
	 * ͨ����Դ���鿴��Դ��Ϣ
	 * @param sourceName
	 * @return
	 */
	public List<Source> querySourceByName(String sourceName) {
		return sourceMapper.querySourceByName(sourceName);
	}

}
