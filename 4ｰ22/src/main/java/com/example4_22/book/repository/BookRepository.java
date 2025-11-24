package com.example4_22.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example4_22.book.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
