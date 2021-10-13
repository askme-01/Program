package com.customexception;

public class ServiceImpl implements Service {

	private static Object[] Books= {
			new Book(1, "akshay"),new Book(2, "nakul"),new Book(3, "rahul"),
			
	};
	
	@Override
	public String addBook(Book book) throws InvalidName, DuplicateName, InvalidFields {
		if(book==null) {
			throw new InvalidName("Invalid Name");
		}
		else if(book.getBookName()==null || book.getBookName().length()<=1 || book.getBookId()<=0) {
			throw new InvalidFields("INVALID_BOOK_FIELDS");
		}
		return null;
	}
	
	



}
