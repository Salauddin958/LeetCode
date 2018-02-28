package com.epam.Cache;

public class CacheManagerTest {
	
	public CacheManagerTest() {
		
	}

	public static void main(String[] args) {
		
		CacheManagerTest cacheManagerTest1 = new CacheManagerTest();
		
		String s = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		CachedObject cachedObject = new CachedObject(s, new Long(1234), 1);
		
		CacheManager.putCache(cachedObject);
		
		CachedObject o = (CachedObject) CacheManager.getCache(new Long(1234));
		
		if (o == null) {
			System.out.println("FAILURE");
		}
		else {
			System.out.println("SUCCESS");
		}

	}

}
