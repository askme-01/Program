package com.customexception;

public interface Service {
public String addBook(Book book) throws InvalidName, DuplicateName, InvalidFields;
}
