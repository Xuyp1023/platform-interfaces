package com.betterjr.modules.test;

import java.util.Map;

public interface IDemoService {
    
	public String webQueryEntity(Map<String,String> guestMap,String name);
	
	public void webAddEntity(Map<String,String> guestMap,String name);
}
