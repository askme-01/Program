package com.hashcodeandequal;

public class Student {

	private int Id;
	private String Name;

	public Student(int id, String name) {
		super();
		Id = id;
		Name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Student) {
			Student other = (Student) obj;
			if (other.Id == this.Id && other.Name.equals(this.Name)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + Id;
		return result;

	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + "]";
	}

	public static void main(String[] args) {
		Student st = new Student(1, "akshay");
		Student st1 = new Student(1, "akshay");
		System.out.println(st.equals(st1));
	}

}
