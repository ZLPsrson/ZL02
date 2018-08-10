package com.bootdo.maintenance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.maintenance.dao.WordInfoDao;
import com.bootdo.maintenance.domain.WordInfoDO;
import com.bootdo.maintenance.service.WordInfoService;



@Service
public class WordInfoServiceImpl implements WordInfoService {
	@Autowired
	private WordInfoDao wordInfoDao;
	
	@Override
	public WordInfoDO get(Long id){
		return wordInfoDao.get(id);
	}
	
	@Override
	public List<WordInfoDO> list(Map<String, Object> map){
		return wordInfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wordInfoDao.count(map);
	}
	
	@Override
	public int save(WordInfoDO wordInfo){
		return wordInfoDao.save(wordInfo);
	}
	
	@Override
	public int update(WordInfoDO wordInfo){
		return wordInfoDao.update(wordInfo);
	}
	
	@Override
	public int remove(Long id){
		return wordInfoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return wordInfoDao.batchRemove(ids);
	}
	
}
