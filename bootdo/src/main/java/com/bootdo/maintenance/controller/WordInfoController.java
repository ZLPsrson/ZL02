package com.bootdo.maintenance.controller;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.maintenance.domain.WordInfoDO;
import com.bootdo.maintenance.service.WordInfoService;
import com.bootdo.common.controller.BaseController;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author admin
 * @email admin@163.com
 * @date 2018-08-09 20:27:29
 */
 
@Controller
@RequestMapping("/maintenance/wordInfo")
public class WordInfoController extends BaseController{
	@Autowired
	private WordInfoService wordInfoService;
	
	@GetMapping("{docType}")
	String WordInfo(@PathVariable("docType") String docType,Model model){
		model.addAttribute("docType", docType);
	    return "maintenance/wordInfo/wordInfo";
	}
	
	@ResponseBody
	@GetMapping("/list/{docType}")
	public PageUtils list(@PathVariable("docType") String docType,@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
        if(StringUtils.isNoneBlank(docType)) {
        	query.put("docType", docType);
        }
        
		List<WordInfoDO> wordInfoList = wordInfoService.list(query);
		int total = wordInfoService.count(query);
		PageUtils pageUtils = new PageUtils(wordInfoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	String add(){
	    return "maintenance/wordInfo/add";
	}

	@GetMapping("/edit/{id}")
	String edit(@PathVariable("id") Long id,Model model){
		WordInfoDO wordInfo = wordInfoService.get(id);
		model.addAttribute("wordInfo", wordInfo);
	    return "maintenance/wordInfo/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	public R save( WordInfoDO wordInfo){
		if(wordInfoService.save(wordInfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	public R update( WordInfoDO wordInfo){
		wordInfoService.update(wordInfo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	public R remove( Long id){
		if(wordInfoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	public R remove(@RequestParam("ids[]") Long[] ids){
		wordInfoService.batchRemove(ids);
		return R.ok();
	}
	
}
