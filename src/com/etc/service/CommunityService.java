package com.etc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etc.mapper.CommunityMapper;
import com.etc.pojo.Community;

@Service
@Transactional // 事物
public class CommunityService {

	// 注入mapper
	@Autowired
	private CommunityMapper communityMapper;
	
	/**
	 * 新增居民信息
	 * @param newResident
	 */
	public void addCommunity(Community newResident) {
		communityMapper.addCommunity(newResident);
	}
	
	/**
	 * 通过居民ID删除居民信息
	 * @param oldResidentID
	 */
	public void deleteCommunityById(Integer oldResidentID) {
		communityMapper.deleteCommunityById(oldResidentID);
	}
	
	/**
	 * 通过居民ID修改居民信息
	 * @param oldResidentID
	 */
	public void updateCommunityById(Community oldResident) {
		communityMapper.updateCommunityById(oldResident);
	}
	
	/**
	 * 查询全部居民信息
	 * @return
	 */
	public List<Community> queryAllCommunities() {
		return communityMapper.queryAllCommunities();
	}
	
	/**
	 * 通过居民ID查询居民信息
	 * @param residentID
	 * @return
	 */
	public List<Community> queryCommunityByID(Integer residentId) {
		return communityMapper.queryCommunityByID(residentId);
	}
	
	/**
	 * 通过居民姓名查询居民信息
	 * @param residentName
	 * @return
	 */
	public List<Community> queryCommunityByName(String residentName) {
		return communityMapper.queryCommunityByName(residentName);
	}
	
	/**
	 * 通过居民电话号码查询居民信息
	 * @param residentTelephone
	 * @return
	 */
	public List<Community> queryCommunityByTelephone(long residentTelephone) {
		return communityMapper.queryCommunityByTelephone(residentTelephone);
	}
}
