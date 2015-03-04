package com.wxr.test;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import com.opensymphony.xwork2.ActionSupport;

public class TestCache2 extends ActionSupport {

	public String getCache(){
		CacheManager cacheManager=CacheManager.create("ehcache.xml");
		Cache cache=cacheManager.getCache("sampleCache1");
		Element element=cache.get("15293633855");
		System.out.println("-----------------"+element+"=======");
		return "getCache";
	}
}
