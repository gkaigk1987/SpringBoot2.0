package com.gk;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gk.mapper.ThesisMapper;
import com.gk.model.Thesis;
import com.gk.model.ThesisExample;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BootTest {
	
	private static Logger logger = LoggerFactory.getLogger(BootTest.class);

	@Autowired
	private ThesisMapper thesisMapper;
	
	@Test
	public void test01() {
		PageHelper.startPage(1, 10);
		List<Thesis> thesisList = thesisMapper.selectByExample(new ThesisExample());
		logger.info("当前获取{}条记录！", thesisList.size());
		PageInfo<Thesis> pageInfo = new PageInfo<>(thesisList);
		logger.info("总共{}条记录!", pageInfo.getTotal());
	}
	
	@Test
	public void test02() {
		Long c = thesisMapper.getThesisCount();
		System.out.println("================================" + c + "=============================");
	}
	
}
