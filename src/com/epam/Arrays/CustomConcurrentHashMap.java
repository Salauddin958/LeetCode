package com.epam.Arrays;

import java.util.Map;

public class CustomConcurrentHashMap {
	
	protected final class Segment {
		protected int count;
		
		protected synchronized int getCount()
		{
			return count;
		}
		protected synchronized void synch()
		{
			
		}
		public final Segment[] segments = new Segment[32];
	}
	
	static class Entry implements Map.Entry {
		
		
		protected final Object key;
		protected volatile Object value;
		protected final int hash;
		protected final Entry next;
		
		public Entry(int hash,Object key,Object value,Entry next) 
		{
			this.hash=hash;
			this.key=key;
			this.value = value;
			this.next = next;
		}

		@Override
		public Object getKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object setValue(Object arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	protected transient Entry[] table;
	
	public	CustomConcurrentHashMap(int initialCapacity,float loadFactor)
	{
		int capacity = 100;
		this.table = newTable(capacity);
		
	}
	
	protected Entry[] newTable(int capacity) 
	{
		return new Entry[capacity];
	}

	public static void main(String[] args) {
		

	}

}
