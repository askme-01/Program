package com.entryset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Company {

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

		System.out.println(company +"\n");
		
// Find Unique Employee names irrespective of Company
		Collection<List<Employee>> allEmpData = company.values();
		List<Employee> allEmps = new ArrayList<Employee>();
		Iterator<List<Employee>> allDataIter = allEmpData.iterator();
		while (allDataIter.hasNext()) {
			List<Employee> emps = allDataIter.next();
			allEmps.addAll(emps);
		}
		//System.out.println(allEmps);
		
		Set<String> uniqueEmpNames = new HashSet<String>();
		for(Employee employee : allEmps) {
			boolean flag = uniqueEmpNames.add(employee.getEmpName());
			if(flag==true) {
				System.out.println(employee);
			}
		} 
		System.out.println("--------------------------------------------------");
		
//find out emps--> with company name --.whose salary is > amount
		Set<Entry<String, List<Employee>>> setOfEntries = company.entrySet();
		Iterator<Entry<String, List<Employee>>> setIter = setOfEntries.iterator();
		while(setIter.hasNext()) {
			Entry<String, List<Employee>> entry = setIter.next();
			System.out.println("Company Name :" +entry.getKey());
			List<Employee> emps = entry.getValue();
			for(Employee employee : emps) {
				if(employee.getSalary()>20000) {
				System.out.println("Employee Details :" +employee);
				}
			} 
			System.out.println("---------------------------------------------------");
		}
		
// Get value using key
		Set<String> companyNames = company.keySet();
		Iterator<String> compIter = companyNames.iterator();
		while(compIter.hasNext()) {
			String comp = compIter.next();
			if(comp.equals("TechMahindra") || comp.equals("TCS")) {
				System.out.println("-------------"+comp +"----------------"	);
				List<Employee> emps = company.get(comp);
				System.out.println(emps);
			}
		}
	}
}
