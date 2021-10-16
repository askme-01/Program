package com.entryset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class GetCompany {

	public static void main(String[] args) {
		
		HashMap<String, List<Employee>> company = new HashMap<String, List<Employee>>();
		List<Employee> emp1 = new ArrayList<Employee>();
		emp1.add(new Employee(101, "Roshan", 83456));
		emp1.add(new Employee(102, "Akshay", 83456));
		emp1.add(new Employee(106, "XXXX", 4758));

		List<Employee> emp2 = new ArrayList<Employee>();
		emp2.add(new Employee(105, "YYYY", 61456));
		emp2.add(new Employee(104, "ZZZZ", 34565));
		emp2.add(new Employee(103, "AAAA", 15456));

		List<Employee> emp3 = new ArrayList<Employee>();
		emp3.add(new Employee(105, "XXXX", 8456));
		emp3.add(new Employee(104, "CCCC", 3456));
		emp3.add(new Employee(103, "AAAA", 25456));

		company.put("TechMahindra", emp1);
		company.put("Infosys", emp2);
		company.put("TCS", emp3);
		
		HashMap<String, List<Employee>> comp = getCompanyBasedOnEmployee(company,"Roshan");
		System.out.println(comp);
		HashMap<String, List<Employee>> comp1 = getCompanyBasedOnEmployee(company,"ZZZZ");
		System.out.println(comp1);
	}
	
	public static HashMap<String, List<Employee>> getCompanyBasedOnEmployee(HashMap<String, List<Employee>> company, String empName) {
		HashMap<String, List<Employee>> resultList = new HashMap<String, List<Employee>>();
		Set<Entry<String, List<Employee>>> setOfEntries  = company.entrySet();
		Iterator<Entry<String, List<Employee>>> setIter = setOfEntries.iterator();
		while(setIter.hasNext()) { 
			
			List<Employee> compEmpList = new ArrayList<Employee>(); 
			
		 	Entry<String,List<Employee>> entry = setIter.next();
			List<Employee> emps = entry.getValue();
			for(Employee employee : emps) {
				if(employee.getEmpName().equals(empName)) {
					compEmpList.add(employee);
				}
			}
			resultList.put(entry.getKey(), compEmpList);
		}
		return resultList;
	}

}
