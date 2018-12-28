package com.etc.mapper;

import java.util.List;

import com.etc.pojo.Source;

public interface SourceMapper {
	
	/**
	 * ������Դ
	 * @param source
	 */
	public abstract void addSource(Source source);
	
	/**
	 * ͨ����ԴIdɾ����Դ
	 * @param sourceId
	 */
	public abstract void deleteSourceById(Integer sourceId);
	
	/**
	 * ͨ����ԴId������Դ
	 * @param sourceId
	 */
	public abstract void updateSourceById(Source source);
	
	/**
	 * ��ѯȫ����Դ��Ϣ
	 * @return
	 */
	public abstract List<Source> queryAllSources();
	
	/**
	 * ͨ����Դ�Ų�ѯ��Դ��Ϣ
	 * @return
	 */
	public abstract List<Source> querySourceById(Integer sourceId);
	
	/**
	 * ͨ����Դ����ѯ��Դ
	 * @return
	 */
	public abstract List<Source> querySourceByName(String sourceName);
	
}
