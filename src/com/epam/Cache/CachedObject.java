package com.epam.Cache;

import java.util.Calendar;
import java.util.Date;

public class CachedObject implements Cacheable
{
	
	private Date dateOfExpiration = null;
	private Object Identifier = null;
	
	public Object object=null;
	
	public CachedObject(Object object,Object id,int minutesToLive) 
	{
		this.object=object;
		this.Identifier=id;
		
		if (minutesToLive != 0) 
		{
			dateOfExpiration = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dateOfExpiration);
			calendar.add(Calendar.MINUTE, minutesToLive);
			dateOfExpiration = calendar.getTime();
		}
	}
	
	
	@Override
	public boolean isExpired() 
	{
		if (dateOfExpiration != null) 
		{
			if (dateOfExpiration.before(new Date())) 
			{
				System.out.println("CachedResultSet is Expired : Expired from Cache : "+dateOfExpiration.toString());
				return true;
			}
			else {
				System.out.println("Expired not from Cache ");
				return false;
			}
		}
		else {
			return false;
		}
		
	}

	@Override
	public Object getIdentifier() 
	{
		
		return Identifier;
	}

}
