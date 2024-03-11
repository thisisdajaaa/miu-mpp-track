package lesson9.prob1.src.dataaccess;

import java.util.HashMap;

import lesson9.prob1.src.business.Book;
import lesson9.prob1.src.business.LibraryMember;

public interface DataAccess { 
	public HashMap<String, Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
}
