package com.wxr.test;


import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import com.opensymphony.xwork2.ActionSupport;

public class TestCache1 extends ActionSupport {
	
	public String addCache(){
		CacheManager cacheManager=CacheManager.create("ehcache.xml");
		Cache cache=cacheManager.getCache("sampleCache1");
		Element element=new Element("15293633855","533977");
		cache.put(element);
		return "addCache";
	}
}
