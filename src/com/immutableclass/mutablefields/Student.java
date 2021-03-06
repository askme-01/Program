package com.immutableclass.mutablefields;

//why do we need immutable class?
//as immutable class is threadsafe and easy for testing(as value does not change)


public class Student {
private final int StudentId;
private final String StudentName;
private final Address address;
public Student(int studentId, String studentName, Address address) {
	super();
	StudentId = studentId;
	StudentName = studentName;
	this.address = address;
}

@Override
public String toString() {
	return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", address=" + address + "]";
}
public int getStudentId() {
	return StudentId;
}
public String getStudentName() {
	return StudentName;
}
public Address getAddress() {
	return new Address(address);
}




  

}
