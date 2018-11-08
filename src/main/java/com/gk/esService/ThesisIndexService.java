package com.gk.esService;

import java.util.List;

import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.xcontent.XContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.gk.mapper.ThesisMapper;
import com.gk.model.Thesis;
import com.gk.model.ThesisExample;

@Service
public class ThesisIndexService {
	
	private static Logger logger = LoggerFactory.getLogger(ThesisIndexService.class);

	@Autowired
	private Client client;
	
	@Autowired
	private ThesisMapper thesisMapper;
	
	public void createThesisIndices() {
//		List<Thesis> thesisList = thesisMapper.selectByExampleWithBLOBs(new ThesisExample());
//		BulkRequestBuilder bulkRequestBuilder = client.prepareBulk();
//		for (Thesis thesis : thesisList) {
//			bulkRequestBuilder.add(client.prepareIndex("es", "thesis").setSource(JSONObject.toJSONString(thesis), XContentType.JSON));
//		}
//		BulkResponse bulkResponse = bulkRequestBuilder.get();
//		logger.info(JSONObject.toJSONString(bulkResponse));
	}
}
