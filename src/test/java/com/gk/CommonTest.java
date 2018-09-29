package com.gk;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.gk.model.User;

public class CommonTest {
	
	private Client client;
	
	@SuppressWarnings({ "resource"})
	@Before
	public void getClient() {
		try {
			//注：此处的port修改成9300，如果集群名不是默认的elasticsearch，则需要设置Settings
			Settings settings = Settings.builder()
			        .put("cluster.name", "cluster").build();
			client = new PreBuiltTransportClient(settings).addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"),9300));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void close() {
		client.close();
	}
	
	@Test
	public void testgk() {
		User user = new User();
		user.setId(1L);
		user.setAge(31);
		user.setName("高凯");
		String jsonString = JSONObject.toJSONString(user);
		IndexResponse indexResponse = client.prepareIndex("user", "user").setSource(jsonString,XContentType.JSON).get();
		System.out.println(JSONObject.toJSONString(indexResponse));
	}
	
}
