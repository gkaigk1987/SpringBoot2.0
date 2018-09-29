package com.gk.elasticsearch;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticSearchConfiguration {
	
	private static Logger logger = LoggerFactory.getLogger(ElasticSearchConfiguration.class);
	
	@Value("${es.host}")
	private String host;
	
	@Value("${es.port}")
	private Integer port;
	
//	private TransportClient client;
	@Bean
	public Client client() {
		//注：此处的port修改成9300，如果集群名不是默认的elasticsearch，则需要设置Settings
		Settings settings = Settings.builder()
				.put("cluster.name", "cluster").build();
		TransportClient client = new PreBuiltTransportClient(settings);
		try {
			client.addTransportAddress(new TransportAddress(InetAddress.getByName(host),port));
		} catch (UnknownHostException e) {
			logger.error("ElasticSearch create client error!!",e);
			e.printStackTrace();
		}
		return client;
	}
	
//	public void close() {
//		if(null != client) {
//			client.close();
//		}
//	}
}
