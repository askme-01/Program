package com.customexception;

public class Book {
private int BookId;
private String BookName;

public Book(int BookId,String BookName)
{
	this.BookId=BookId;
	this.BookName=BookName;
	
}


public int getBookId() {
	return BookId;
}
public void setBookId(int bookId) {
	BookId = bookId;
}
public String getBookName() {
	return BookName;
}
public void setBookName(String bookName) {
	BookName = bookName;
}


}
