
package com.etc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etc.pojo.Source;
import com.etc.service.SourceService;

@Controller  // ��spring�й�
@RequestMapping(value="/source") // ����·��
public class SourceController {
	
	// ע�� service
	@Autowired
	private SourceService sourceService;
	
	/**
	 * ��ת������Դҳ��
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/toAddSourceController")
	public String toAddSourceController(Model model) {
		return "addSource";
	}
	
	/**
	 * ������Դ
	 * @param source
	 * @return
	 */
	@RequestMapping(value="/addSourceController")
	public String addSourceController(Source source) {
		sourceService.addSource(source);
		return "redirect:/source/searchSourceController";
	}
	
	/**
	 * ��תɾ����Դ����
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/toDeleteSourceController")
	public String toDeleteSourceController(Model model) {
		return "deleteSource";
	}
	
	/**
	 * ͨ����Դ���ɾ����Դ
	 * @param sourceId
	 * @return
	 */
	@RequestMapping(value="/deleteSourceController")
	public String deleteSourceController(@RequestParam(value ="sourceId",required = false,defaultValue = "0") Integer sourceId) {
		sourceService.deleteSourceById(sourceId);
		return "redirect:/source/searchSourceController";
	}
	
	/**
	 * ��ת������Դ����
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/toUpdateSourceController")
	public String toUpdateSourceController(Model model) {
		return "updateSource";
	}
	
	/**
	 * ͨ����Դ��Ÿ�����Դ
	 * @param source
	 * @return
	 */
	@RequestMapping(value="/updateSourceController")
	public String updateSourceByIdController(Source source) {
		sourceService.updateSourceById(source);
		return "redirect:/source/searchSourceController";
	}
	
	/**
	 * ��ѯȫ����Դ��Ϣ
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/searchSourceController")
	public String queryAllSourcesController(Model model) {
		List<Source> sources = sourceService.queryAllSources();
		model.addAttribute("sources", sources);
		return "searchSource";
	}
	
	/**
	 * ͨ����Դ��Ų�ѯ��Դ��Ϣ
	 * @param sourceId
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/querySourceByIdController")
	public String querySourceByIdController(@RequestParam(value ="sourceId",required = false,defaultValue = "0") Integer sourceId,Model model) {
		List<Source> sources = sourceService.querySourceById(sourceId);
		model.addAttribute("sources", sources);
		return "searchSource";
	}
	
	/**
	 * ͨ����Դ����ѯ��Դ��Ϣ
	 * @param sourceName
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/querySourceByNameController")
	public String querySourceByNameController(String sourceName,Model model) {
		List<Source> sources = sourceService.querySourceByName(sourceName);
		model.addAttribute("sources", sources);
		return "searchSource";
	}
	
}
