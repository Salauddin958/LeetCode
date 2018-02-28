package com.epam.Cache;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CacheManager {
	
	private static HashMap cacheHashMap = new HashMap<>();
	static int milliSecondSleepTime = 5000;
	
	private static Object lock = new Object();
	
	static {
		try 
		{
			Thread threadCleanerUpper = new Thread(new Runnable() {
				
				
				
				@Override
				public void run() 
				{
					try 
					{
						while(true)
						{
							System.out.println("threadCleanerUpper scanning for Objects ");
							HashSet keySet = (HashSet) cacheHashMap.keySet();
							
							Iterator keys = keySet.iterator();
							
							while(keys.hasNext())
							{
								Object key = keys.next();
								Cacheable value = (Cacheable) cacheHashMap.get(key);
								if (value.isExpired()) 
								{
									cacheHashMap.remove(key);
									System.out.println("threadCleanerUpper running and removed an Expired Key");
								}
								Thread.sleep(milliSecondSleepTime);
							}
						}
					} catch (Exception e) {
						
					}
					
				}
			});
			threadCleanerUpper.setPriority(Thread.MIN_PRIORITY);
			threadCleanerUpper.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public CacheManager() 
	{
		
	}
	
	public static void putCache(Cacheable object)
	{
		System.out.println("put");
		cacheHashMap.put(object.getIdentifier(), object);
	}
	
	public static Cacheable getCache(Object identifier)
	{
		System.out.println("get");
		synchronized (lock) 
		{
			
			Cacheable object = (Cacheable) cacheHashMap.get(identifier);
			System.out.println("inside " +object);
			if (object == null) {
				return null;
			}
			if (object.isExpired()) {
				cacheHashMap.remove(identifier);
				return null;
			}
			else {
				return object;
			}
		}
		
	}

}
