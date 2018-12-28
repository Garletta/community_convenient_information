package com.etc.mapper;

import java.util.List;

import com.etc.pojo.Community;

public interface CommunityMapper {
	
	/**
	 * 新增居民信息
	 * @param newResident
	 */
	public abstract void addCommunity(Community newResident);
	
	/**
	 * 通过居民ID删除居民信息
	 * @param oldResidentID
	 */
	public abstract void deleteCommunityById(Integer oldResidentID);
	
	/**
	 * 通过居民ID修改居民信息
	 * @param oldResidentID
	 */
	public abstract void updateCommunityById(Community community);
		
	/**
	 * 查询全部居民信息
	 * @return
	 */
	public abstract List<Community> queryAllCommunities();
	
	/**
	 * 通过居民ID查询居民信息
	 * @param residentID
	 * @return
	 */
	public abstract List<Community> queryCommunityByID(Integer residentID);
	
	/**
	 * 通过居民姓名查询居民信息
	 * @param residentName
	 * @return
	 */
	public abstract List<Community> queryCommunityByName(String residentName);
	
	/**
	 * 通过居民电话号码查询居民信息
	 * @param residentTelephone
	 * @return
	 */
	public abstract List<Community> queryCommunityByTelephone(long residentTelephone);

}
