package com.etc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etc.mapper.CommunityMapper;
import com.etc.pojo.Community;

@Service
@Transactional // ����
public class CommunityService {

	// ע��mapper
	@Autowired
	private CommunityMapper communityMapper;
	
	/**
	 * ����������Ϣ
	 * @param newResident
	 */
	public void addCommunity(Community newResident) {
		communityMapper.addCommunity(newResident);
	}
	
	/**
	 * ͨ������IDɾ��������Ϣ
	 * @param oldResidentID
	 */
	public void deleteCommunityById(Integer oldResidentID) {
		communityMapper.deleteCommunityById(oldResidentID);
	}
	
	/**
	 * ͨ������ID�޸ľ�����Ϣ
	 * @param oldResidentID
	 */
	public void updateCommunityById(Community oldResident) {
		communityMapper.updateCommunityById(oldResident);
	}
	
	/**
	 * ��ѯȫ��������Ϣ
	 * @return
	 */
	public List<Community> queryAllCommunities() {
		return communityMapper.queryAllCommunities();
	}
	
	/**
	 * ͨ������ID��ѯ������Ϣ
	 * @param residentID
	 * @return
	 */
	public List<Community> queryCommunityByID(Integer residentId) {
		return communityMapper.queryCommunityByID(residentId);
	}
	
	/**
	 * ͨ������������ѯ������Ϣ
	 * @param residentName
	 * @return
	 */
	public List<Community> queryCommunityByName(String residentName) {
		return communityMapper.queryCommunityByName(residentName);
	}
	
	/**
	 * ͨ������绰�����ѯ������Ϣ
	 * @param residentTelephone
	 * @return
	 */
	public List<Community> queryCommunityByTelephone(long residentTelephone) {
		return communityMapper.queryCommunityByTelephone(residentTelephone);
	}
}
