package com.immutableclass.immutablefields;
/*
 * 1.Outer class final
 * 2.private and final variable
 * 3.only getter
 */
public final class Employee {
private final int EmplId;
private final String EmpName;

public Employee(int emplId, String empName) {
	super();
	EmplId = emplId;
	EmpName = empName;
}

@Override
public String toString() {
	return "Employee [EmplId=" + EmplId + ", EmpName=" + EmpName + "]";
}

public int getEmplId() {
	return EmplId;
}

public String getEmpName() {
	return EmpName;
}



}
