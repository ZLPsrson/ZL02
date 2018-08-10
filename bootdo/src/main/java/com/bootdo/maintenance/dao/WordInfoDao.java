package com.bootdo.maintenance.dao;

import com.bootdo.maintenance.domain.WordInfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author admin
 * @email admin@163.com
 * @date 2018-08-09 20:27:29
 */
@Mapper
public interface WordInfoDao {

	WordInfoDO get(Long id);
	
	List<WordInfoDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(WordInfoDO wordInfo);
	
	int update(WordInfoDO wordInfo);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
