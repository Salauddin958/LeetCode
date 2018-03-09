package com.epam.Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Magic_Vowels {
	
	static class ListNode
	{
		int data;
		ListNode next;
		
		public ListNode(int data) 
		{
			this.data=data;
			this.next=null;
		}
	}
	
	
	private static HashMap<Character, ListNode> map = new HashMap<>();
	
	private static void preProcess(String input)
	{
		char[] array = input.toCharArray();
		
		for(int i=0;i<array.length;i++)
		{
			
				if (map.containsKey(array[i])) 
				{
					ListNode node = map.get(array[i]);
					ListNode previous = null;
					ListNode temp = node;
					while(temp != null)
					{
						previous = temp;
						temp = temp.next;
					}
					previous.next = new ListNode(i);
					map.put(array[i], node);
				}
				else {
					ListNode node = new ListNode(i);
					map.put(array[i], node);
				}
			
		}
	}
	
	public static boolean checkMissingVowels()
	{
		if (!map.containsKey('a') || !map.containsKey('e') || !map.containsKey('i') || !map.containsKey('o') || !map.containsKey('u')) 
		{
			return true;
		}
		
		return false;
	}
	
	public static void printMap()
	{
		Iterator<Character> iterator = map.keySet().iterator();
		
		while(iterator.hasNext())
		{
			char ch = iterator.next();
			ListNode head = map.get(ch);
			ListNode temp = head;
			System.out.print(ch +" : ");
			while(temp != null)
			{
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	
	/*public static String mergeLists(String input)
	{
		char[] array = input.toCharArray();
		ListNode[] lists = new ListNode[5];
		
		lists[0] = map.get('a');
		lists[1] = map.get('e');
		lists[2] = map.get('i');
		lists[3] = map.get('o');
		lists[4] = map.get('u');
		
		StringBuilder sb = new StringBuilder();
		PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.data - o2.data;
			}
			
		});
		
		ListNode head = new ListNode(0);
		ListNode p = head;
		
		for(ListNode list: lists){
	        if(list!=null)
	            queue.offer(list);
	    }
		
		while(!queue.isEmpty())
		{
			ListNode n = queue.poll();
			p.next = n;
			p = p.next;
			
			if (n.next != null) 
			{
				queue.offer(n.next);
			}
		}
		ListNode temp = head.next;
		while(temp != null)
		{
			sb.append(array[temp.data]);
			temp = temp.next;
		}
		
		return sb.toString();
	}*/
	
	private static String buildMagicVowels(String input)
	{
		
		char[] array = input.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<>();
		charMap.put('a', 1);
		charMap.put('e', 2);
		charMap.put('i', 3);
		charMap.put('o', 4);
		charMap.put('u', 5);
		int preference = 1;
		String result="";
		for(int i=0;i<array.length;i++)
		{
			StringBuilder sb = new StringBuilder();
			for (int j = i; j <array.length; j++) 
			{
				if (preference <= charMap.get(array[j])) 
				{
					sb.append(array[j]);
					preference = charMap.get(array[j]);
				}
			}
			result = result.length() > sb.toString().length() ? result : sb.toString();
			System.out.println(result);
		}
		
		return result;
	}
	
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		preProcess(input.trim());
		if (checkMissingVowels()) 
		{
			System.out.println(0);
		}
		else 
		{
			String answer = buildMagicVowels((input.trim()));
			System.out.println(answer.length());
		}
		scanner.close();
	
	}

}
