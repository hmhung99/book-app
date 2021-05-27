package com.bookapp.repositories.specifications;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.bookapp.models.Book;

@StaticMetamodel(Book.class)
public class Book_ {
	public static volatile SingularAttribute<Book, String> name;
	public static final String NAME = "name";
}
