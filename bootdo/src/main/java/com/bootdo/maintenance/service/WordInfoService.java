package com.bootdo.maintenance.service;

import com.bootdo.maintenance.domain.WordInfoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author admin
 * @email admin@163.com
 * @date 2018-08-09 20:27:29
 */
public interface WordInfoService {
	
	WordInfoDO get(Long id);
	
	List<WordInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WordInfoDO wordInfo);
	
	int update(WordInfoDO wordInfo);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
