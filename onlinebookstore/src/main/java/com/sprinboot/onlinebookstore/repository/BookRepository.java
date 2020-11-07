package com.sprinboot.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprinboot.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
