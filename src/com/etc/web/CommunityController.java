package com.etc.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etc.pojo.Community;
import com.etc.service.CommunityService;

@Controller  // ��spring�й�
@RequestMapping(value="/community") // ����·��
public class CommunityController {
	
	// ע�� service
	@Autowired
	private CommunityService communityService;
	
	/**
	 * ��ת����������Ϣ����
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/toAddCommunityController")
	public String toAddCommunityController(Model model) {
		return "addCommunity";
	}
	
	/**
	 * ����������Ϣ
	 * @param community
	 * @return
	 */
	@RequestMapping(value="/addCommunityController")
	public String addCommunityController(Community community) {
		communityService.addCommunity(community);
		return "redirect:/community/searchCommunityController";
	}
	
	/**
	 * ��תɾ��������Ϣ����
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/toDeleteCommunityController")
	public String toDeleteCommunityController(Model model) {
		List<Community> communities = communityService.queryAllCommunities();
		model.addAttribute("communities",communities);
		return "deleteCommunity";
	}
	
	/**
	 * ɾ��������Ϣ
	 * @param residentId
	 * @return
	 */
	@RequestMapping(value="/deleteCommunityController")
	public String deleteCommunityController(@RequestParam(value ="residentId",required = false,defaultValue = "0") Integer residentId) {
		communityService.deleteCommunityById(residentId);
		return "redirect:/community/searchCommunityController";
	}
	
	/**
	 * ��ת�޸ľ�����Ϣ����
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/toUpdateCommunityController")
	public String toUpdateCommunityController(Model model) {
		return "updateCommunity";
	}

	/**
	 * �޸ľ�����Ϣ
	 * @param community
	 * @return
	 */
	@RequestMapping(value="/updateCommunityController")
	public String updateCommunityController(Community community) {
		communityService.updateCommunityById(community);
		return "redirect:/community/searchCommunityController";
	}
	

	/**
	 * ��ѯȫ��������Ϣ
	 * @return
	 */
	@RequestMapping(value="/searchCommunityController")
	public String queryAllCommunitiesController(Model model) {
		List<Community> communities = communityService.queryAllCommunities();
		model.addAttribute("communities",communities);
		return "searchCommunity";
	}
	
	/**
	 * ͨ������ID��ѯ������Ϣ
	 * @return
	 */
	@RequestMapping(value="/searchCommunityByIDController")
	public String queryCommunityByIDController(@RequestParam(value ="residentId",required = false,defaultValue = "0") Integer residentId,Model model) {
		List<Community> communities = communityService.queryCommunityByID(residentId);
		model.addAttribute("communities",communities);
		return "searchCommunity";
	}
	
	/**
	 * ͨ������������ѯ������Ϣ
	 * @return
	 */
	@RequestMapping(value="/searchCommunityByNameController")
	public String queryCommunityByNameController(String residentName,Model model) {
		List<Community> communities = communityService.queryCommunityByName(residentName);
		model.addAttribute("communities",communities);
		return "searchCommunity";
	}
	
	/**
	 * ͨ������绰�����ѯ������Ϣ
	 * @return
	 */
	@RequestMapping(value="/searchCommunityByTelephoneController")
	public String queryCommunityByTelephoneController(@RequestParam(value ="residentTelephone",required = false,defaultValue = "0") long residentTelephone,Model model) {
		List<Community> communities =  communityService.queryCommunityByTelephone(residentTelephone);
		model.addAttribute("communities",communities);
		return "searchCommunity";
	}
	

}
