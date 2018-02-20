package com.epam.Graphs;

import java.util.List;

public class Employee_Importance {
	
	class Employee {
		public int id;
		public int importance;
		public List<Integer> subOrdinates;
	}
	
	public int getImportance(List<Employee> employees, int id) 
	{
		int count=0;
		Employee target = null;
		for(Employee employee : employees)
		{
			if (id == employee.id) {
				target = employee;
				count=target.importance;
				break;
			}
		}
		for (int i = 0; i < target.subOrdinates.size(); i++) {
			count+=getImportance(employees, target.subOrdinates.get(i));
		}
		
		return count;
    }

	public static void main(String[] args) {
		

	}

}
