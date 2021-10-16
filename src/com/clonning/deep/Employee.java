package com.clonning.deep;

// why we need cloning?
// as object creation is costly and if the object is heavy weight(means we are creating object of subclass)
// so the 3.step of scanning static field and allocation of memory etc and 4.step while creating object i.e scanning instance field ..memory allocation etc
// but in clone only 1 step is need once object is created as we are doing cloning.

public class Employee implements Cloneable {
	private int id;
	private String name;
	private int age;
	private Address address;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public Employee(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	};

	@Override
	protected Object clone() throws CloneNotSupportedException {
//      only when address class implements Cloneable
//		Employee clonnedempl =(Address)super.clone();
//		Employee clonnedAdr=(Employee)clonnedempl.address.clone();
//		clonnedempl.setAddress(clonnedAdr);
//		return clonnedempl;

		Employee employee = (Employee) super.clone();
		employee.setAddress(new Address(getAddress().getCity(), getAddress().getState()));
		return employee;
	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
		Address ad = new Address("chiplun", "maharashtra");
		Employee emp = new Employee(101, "akshay", 27, ad);

		// cloned object
		Object clone = emp.clone();
		Employee emp1 = (Employee) clone;
		emp1.setName("roshan");
		emp1.getAddress().setCity("pune");

		System.out.println("Original object");
		System.out.println(emp);
		System.out.println("Duplicate object");
		System.out.println(emp1);
	}

}
