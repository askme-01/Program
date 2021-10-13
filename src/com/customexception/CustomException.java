package com.customexception;

class InvalidName extends Exception {
public InvalidName(String msg)
{
	super(msg);
}
}

class DuplicateName extends Exception {
	public DuplicateName(String msg) {
		super(msg);
	}
}

class InvalidFields extends Exception {
	public InvalidFields(String msg) {
		super(msg);
	}
}

