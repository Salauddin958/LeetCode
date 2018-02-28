package com.epam.Cache;

public interface Cacheable {
	
	public boolean isExpired();
	public Object getIdentifier();

}
