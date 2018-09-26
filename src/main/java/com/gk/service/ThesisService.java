package com.gk.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.mapper.ThesisMapper;

@Service
public class ThesisService implements IThesisService {
	
	private static Logger logger = LoggerFactory.getLogger(ThesisService.class);
	
	@Autowired
	private ThesisMapper thesisMapper;

	@Override
	public Long getThesisCount() {
		Long count = thesisMapper.getThesisCount();
		logger.info("论文总数为{}条",count);
		return count;
	}

}
