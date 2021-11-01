package com.fiserv.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiserv.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}