package com.etc.mapper;

import java.util.List;

import com.etc.pojo.Community;

public interface CommunityMapper {
	
	/**
	 * ����������Ϣ
	 * @param newResident
	 */
	public abstract void addCommunity(Community newResident);
	
	/**
	 * ͨ������IDɾ��������Ϣ
	 * @param oldResidentID
	 */
	public abstract void deleteCommunityById(Integer oldResidentID);
	
	/**
	 * ͨ������ID�޸ľ�����Ϣ
	 * @param oldResidentID
	 */
	public abstract void updateCommunityById(Community community);
		
	/**
	 * ��ѯȫ��������Ϣ
	 * @return
	 */
	public abstract List<Community> queryAllCommunities();
	
	/**
	 * ͨ������ID��ѯ������Ϣ
	 * @param residentID
	 * @return
	 */
	public abstract List<Community> queryCommunityByID(Integer residentID);
	
	/**
	 * ͨ������������ѯ������Ϣ
	 * @param residentName
	 * @return
	 */
	public abstract List<Community> queryCommunityByName(String residentName);
	
	/**
	 * ͨ������绰�����ѯ������Ϣ
	 * @param residentTelephone
	 * @return
	 */
	public abstract List<Community> queryCommunityByTelephone(long residentTelephone);

}
