package com.clonning.deep;

public class Address {
private String city;
private String State;
@Override
public String toString() {
	return "Address [city=" + city + ", State=" + State + "]";
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public Address(String city, String state) {
	super();
	this.city = city;
	State = state;
}


}
