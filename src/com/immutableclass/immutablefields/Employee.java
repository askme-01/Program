package com.immutableclass.immutablefields;

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
