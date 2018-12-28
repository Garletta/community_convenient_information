
package com.etc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etc.pojo.Source;
import com.etc.service.SourceService;

@Controller  // 被spring托管
@RequestMapping(value="/source") // 请求路径
public class SourceController {
	
	// 注入 service
	@Autowired
	private SourceService sourceService;
	
	/**
	 * 跳转新增资源页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/toAddSourceController")
	public String toAddSourceController(Model model) {
		return "addSource";
	}
	
	/**
	 * 新增资源
	 * @param source
	 * @return
	 */
	@RequestMapping(value="/addSourceController")
	public String addSourceController(Source source) {
		sourceService.addSource(source);
		return "redirect:/source/searchSourceController";
	}
	
	/**
	 * 跳转删除资源界面
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/toDeleteSourceController")
	public String toDeleteSourceController(Model model) {
		return "deleteSource";
	}
	
	/**
	 * 通过资源编号删除资源
	 * @param sourceId
	 * @return
	 */
	@RequestMapping(value="/deleteSourceController")
	public String deleteSourceController(@RequestParam(value ="sourceId",required = false,defaultValue = "0") Integer sourceId) {
		sourceService.deleteSourceById(sourceId);
		return "redirect:/source/searchSourceController";
	}
	
	/**
	 * 跳转更新资源界面
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/toUpdateSourceController")
	public String toUpdateSourceController(Model model) {
		return "updateSource";
	}
	
	/**
	 * 通过资源编号更新资源
	 * @param source
	 * @return
	 */
	@RequestMapping(value="/updateSourceController")
	public String updateSourceByIdController(Source source) {
		sourceService.updateSourceById(source);
		return "redirect:/source/searchSourceController";
	}
	
	/**
	 * 查询全部资源信息
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
	 * 通过资源编号查询资源信息
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
	 * 通过资源名查询资源信息
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
