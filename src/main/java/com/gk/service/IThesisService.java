package com.gk.service;

import java.util.List;

import com.gk.model.Thesis;

public interface IThesisService {
	
	public Long getThesisCount();
	
	public List<Thesis> getThesisList();

}
